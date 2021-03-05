package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadEmployeeServiceImpl implements ReadEmployeeService{
    @Override
    public List<Employee> readEmployeeData() {
        List<Employee> employeeList = new ArrayList<>();
        String line = "";
        String splitBy = ",";

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("employee.csv"));
            while ((line = br.readLine()) != null)
            {
                String[] employee = line.split(splitBy);
                Employee tempEmp = new Employee(Integer.parseInt(employee[0]), employee[1]);
                employeeList.add(tempEmp);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return employeeList;
    }
}

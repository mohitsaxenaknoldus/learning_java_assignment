package com.knoldus.learning.controller;

import com.knoldus.learning.entity.Employee;
import com.knoldus.learning.service.*;

import java.util.List;

public class EmployeeController {

    public static void main(String[] a){
        ValidateEmployeeService validateEmployeeService = new ValidateEmployeeServiceImpl();
        SaveEmployeeService saveEmployeeService = new SaveEmployeeServiceImpl();
        ReadEmployeeService readEmployeeService = new ReadEmployeeServiceImpl();

        List<Employee> emplList = readEmployeeService.readEmployeeData();

        System.out.println("Total employee size  :  "+emplList.size());

        for (Employee e : emplList) {
            if(validateEmployeeService.validateEmployee(e))
                saveEmployeeService.saveEmployee(e);
        }

        System.out.println("Saved employee  : "+saveEmployeeService.getEmployeeCount());
    }
}

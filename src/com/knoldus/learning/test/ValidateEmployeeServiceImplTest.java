package com.knoldus.learning.test;

import com.knoldus.learning.entity.Employee;
import com.knoldus.learning.service.ValidateEmployeeServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateEmployeeServiceImplTest {

    @Test
    public void validateEmployee() {
        ValidateEmployeeServiceImpl validateEmployeeService = new ValidateEmployeeServiceImpl();

        Employee employee1 = new Employee(1, "Mohit Saxena");
        assertEquals(validateEmployeeService.validateEmployee(employee1), true);

        Employee employee2 = new Employee(-1, "Mohit Saxena");
        assertEquals(validateEmployeeService.validateEmployee(employee2), false);

        Employee employee3 = new Employee(1, "");
        assertEquals(validateEmployeeService.validateEmployee(employee3), false);
    }
}
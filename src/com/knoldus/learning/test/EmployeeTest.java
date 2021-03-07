package com.knoldus.learning.test;

import com.knoldus.learning.entity.Employee;

import static org.junit.Assert.*;

public class EmployeeTest {

    @org.junit.Test
    public void getId() {
        Employee employee = new Employee(1,"Mohit Saxena");
        assertEquals(employee.getId(), 1);
    }

    @org.junit.Test
    public void getName() {
        Employee employee = new Employee(1,"Mohit Saxena");
        assertEquals(employee.getName(), "Mohit Saxena");
    }
}
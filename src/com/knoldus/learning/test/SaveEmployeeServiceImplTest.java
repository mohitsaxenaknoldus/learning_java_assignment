package com.knoldus.learning.test;

import com.knoldus.learning.service.SaveEmployeeServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaveEmployeeServiceImplTest {

    @Test
    public void getEmployeeCount() {
        SaveEmployeeServiceImpl saveEmployeeService = new SaveEmployeeServiceImpl();
        assertEquals(saveEmployeeService.getEmployeeCount(), 0);
    }
}
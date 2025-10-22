package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee employee;

    @BeforeEach
    void init(){
        employee = new Employee(99.00, "0923", "Saint", "Software Dev", 67);
    }
    @Test
    void punchIn_correctTime() {
        //arrange
        double expectedPunchIn = 10;

        //act
        employee.punchIn(10);

        //assert
        assertEquals(expectedPunchIn, employee.getStartTime());
    }

    @Test
    void punchOut() {
        //arrange
        employee.punchIn(10);
        double expectedPunchOut = 71;

        //act
        employee.punchOut(14);

        //assert
        assertEquals(expectedPunchOut, employee.getHoursWorked());
    }
}
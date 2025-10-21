package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        //arrange
        Calculator calculator = new Calculator();
        //act
        double result = calculator.add(8,7);
        //assert
        assertEquals(15, result);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        //arrange
        Calculator calculator = new Calculator();
        //act
        double result = calculator.subtract(8,7);
        //assert
        assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        //arrange
        Calculator calculator = new Calculator();
        //act
        double result = calculator.multiply(8,7);
        //assert
        assertEquals(56, result);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        //arrange
        Calculator calculator = new Calculator();
        //act
        double result = calculator.divide(8,8);
        //assert
        assertEquals(1, result);
    }
}
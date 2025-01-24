package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(7, calculator.add(3,4));
        assertNotEquals(7, calculator.add(3,3));
    }

    @Test
    void subtract() {
        assertEquals(7, calculator.subtract(10,3));
        assertNotEquals(7, calculator.subtract(3,3));
    }

    @Test
    void multiply() {
        assertEquals(12, calculator.multiply(3,4));
        assertNotEquals(7, calculator.multiply(3,3));
    }

    @Test
    void divide() {
        assertEquals(7, calculator.divide(14,2));
        assertNotEquals(7, calculator.divide(3,3));
    }

    @Test
    void squareRoot() {
            assertEquals(4.0, calculator.squareRoot(16.0));
            assertNotEquals(5.0, calculator.squareRoot(16.0));
            assertEquals(0.0, calculator.squareRoot(0.0));
        }



}
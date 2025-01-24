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

    @Test
    void square() {
        assertEquals(16.0, calculator.square(4.0));
        assertNotEquals(17.0, calculator.square(4.0));
        assertEquals(0.0, calculator.square(0.0));
        assertEquals(25.0, calculator.square(5.0));
    }

    @Test
    void calculateSinCos() {
        // Test for 45 degrees (π/4 radians)
        double[] result = calculator.calculateSinCos(Math.PI / 4);
        assertEquals(Math.sin(Math.PI / 4), result[0], 0.0001); // Sin(π/4)
        assertEquals(Math.cos(Math.PI / 4), result[1], 0.0001); // Cos(π/4)

        // Test for 0 radians
        result = calculator.calculateSinCos(0);
        assertEquals(0.0, result[0], 0.0001); // Sin(0)
        assertEquals(1.0, result[1], 0.0001); // Cos(0)

        // Test for π/2 radians (90 degrees)
        result = calculator.calculateSinCos(Math.PI / 2);
        assertEquals(1.0, result[0], 0.0001); // Sin(π/2)
        assertEquals(0.0, result[1], 0.0001); // Cos(π/2)

        // Test for π radians (180 degrees)
        result = calculator.calculateSinCos(Math.PI);
        assertEquals(0.0, result[0], 0.0001); // Sin(π)
        assertEquals(-1.0, result[1], 0.0001); // Cos(π)

        // Test for 3π/2 radians (270 degrees)
        result = calculator.calculateSinCos(3 * Math.PI / 2);
        assertEquals(-1.0, result[0], 0.0001); // Sin(3π/2)
        assertEquals(0.0, result[1], 0.0001); // Cos(3π/2)

        // Test for 2π radians (360 degrees)
        result = calculator.calculateSinCos(2 * Math.PI);
        assertEquals(0.0, result[0], 0.0001); // Sin(2π)
        assertEquals(1.0, result[1], 0.0001); // Cos(2π)
    }

    @Test
    void toBinary() {
        assertEquals("1010", calculator.toBinary(10));
        assertEquals("111", calculator.toBinary(7));
        assertEquals("0", calculator.toBinary(0));
        assertEquals("1001", calculator.toBinary(9));
        assertThrows(IllegalArgumentException.class, () -> calculator.toBinary(-5));
    }
}
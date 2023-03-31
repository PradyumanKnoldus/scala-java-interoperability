package com.knoldus.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5.0, Calculator.add(2.0, 3.0), 0.0);
        assertEquals(1.0, Calculator.add(-2.0, 3.0), 0.0);
        assertEquals(0.0, Calculator.add(0.0, 0.0), 0.0);
    }

    @Test
    public void testSubtract() {
        assertEquals(3.0, Calculator.subtract(5.0, 2.0), 0.0);
        assertEquals(1.0, Calculator.subtract(-2.0, -3.0), 0.0);
        assertEquals(0.0, Calculator.subtract(0.0, 0.0), 0.0);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, Calculator.multiply(2.0, 3.0), 0.0);
        assertEquals(-6.0, Calculator.multiply(-2.0, 3.0), 0.0);
        assertEquals(0.0, Calculator.multiply(0.0, 0.0), 0.0);
    }

    @Test
    public void testDivide() {
        assertEquals(3.0, Calculator.divide(6.0, 2.0), 0.0);
        assertEquals(-2.0, Calculator.divide(-6.0, 3.0), 0.0);
        try {
            Calculator.divide(6.0, 0.0);
            fail("Expected ArithmeticException not thrown");
        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero.", e.getMessage());
        }
    }
}

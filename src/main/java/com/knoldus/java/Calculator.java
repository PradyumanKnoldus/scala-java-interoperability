package com.knoldus.java;

public class Calculator {

    /**
     * Adds two given numbers.
     */
    public static double add(double a, double b) throws IllegalArgumentException {
        return a + b;
    }

    /**
     * Subtracts the second given number from the first one.
     */
    public static double subtract(double a, double b) throws IllegalArgumentException {
        return a - b;
    }

    /**
     * Multiplies two given numbers.
     */
    public static double multiply(double a, double b) throws IllegalArgumentException {
        return a * b;
    }

    /**
     * Divides the first given number by the second one.
     * Throws ArithmeticException if the second argument is zero.
     */
    public static double divide(double a, double b) throws IllegalArgumentException, ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}

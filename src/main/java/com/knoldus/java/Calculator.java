package com.knoldus.java;

public class Calculator {

    /**
     * Adds two given numbers.
     */
    public static double add(double firstNumber, double secondNumber) throws IllegalArgumentException {
        return firstNumber + secondNumber;
    }

    /**
     * Subtracts the second given number from the first one.
     */
    public static double subtract(double firstNumber, double secondNumber) throws IllegalArgumentException {
        return firstNumber - secondNumber;
    }

    /**
     * Multiplies two given numbers.
     */
    public static double multiply(double firstNumber, double secondNumber) throws IllegalArgumentException {
        return firstNumber * secondNumber;
    }

    /**
     * Divides the first given number by the second one.
     * Throws ArithmeticException if the second argument is zero.
     */
    public static double divide(double Numerator, double Denominator) throws IllegalArgumentException, ArithmeticException {
        if (Denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return Numerator / Denominator;
    }
}

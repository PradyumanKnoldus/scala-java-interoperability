package com.knoldus.scala

import scala.util.{Try, Success, Failure}
import com.knoldus.java.Calculator

// Define a case class to represent the result of a calculation
case class CalculationResult(result: Double, message: Option[String] = None)

// Define a class to wrap the Calculator class and return CalculationResult objects
class CalculatorWrapper {

  /**
   * Adds two given numbers and returns the result as a CalculationResult object.
   */
  def add(a: Double, b: Double): CalculationResult = CalculationResult(Calculator.add(a, b))

  /**
   * Subtracts the second given number from the first and returns the result as a CalculationResult object.
   */
  def subtract(a: Double, b: Double): CalculationResult = CalculationResult(Calculator.subtract(a, b))

  /**
   * Multiplies two given numbers and returns the result as a CalculationResult object.
   */
  def multiply(a: Double, b: Double): CalculationResult = CalculationResult(Calculator.multiply(a, b))

  /**
   * Divides the first given number by the second and returns the result as a CalculationResult object.
   * If the second number is zero, returns CalculationResult with result as 0 and an error message in the message field.
   */
  def divide(a: Double, b: Double): CalculationResult = {

    Try(Calculator.divide(a, b)) match {
      case Success(result) => CalculationResult(result)
      case Failure(exception) => CalculationResult(0, Some(exception.getMessage))
    }
  }

}

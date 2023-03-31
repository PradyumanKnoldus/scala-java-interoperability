package com.knoldus.scala

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorWrapperTest extends AnyFlatSpec {

  val calculator = new CalculatorWrapper()

  "CalculatorWrapper" should "add two numbers and return the result as a CalculationResult object" in {
    val result = calculator.add(2.0, 3.0)
    assert(result.result == 5.0)
    assert(result.message.isEmpty)
  }

  it should "subtract the second number from the first and return the result as a CalculationResult object" in {
    val result = calculator.subtract(5.0, 2.0)
    assert(result.result == 3.0)
    assert(result.message.isEmpty)
  }

  it should "multiply two numbers and return the result as a CalculationResult object" in {
    val result = calculator.multiply(2.0, 3.0)
    assert(result.result == 6.0)
    assert(result.message.isEmpty)
  }

  it should "divide the first number by the second and return the result as a CalculationResult object" in {
    val result = calculator.divide(10.0, 2.0)
    assert(result.result == 5.0)
    assert(result.message.isEmpty)
  }

  it should "return a CalculationResult object with a message when dividing by zero" in {
    val result = calculator.divide(5.0, 0.0)
    assert(result.result == 0.0)
    assert(result.message.isDefined)
    assert(result.message.get == "Cannot divide by zero.")
  }

}

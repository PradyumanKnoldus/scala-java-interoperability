import com.knoldus.scala.CalculatorWrapper

object CalculatorWrapperDriver extends App {

  private val calculatorWrapper = new CalculatorWrapper()

  // Addition
  private val additionResult = calculatorWrapper.add(10.0, 20.0)
  println(s"Addition result: ${additionResult.result}")

  // Subtraction
  private val subtractionResult = calculatorWrapper.subtract(20.0, 10.0)
  println(s"Subtraction result: ${subtractionResult.result}")

  // Multiplication
  private val multiplicationResult = calculatorWrapper.multiply(10.0, 20.0)
  println(s"Multiplication result: ${multiplicationResult.result}")

  // Division
  private val divisionResult = calculatorWrapper.divide(20.0, 10.0)
  println(s"Division result: ${divisionResult.result}")

  // Error handling for division by zero
  private val divisionByZeroResult = calculatorWrapper.divide(10.0, 0.0)
  divisionByZeroResult.message.foreach { errorMessage =>
    println(s"Error occurred: $errorMessage")
  }

}

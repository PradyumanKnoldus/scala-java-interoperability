# Scala - Java Interoperability

Create an sbt project which will contain both java and scala code. Inside java, create two classes as follows -

    a. first one, 'calculator' class containing 4 methods, add, substract, multiply and divide. (Ensure to handle all types of cases).
    
    b. second class, 'storage' class, which just contains an array used to store elements. This class will contains several methods as well i.e. addElement, removeElement, removeAll, checkIfContains.

In Scala, implement the followings -

    a. Create a class exposing all the methods of 'calculator' class.
    
    b. Create a trait containing the methods defition only and create a new class extending the traits and these override methods will call the 'storage' class methos to perform operations.

## Java

### Calculator Class

This is a simple Java class that provides basic mathematical operations such as addition, subtraction, multiplication, and division.

#### Method Signature 

The four available methods are:

    add(double firstNumber, double secondNumber): Adds two numbers and returns the result.
    
    subtract(double firstNumber, double secondNumber): Subtracts the second number from the first one and returns the result.
    
    multiply(double firstNumber, double secondNumber): Multiplies two numbers and returns the result.
    
    divide(double Numerator, double Denominator): Divides the first number by the second one and returns the result. Throws an ArithmeticException if the second argument is zero.

#### Exceptions

All four methods in the Calculator class throw an IllegalArgumentException if any of the input arguments are invalid (e.g. null or NaN).

The divide method additionally throws an ArithmeticException if the second argument is zero, as division by zero is undefined.

### Storage Class

This is a simple Java class that provides basic storage operations such as adding, removing, and checking if an element exists in the storage.

#### Method Signature

The four available methods are:

    addElement(Object element): Adds the given element to the storage.
    
    removeElement(Object element): Removes the given element from the storage, if it exists. Throws an IllegalArgumentException if the element is not found in the storage.
    
    removeAll(): Removes all the elements from the storage.
    
    checkIfContains(Object element): Returns true if the storage contains the given element, false otherwise.
    
#### Exceptions

The removeElement method throws an IllegalArgumentException if the element is not found in the storage.

## Scala

### Calculator Wrapper Class

This is a Scala class that wraps the Calculator class from the Java package com.knoldus.java and returns CalculationResult objects for the four basic arithmetic operations.

#### Method Signature

The four available methods are:

    add(firstNumber: Double, secondNumber: Double): CalculationResult: Adds two given numbers and returns the result as a CalculationResult object.
    
    subtract(firstNumber: Double, secondNumber: Double): CalculationResult: Subtracts the second given number from the first and returns the result as a CalculationResult object.
    
    multiply(firstNumber: Double, secondNumber: Double): CalculationResult: Multiplies two given numbers and returns the result as a CalculationResult object.
    
    divide(numerator: Double, denominator: Double): CalculationResult: Divides the first given number by the second and returns the result as a CalculationResult object. If the second number is zero, returns a CalculationResult object with the result as 0 and an error message in the message field.

The CalculationResult case class has two fields:

    result: Double: The result of the calculation.
    
    message: Option[String]: An optional error message. This field will be empty (None) if the calculation succeeded, and will contain a message if there was an error (such as dividing by zero).

Exceptions

The divide method handles the ArithmeticException that the Calculator.divide method may throw by returning a CalculationResult object with the result as 0 and an error message in the message field.

### Storage Wrapper Class

This class is a Scala wrapper around the Storage class in the com.knoldus.java package. It implements the StorageTrait interface and provides the same functionality as the original Storage class.

#### Method Signature

The four available methods are:

    addElement(element: Any): Unit: adds an element to the storage instance using the addElement() method of the Storage class.
    
    removeElement(element: Any): Unit: removes an element from the storage instance using the removeElement() method of the Storage class.
    
    removeAll(): Unit: removes all elements from the storage instance using the removeAll() method of the Storage class.
    
    checkIfContains(element: Any): Boolean: checks if an element is present in the storage instance using the checkIfContains() method of the Storage class.




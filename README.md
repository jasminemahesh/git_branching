Simple calculator with Addition Subtraction Multiplication And Division
==========================================
> This small project is a solution for an assessment from Aegon requirement.

A simple Calculator for general purposes.

## Why use it?

Its useful for simple computations.

## Features

* Add
* Multiply
* Subtract
* Divide

## Built With

* Maven
* Junit 4 
* Mockito
* Lamda with Functional programming.

### Usage instructions

1. Checkout the repository
2. Perform Maven clean for the project
   mvn clean
3. Run the Maven build for the project with testcase execution
   mvn install
   
Assignment: Assessment TDD in Java using Eclipse/Intellij, Maven, JUnit and Mocking
-----------------------------------------------------------------------------------
## Description

The result of this assessment is to have a "SimpleCalculator" that can perform
single calculations and calculations based on a list of input objects.

The "SimpleCalculator" will have the following operations:
* public double add(int, int)
* public double substract(int, int)
* public double multiply(int, int)
* public double divide(int, int)
* public List<Double> calculate(SimpleCalculatorInputProvider)

The first four methods are single calculations.
The last method returns a list of "Double" objects as a result of single calculation,
based on the input objects "SimpleCalculatorInput" provided by the "SimpleCalculatorInputProvider".
The "SimpleCalculatorInput" class and "SimpleCalculatorInputProvider" interface are given and should be used.

The first two methods and the last one are Must haves and the others are Nice to haves.


## Guidelines
* Use Test Driven Development to build the "SimpleCalculator"
* Use the Eclipse/Intellij IDE in combination with the Maven build automation tool
* Use Java7/8 and coding standards (only JavaDoc for most important parts)
* Use JUnit 4.x and Mocking where needed
* Showing the functionality using JUnit tests is good enough (no main required)
* Keep it Simple.

## Deliverables

The Eclipse/Intellij project containing the pom-file, the code and tests. 

## Solution Strategy

The SimpleCalculatorInputProvider interface has next() which returns list containing SimpleCalculatorInput on which computation is been performed based on the operator.

* The add() from SimpleCalculator class takes operands as parameters and returns Added value.

* The sub() from SimpleCalculator class takes operands as parameters and returns Subtracted value.

* The mult() from SimpleCalculator class takes operands as parameters and returns Multiplied value.

* The div() from SimpleCalculator class takes operands as parameters and returns Divided value.

* The calculate() from SimpleCalculator class takes list of SimpleCalculatorInput as input
  and returns list containing the result of operations.








/**
 * 
 */
package com.aegon.calculator.simplecalulator;

import static org.junit.Assert.*;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;
import java.util.function.BinaryOperator;

import com.aegon.calculator.simplecalulator.SimpleCalculator;
import com.aegon.calculator.simplecalulator.SimpleCalculatorInputProviderImpl;
import com.aegon.calculator.simplecalulator.exception.DivideByZeroException;
import com.aegon.calculator.simplecalulator.exception.IllegalOperationException;

import org.junit.Test;

/**
 * SimpleCalculatorTest.java : The test class which demonstrates unit test case
 * operations.
 * 
 * @author Libu
 * @version 1.0
 */
public class SimpleCalculatorTest {

	private SimpleCalculator calc;

	/**
	 * Initializes the Simple Calculator object for further usage.
	 */
	@Before
	public void setUp() throws Exception {
		calc = new SimpleCalculator();
	}

	/**
	 * Clears the Simple Calculator object after usage.
	 */
	@After
	public void tearDown() throws Exception {
		calc = null;
	}

	/**
	 * Test the size of list performing Arithmetic operations passing the
	 * operands and Add operator in the list.
	 * 
	 * @result Operation with Operands will be computed without any errors and
	 *         size of list is asserted,
	 */
	@Test
	public void testCalculateAddSize() throws IllegalOperationException {
		List<SimpleCalculatorInput> addList = new ArrayList<SimpleCalculatorInput>();
		addList.add(new SimpleCalculatorInput(500, 100, '+'));
		SimpleCalculatorInputProviderImpl simpleCalculatorInputProvider = new SimpleCalculatorInputProviderImpl(
				addList);
		List<Double> result = calc.calculate(simpleCalculatorInputProvider);

		assertEquals(1, result.size());
	}

	/**
	 * Test the size of list performing Arithmetic operations passing the
	 * operands and Subract operator in the list.
	 * 
	 * @result Operation with Operands will be computed without any errors and
	 *         size of list is asserted,
	 */

	@Test
	public void testCalculateSubractSize() throws IllegalOperationException {
		List<SimpleCalculatorInput> subList = new ArrayList<SimpleCalculatorInput>();
		subList.add(new SimpleCalculatorInput(500, 100, '-'));
		subList.add(new SimpleCalculatorInput(400, 100, '-'));
		SimpleCalculatorInputProviderImpl simpleCalculatorInputProvider = new SimpleCalculatorInputProviderImpl(
				subList);
		List<Double> result = calc.calculate(simpleCalculatorInputProvider);

		assertEquals(2, result.size());
	}

	/**
	 * Test the size of list performing Arithmetic operations passing the
	 * operands and Multiply operator in the list.
	 * 
	 * @result Operation with Operands will be computed without any errors and
	 *         size of list is asserted,
	 */
	@Test
	public void testCalculateMultiplySize() throws IllegalOperationException {
		List<SimpleCalculatorInput> mulList = new ArrayList<SimpleCalculatorInput>();
		mulList.add(new SimpleCalculatorInput(5, 10, '*'));
		mulList.add(new SimpleCalculatorInput(4, 1, '*'));
		mulList.add(new SimpleCalculatorInput(5, 10, '*'));

		SimpleCalculatorInputProviderImpl simpleCalculatorInputProvider = new SimpleCalculatorInputProviderImpl(
				mulList);
		List<Double> result = calc.calculate(simpleCalculatorInputProvider);

		assertEquals(3, result.size());
	}

	/**
	 * Test the size of list performing Arithmetic operations passing the
	 * operands and Divide operator in the list.
	 * 
	 * @result Operation with Operands will be computed without any errors and
	 *         size of list is asserted,
	 */
	@Test
	public void testCalculateDivideSize() throws IllegalOperationException {
		List<SimpleCalculatorInput> divList = new ArrayList<SimpleCalculatorInput>();
		divList.add(new SimpleCalculatorInput(5, 10, '/'));
		divList.add(new SimpleCalculatorInput(4, 1, '/'));
		divList.add(new SimpleCalculatorInput(5, 10, '/'));

		SimpleCalculatorInputProviderImpl simpleCalculatorInputProvider = new SimpleCalculatorInputProviderImpl(
				divList);
		List<Double> result = calc.calculate(simpleCalculatorInputProvider);

		assertEquals(3, result.size());
	}

	/**
	 * Test the Calculate method in SimpleCalculator passing the size of Input
	 * list as null.
	 * 
	 * @result returns empty list.
	 */
	@Test
	public void testCalculateNull() {
		SimpleCalculatorInputProviderImpl simpleCalculatorInputProvider = new SimpleCalculatorInputProviderImpl(null);
		List<Double> result = new SimpleCalculator().calculate(simpleCalculatorInputProvider);
		assertEquals(0, result.size());
	}

	/**
	 * Test the Add method in SimpleCalculator passing the operands
	 * 
	 * @result returns the computed value.
	 */
	@Test
	public void testAdd() {
		BinaryOperator<Integer> adderPositive = (n1, n2) -> n1 + n2;
		assertEquals(calc.add(3, 3), adderPositive.apply(3, 3), 2);
	}

	@Test
	public void testAddWithNegative() {
		BinaryOperator<Integer> adderNegative = (n1, n2) -> n1 + n2;
		assertEquals(calc.add(-5, 3), adderNegative.apply(-5, 3), 2);
	}

	@Test
	public void testAddWithTwoNegative() {
		BinaryOperator<Integer> adderTwoNegative = (n1, n2) -> n1 + n2;
		assertEquals(calc.add(-5, -3), adderTwoNegative.apply(-5, -3), 2);
	}

	/**
	 * Test the Subract method in SimpleCalculator passing the operands
	 * 
	 * @result returns the computed value.
	 */
	@Test
	public void testSubract() {
		BinaryOperator<Integer> Subracter = (n1, n2) -> n1 - n2;
		assertEquals(calc.sub(4, 3), Subracter.apply(4, 3), 2);

	}

	@Test
	public void testSubractNegative() {
		BinaryOperator<Integer> SubracterWithNegative = (n1, n2) -> n1 - n2;
		assertEquals(calc.sub(-4, 3), SubracterWithNegative.apply(-4, 3), 2);

	}

	/**
	 * Test the Multiply method in SimpleCalculator passing the operands
	 * 
	 * @result returns the computed value.
	 */
	@Test
	public void testMultiply() {
		BinaryOperator<Integer> Multiplier = (n1, n2) -> n1 * n2;
		assertEquals(calc.mult(4, 3), Multiplier.apply(4, 3), 2);

	}

	@Test
	public void testMultiplyWithNegative() {
		BinaryOperator<Integer> MultiplierWithNegative = (n1, n2) -> n1 * n2;
		assertEquals(calc.mult(4, -3), MultiplierWithNegative.apply(4, -3), 2);

	}

	@Test
	public void testMultiplyWithBothNegative() {
		BinaryOperator<Integer> MultiplierWithBothNegative = (n1, n2) -> n1 * n2;
		assertEquals(calc.mult(-4, -3), MultiplierWithBothNegative.apply(-4, -3), 2);

	}

	@Test
	public void testMultiplyWithZero() {
		BinaryOperator<Integer> MultiplierWithZero = (n1, n2) -> n1 * n2;
		assertEquals(calc.mult(-4, 0), MultiplierWithZero.apply(-4, 0), 2);

	}

	/**
	 * Test the Divide method in SimpleCalculator passing the operands
	 * 
	 * @result returns the computed value.
	 */
	@Test
	public void testDivide() {
		BinaryOperator<Integer> divider = (n1, n2) -> n1 / n2;
		assertEquals(calc.div(100, 10), divider.apply(100, 10), 2);

	}

	@Test
	public void testDivideWithPrecision() {
		BinaryOperator<Integer> dividerWithPrecision = (n1, n2) -> n1 / n2;
		assertEquals(calc.div(7, 3), dividerWithPrecision.apply(7, 3), 2);

	}

	@Test
	public void testDivideWithPrecisionNegative() {
		BinaryOperator<Integer> dividerWithNegative = (n1, n2) -> n1 / n2;
		assertEquals(calc.div(7, -3), dividerWithNegative.apply(7, -3), 2);

	}

	@Test
	public void testDivideWithBothNegative() {
		BinaryOperator<Integer> dividerWithBothNegative = (n1, n2) -> n1 / n2;
		assertEquals(calc.div(-7, -3), dividerWithBothNegative.apply(-7, -3), 2);

	}

	/**
	 * Test the Divide By Zero case passing the operands
	 * 
	 * @result returns the Divide By Zero Arithmetic Exception .
	 */
	@Test(expected = DivideByZeroException.class)
	public void testDivideException() {
		assertEquals(calc.div(100, 0), 10, 2);

	}

	@Test(expected = DivideByZeroException.class)
	public void testDivideByZero() {
		assertEquals("Divide double by zero should give infinity", true,
				Double.isInfinite(new SimpleCalculator().div(1, 0)));
	}

	@Test
	public void testCalculate() {
		List<Double> result = new SimpleCalculator().calculate(getCalculatorInputProvider());
		assertEquals(550, result.get(0), 2);
	}

	@Test
	public void testCalculateCount() {
		List<Double> result = new SimpleCalculator().calculate(getCalculatorInputProvider());
		assertEquals(4, result.size(), 2);
	}

	@Test
	public void testCalculateWithNoProvider() {
		List<Double> result = new SimpleCalculator().calculate(null);
		assertEquals(null, result);
	}

	@Test
	public void testCalculateWithNoInput() {
		List<Double> result = new SimpleCalculator().calculate(new SimpleCalculatorInputProviderImpl(null));
		assertEquals(Collections.emptyList(), result);
	}

	@Test(expected = IllegalOperationException.class)
	public void testCalculateWithNull() {
		List<SimpleCalculatorInput> simpleCalculatorInputList = new ArrayList<SimpleCalculatorInput>();
		simpleCalculatorInputList.add(new SimpleCalculatorInput(500, 100, '+'));
		simpleCalculatorInputList.add(new SimpleCalculatorInput(500, 100, '('));
		new SimpleCalculator().calculate(new SimpleCalculatorInputProviderImpl(simpleCalculatorInputList));
	}

	private SimpleCalculatorInputProvider getCalculatorInputProvider() {
		List<SimpleCalculatorInput> simpleCalculatorInputList = new ArrayList<SimpleCalculatorInput>();
		simpleCalculatorInputList.add(new SimpleCalculatorInput(500, 50, '+'));
		simpleCalculatorInputList.add(new SimpleCalculatorInput(400, 40, '-'));
		simpleCalculatorInputList.add(new SimpleCalculatorInput(300, 30, '*'));
		simpleCalculatorInputList.add(new SimpleCalculatorInput(200, 20, '/'));
		SimpleCalculatorInputProviderImpl simpleCalculatorInputProvider = new SimpleCalculatorInputProviderImpl(
				simpleCalculatorInputList);
		return simpleCalculatorInputProvider;
	}

}

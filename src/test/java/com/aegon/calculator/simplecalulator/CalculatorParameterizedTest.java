/**
 * 
 */
package com.aegon.calculator.simplecalulator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.aegon.calculator.simplecalulator.SimpleCalculatorInput;
import com.aegon.calculator.simplecalulator.SimpleCalculatorInputProviderImpl;

/**
 * Unit test class for Calculator - calculate.
 * 
 * @author Libu
 */
@RunWith(Parameterized.class)
public class CalculatorParameterizedTest {
	@Parameter(value = 0)
	public int operand1;
	@Parameter(value = 1)
	public int operand2;
	@Parameter(value = 2)
	public char operator;

	@Parameter(value = 3)
	public double expected;

	@Parameters(name = "{index}: testCalculate({0} {2} {1}) = {3}")
	public static Collection<Object[]> calculateData() {
		return Arrays.asList(new Object[][] { { 500, 100, '+', 600 }, { -500, 200, '+', -300 }, { 500, 100, '-', 400 },
				{ 32767, 32767, '*', 1073676289 }, { 50, -10, '*', -500 }, { 0, 0, '*', 0 }, { 50, 0, '*', 0 }, { 32767, 27305, '/', 1.2000366233290607},
				{ -50, 10, '/', -5 } });
	}

	@Test
	public void testCompute() {
		List<SimpleCalculatorInput> simpleCalculatorInputList = new ArrayList<SimpleCalculatorInput>();
		simpleCalculatorInputList.add(new SimpleCalculatorInput(operand1, operand2, operator));
		assertEquals(expected, new SimpleCalculator()
				.calculate(new SimpleCalculatorInputProviderImpl(simpleCalculatorInputList)).get(0), 2);
	}

}

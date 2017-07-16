/**
 * 
 */
package com.training.calculator.simplecalculator;

import java.util.*;

import com.training.calculator.simplecalculator.exception.DivideByZeroException;
import com.training.calculator.simplecalculator.exception.IllegalOperationException;

/**
 * SimpleCalculator.java :class which performs computation with operands.
 * 
 * @author Jasmine Maheshwari
 * @version 1.0
 */
public class SimpleCalculator {

	/**
	 * Input that can be used for Add computation.
	 * 
	 * @param x
	 *            the first operand
	 * @param y
	 *            the second operand
	 * @returns Addition of operands
	 */
	public double add(int x, int y) {
		double result = (double) x + (double) y;
		return result;
	}

	/**
	 * Input that can be used for Subtract computation.
	 * 
	 * @param x
	 *            the first operand
	 * @param y
	 *            the second operand
	 * @returns Subtract of operands
	 */
	public double sub(int x, int y) {
		double result = (double) x - (double) y;
		return result;
	}

	/**
	 * Input that can be used for Multiply computation.
	 * 
	 * @param x
	 *            the first operand
	 * @param y
	 *            the second operand
	 * @returns Multiply of operands
	 */
	public double mult(int x, int y) {
		double result = (double) x * (double) y;
		return result;
	}

	/**
	 * Input that can be used for Division computation.
	 * 
	 * @param x
	 *            the first operand
	 * @param y
	 *            the second operand
	 * @returns Division of operands
	 */
	public double div(int x, int y) {
		if (x == 0 || y == 0)
			throw new DivideByZeroException("One of the parameters is zero");
		double result = (double) x / (double) y;
		return result;
	}

	/**
	 * Input that can be used for computation based on OPerands and Operators in
	 * the List.
	 * 
	 * @param calculator
	 *            the first operand
	 * @returns list containing result
	 */
	public List<Double> calculate(SimpleCalculatorInputProvider calculator) throws IllegalOperationException {

		List<Double> sample = null;
		if (Optional.ofNullable(calculator).isPresent()) {
			sample = new ArrayList<Double>();
			SimpleCalculatorInput calculator1 = calculator.next();
			while (Optional.ofNullable(calculator1).isPresent()) {
				calculateByOperators(calculator1, sample);
				calculator1 = calculator.next();
			}
		}
		return sample;

	}

	private List<Double> calculateByOperators(SimpleCalculatorInput calculator1, List<Double> sample) {
		switch (calculator1.getOperator()) {
		case '+':
			sample.add(add(calculator1.getOperand1(), calculator1.getOperand2()));
			break;
		case '-':
			sample.add(sub(calculator1.getOperand1(), calculator1.getOperand2()));
			break;
		case '*':
			sample.add(mult(calculator1.getOperand1(), calculator1.getOperand2()));
			break;
		case '/':
			sample.add(div(calculator1.getOperand1(), calculator1.getOperand2()));
			break;
		default:
			throw new IllegalOperationException("Unmatched operator to perform the operation");

		}
		return sample;
	}

}

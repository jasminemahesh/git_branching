/**
 * 
 */
package com.training.calculator.simplecalculator.exception;

/**
 * DivideByZeroException.java :Runtime exception when divided by Zero .
 * 
 * @author Libu
 * @version 1.0
 */
public class DivideByZeroException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivideByZeroException(String message)
	{
		super(message);
	}

}

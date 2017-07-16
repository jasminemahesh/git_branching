/**
 * 
 */
package com.training.calculator.simplecalculator.exception;

/**
 * IllegalOperationException.java :Runtime exception when Illegal operation
 * performed .
 * 
 * @author Libu
 * @version 1.0
 */
public class IllegalOperationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalOperationException(String message) {
		super(message);
	}

}

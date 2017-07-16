/**
 * 
 */
package com.training.calculator.simplecalculator;

import java.util.function.*;

/**
 * @author Libu
 *
 */
@FunctionalInterface
public interface SimpleCalculatorInputProvider {

	/**
	 * Returns the next input from the provider.
	 * 
	 * @return the next input from the provider, or null if the end is reached.
	 */
	SimpleCalculatorInput next();

}

/**
 * 
 */
package com.aegon.calculator.simplecalulator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * SimpleCalculatorInputProviderImpl.java :class which initializes and returns
 * list of SimpleCalculatorInput objects.
 * 
 * @author Libu
 * @version 1.0
 */
public class SimpleCalculatorInputProviderImpl implements SimpleCalculatorInputProvider {

	private List<SimpleCalculatorInput> list;
	int currentIndex;

	public SimpleCalculatorInputProviderImpl(List<SimpleCalculatorInput> list) {
		this.list = list != null ? list : new ArrayList<SimpleCalculatorInput>();
		this.currentIndex = 0;
	}

	/**
	 * 
	 * @returns list of SimpleCalculatorInput objects
	 */
	public SimpleCalculatorInput next() {
		return list.size() > currentIndex ? list.get(currentIndex++) : null;
	}
}

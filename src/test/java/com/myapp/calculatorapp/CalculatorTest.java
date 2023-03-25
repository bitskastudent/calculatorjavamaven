package com.myapp.calculatorapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

	Calculator calculator = new Calculator();
	@Test
	public void testSum() {
		assertEquals(4.0, calculator.sum(2, 2));
	}

	@Test
	public void testMinus() {
		assertEquals(0.0, calculator.minus(2, 2));
	}

	@Test
	public void testDivide() {
		assertEquals("2.0", calculator.divide(6, 3));
	}

	@Test
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		assertEquals("Division by zero not possible", calculator.divide(6, 0));
	}
}

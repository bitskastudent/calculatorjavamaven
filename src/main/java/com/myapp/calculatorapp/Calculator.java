package com.myapp.calculatorapp;

public class Calculator {

	public double sum(double a, double b) {
		return a + b;
	}

	public double minus(double a, double b) {
		return a - b;
	}

	public String divide(double a, double b) {
		if (b == 0)
			return "Division by zero not possible";
		return String.valueOf(a / b);
	}

	public double multiply(double a, double b) {
		return a * b;
	}

}

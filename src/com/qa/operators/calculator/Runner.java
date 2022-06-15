package com.qa.operators.calculator;

public class Runner {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.add(10, 10);
		calc.multiply(5, 9);
		calc.subtract(20, 8);
		calc.divide(15, 6);
		
	}
}

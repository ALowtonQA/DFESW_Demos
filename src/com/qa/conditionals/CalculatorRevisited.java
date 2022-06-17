package com.qa.conditionals;

public class CalculatorRevisited {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public double div(double a, double b) {
		if (a >= b) {
			System.out.println("Cannot Perform Division. First input must be less than second");
			return 0;
		} else {
			return a / b;			
		}
	}
}

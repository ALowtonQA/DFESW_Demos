package com.qa.operators;

public class Runner {

	public static void main(String[] args) {
		// Create a new Operators Object
		Operators op = new Operators();
		
		// Use the object to call the methods
		op.basicMaths(10, 5);
		op.modulus(9, 4);
		
		op.plusEquals();
		op.minusEquals();
		
		op.increment();
		op.decrement();
		
		op.notOperator();
	}
}

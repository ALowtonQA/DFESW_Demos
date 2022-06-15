package com.qa.operators;

public class Runner {

	public static void main(String[] args) {
		// Create a new Operators Object
		Operators op = new Operators();
		
		// Use the object to call the methods
		op.basicMaths(10, 5);
		op.basicMaths(4, 5);
		op.basicMaths(11, 4);
		op.basicMaths(8, 5);
		
		op.modulus(9, 4);
		op.modulus(10, 4);
		op.modulus(13, 5);
		op.modulus(11, 4);
	}
}

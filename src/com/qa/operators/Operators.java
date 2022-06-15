package com.qa.operators;

public class Operators {

	public void basicMaths(int numOne, int numTwo) {
		// Maths operators
		System.out.println(numOne + numTwo);
		System.out.println(numOne - numTwo);
		System.out.println(numOne * numTwo);
		System.out.println(numOne / numTwo);
	}
	
	public void modulus(int numOne, int numTwo) {
		System.out.println(numOne % numTwo);
	}
	
	// += 
	public void plusEquals() { 
		int num = 10;
		
		num += 5; // num = num + 5
		
		System.out.println(num);
	}
	
	// -=
	public void minusEquals() { 
		int num = 10;
		
		num -= 5; // num = num - 5
		
		System.out.println(num);
	}
	
	// increment
	public void increment() {
		int num = 10;
		
		num++;
		
		System.out.println(num);
	}
	
	// decrement
	public void decrement() {
		int num = 10;
		
		num--;
		
		System.out.println(num);
	}
	
	// ! - not operator (inverse)
	public void notOperator() {
		boolean flag = true;
		
		System.out.println(!flag);
	}
}

package com.qa.exceptions;

import java.util.Scanner;

public class ExceptionExample {

	public void questionOne() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter two integers: ");
		int numOne = scanner.nextInt(); // InputMistmatchException could be thrown here
		int numTwo = scanner.nextInt(); // InputMistmatchException could be thrown here
		
		System.out.println(numOne/numTwo); // ArithmeticException could be thrown here
		
		// Also catch an overall third exception - Exception class (the parent)
	}
	
	public void multiplyException(int numOne, int numTwo) throws MultiplyByFiveException {
		
		if (numOne == 5 || numTwo == 5) {
			throw new MultiplyByFiveException();
		}
		
		System.out.println(numOne * numTwo);
		
	}
	
}

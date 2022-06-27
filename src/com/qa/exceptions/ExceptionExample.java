package com.qa.exceptions;

public class ExceptionExample {

	public void multiplyException(int numOne, int numTwo) throws MultiplyByFiveException {
		
		if (numOne == 5 || numTwo == 5) {
			throw new MultiplyByFiveException();
		}
		
		System.out.println(numOne * numTwo);
		
	}
	
}

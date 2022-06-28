package com.qa.exceptions.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise {

	public void questionOne() throws DivisionException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter two integers: ");

//		These variables could be initialized here so they're in scope throughout the method
//		int numOne = 0;
//		int numTwo = 0;
		
		try {
			// I initialized these variables here because they're only used here.
			int numOne = scanner.nextInt(); // InputMistmatchException could be thrown here
			int numTwo = scanner.nextInt(); // InputMistmatchException could be thrown here
			
			if (numTwo > numOne) {
				throw new DivisionException();
			}
			
			System.out.println(numOne/numTwo); // ArithmeticException could be thrown here
			
		} catch (InputMismatchException ime) {
			ime.printStackTrace();
			System.out.println("Invalid input");
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
//			System.out.println(ae.getMessage());
		} finally {
			// This block ALWAYS runs
			scanner.close();
		}
		
	}
	
}

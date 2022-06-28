package com.qa.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		ExceptionExample ex = new ExceptionExample();
		
		try {
			ex.multiplyException(5, 2);
		} catch (MultiplyByFiveException mbfe) {
			mbfe.printStackTrace();
		}
		
		
		boolean flag = true;
		
		while (flag) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please enter a integer: ");
//	
			int numberOne = 0;
//			
			try {
				numberOne = scanner.nextInt(); // This line is throwing an exception when the input is invalid.
				System.out.println("The number you entered was: " + numberOne);
				flag = false;
			} catch (InputMismatchException ime) {
				System.out.println("You didn't enter an integer");
				scanner.nextLine(); // clears the scanner
	//			ime.printStackTrace();
			} catch (Exception e) { // Exception is the parent. So it will catch ALL exceptions.
				System.out.println("Something else went wrong.");
				e.printStackTrace();
				scanner.nextLine(); // clears the scanner
			} finally { // THIS ALWAYS RUNS
				System.out.println("I always run");
				scanner.close();
			}
		}
		
//		Scanner scanner = new Scanner(System.in);
//		
//		int numOne = scanner.nextInt();
//		int numTwo = scanner.nextInt();
//		
//		try {
//			System.out.println(numOne/numTwo);
//		} catch (ArithmeticException ae) {
//			System.out.println("You can't divide by zero, dummy :)");
////			ae.printStackTrace(); // Can print the stack trace for further debugging - if needed.
//		}

	}
}

package com.qa.conditionals;

public class DemoRunner {

	public static void main(String[] args) {
		int number = 10;
		int numberTwo = 15;
		
//		== - equality operator - used to check if two values are equal
		if (number == 10) {
			System.out.println("The condition was true");
		} else {
			System.out.println("The condition was false");
		}
		
//		&& - AND operator - used to say ALL conditions must be true
		if (number == 10 && numberTwo < 15) {
			System.out.println("The condition was true");
		} else {
			System.out.println("The condition was false");
		}
		
//		|| - OR operator - used to say at LEAST ONE condition must be true
		if (number == 10 || numberTwo == 9999999) {
			System.out.println("The condition was true");
		} else {
			System.out.println("The condition was false");
		}
		
//		if/else if/else
		if (number <= 40) {
			System.out.println("Number is less than or equal to 40");
		} else if (number <= 50) {
			System.out.println("Number is less than or equal to 50");
		} else if (number <= 60) {
			System.out.println("Number is less than or equal to 60");
		} else {
			System.out.println("Number is greater than 60");
		}
		
//		switch/case
		String grade = "C";
		
		switch(grade) {
			case "A":
				System.out.println("Well done! Top Mark");
				break;
			case "B":
				System.out.println("Not too bad, room for improvement");
				break;
			case "C":
				System.out.println("Not too bad, room for improvement");
				break;
			case "D":
				System.out.println("You have work to do!!!");
				break;
			default:
				System.out.println("You have failed :( ");
				break;
		}
	}
}

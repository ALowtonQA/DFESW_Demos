package com.qa.typecasting;

public class Runner {


	public static void main(String[] args) {
		
		// Wide casting aka Automatic
		// byte -> short -> int -> long > float -> double
		
		int intAge = 29;
		
		long longAge = intAge;
		
		System.out.println(longAge);
		
		// Narrow Casting
		// double -> float -> long -> int -> short -> byte
		double myDouble = 9.99;
		
		int myInt = (int) myDouble;
		
		System.out.println(myInt);
	}
	
}

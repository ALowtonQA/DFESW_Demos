package com.qa.streamslambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		
		// Enhanced for loop
		for (Integer value : myList) {
			System.out.println(value * 10);
		}
		
		// You only need curly brackets {} for method body when it's multiple lines!
		// Single argument Lambda Expression syntax:
		// arg1 -> { method body }
		
		// Multiple argument Lambda Expression syntax:
		// (arg1, arg2) -> { method body }
		
		// Does the same thing as the loop above
		// Uses a lambda expression as the parameter for the method forEach();
		myList.forEach(value -> System.out.println(value * 10));
//		
//		// This is identical to the above, but on multiple lines for clarity.
		myList.forEach(value -> {
			System.out.println(value * 10);
		});
		
		// This is a multi-line lambda expression
		// It contains some conditional logic as well
		myList.forEach(value -> {
			if (value % 2 != 0) { // Checks if the value is odd
				System.out.println(value); // print the value if it's odd
			}
		});
		
	}
	
}

package com.qa.iteration.enhanced.exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercises {

//	Regular Array
	int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	
	public void questionOne() {
		
//		Regular Array
//		String[] arrayOfStrings = {"Anoush", "Ajibola", "Harry"};
		
//		ArrayList
		List<String> arrayOfStrings = new ArrayList<>();
		arrayOfStrings.add("Anoush");
		arrayOfStrings.add("Ajibola");
		arrayOfStrings.add("Harry");
		
		for(String value : arrayOfStrings) {
			System.out.println(value);
		}
	}
	
	public void questionTwo() {
		
//		Regular Array
//		int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
//		List<Integer> myIntArray = new ArrayList<>();
//		for (int i = 1; i < 21; i++) {
//			myIntArray.add(i);
//		}
		
		for(Integer value : myIntArray) {
			
//			System.out.println(Math.pow(value, 2)); // This comes as double (includes decimal places)
			System.out.println(value * value);
		}
	}
	
	public boolean questionThree(int input) {
		
		if (input % 2 == 0) { // This means the number is even
			return true;
		} else { // The number is false
			return false;
		}

	}
	
	public void questionFour() {
		
		for (int value : myIntArray) {
			if (questionThree(value)) {
				// IF IT'S EVEN
				System.out.println(value * value * value);
			} else {
				// IF IT'S FALSE
				System.out.println(value * value);
			}
		}
		
	}
}

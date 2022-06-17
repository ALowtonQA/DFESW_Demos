package com.qa.arrays;

public class ArrayRunner {

	public static void main(String[] args) {
		
//		Datatype variableName = value
		
//		     indexs  =    0...1...2...3...4
		int[] numArray = {5, 10, 15, 20, 25}; // You can assign the values when you create the array
		
		int[] otherNumArray = new int[5]; // Or you can create them empty - length here is 5
		
		numArray[2] = 17;
		
		// print the whole array
//		for (int i = 0; i < numArray.length; i++) {
//			System.out.println(numArray[i]);
//		}	
//		
//		for (int i = 0; i < otherNumArray.length; i++) {
//			otherNumArray[i] = i + 5;
//		}
//	
//		for (int i = 0; i < otherNumArray.length; i++) {
//			System.out.println(otherNumArray[i]);;
//		}
		
//		Enhanced for loop - for each loop
		for(int value : numArray) {
			System.out.println(value);
		}
		
	}
}

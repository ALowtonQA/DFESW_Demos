package com.qa.iteration.enhanced;

import java.util.ArrayList;
import java.util.List;

public class RunnerDemo {

	public static void main(String[] args) {
		
		List<String> myArray = new ArrayList<>();
		myArray.add("Anoush");
		myArray.add("Ajibola");
		myArray.add("Harry");
		
		// .contains is used to 'search' an array list
		if (myArray.contains("Roxy")) {
			System.out.println("Person found!");
		} else {
			System.out.println("Person doesn't exist!");
		}
		
		// Enhanced for loops are used to loop through EVERY value in an array
		for (String name : myArray) {
			System.out.println("First Name: " + name);
		}
		
		List<Integer> intArray = new ArrayList<>();
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
		
		for (Integer value : intArray) {
			System.out.println(value * 10);
		}
	}
}

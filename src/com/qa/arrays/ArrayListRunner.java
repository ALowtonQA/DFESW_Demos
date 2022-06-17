package com.qa.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {

	public static void main(String[] args) {
		
		// Primitive Data Types
		// int, double, float, long, boolean, short, char, byte 
		
		// Object Types aka Wrapper Classes
		// Integer, Double, Float, Long, Boolean, Short, Character, Byte
		
		List<String> listOfStrings = new ArrayList<>();
		
		// Adding new values to the arraylist
		listOfStrings.add("Hello");
		listOfStrings.add("There");
		listOfStrings.add("Anoush");
		
		// Print the whole list
		System.out.println(listOfStrings);
		
		// Get a value by it's index in the list
		System.out.println(listOfStrings.get(2));
		
		// Change an existing value, using index.
		listOfStrings.set(2, "Brenda");
		
		// Print the whole list
		System.out.println(listOfStrings);
		
		// Remove an element using it's index
		listOfStrings.remove(1);
		
		// Print the whole list
		System.out.println(listOfStrings);
		
		// Get the size of the arraylist
		System.out.println(listOfStrings.size());
		
		// Empty the ENTIRE list
//		listOfStrings.clear();
		
		// Loop through arraylists
		for (int i = 0; i < listOfStrings.size(); i++) {
			System.out.println(listOfStrings.get(i));
		}
		
		for (String value : listOfStrings) {
			System.out.println(value);
		}
	}	
}

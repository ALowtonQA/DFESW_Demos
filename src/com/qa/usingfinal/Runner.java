package com.qa.usingfinal;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		// Final variable cannot be reassigned
		final int age = 29;
		
//		age = 10; // I can't do this
		
		// Final variables are usually used for constants
		final String dob = "24/07/1993";
		final String eyeColour = "Brown";
		final String myPlanet = "Earth";

		final List<String> myList = new ArrayList<>();
		myList.add("Hello");
		myList.add("There");
		myList.add("Class");
		
		for (String item : myList) {
			System.out.println(item);
		}
		
//		myList = new ArrayList<>(); // Can't do this
	}

}

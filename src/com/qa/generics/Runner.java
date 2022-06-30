package com.qa.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Runner {

	public static void main(String[] args) {
		
		List<Vehicle> listOfVehicles = new ArrayList<>();
		
		Stream<Vehicle> streamOfDouble = listOfVehicles.stream();
		
		HashMap<String, String> capitalCities = new HashMap<>();
		
		// DataType variableName = value;
		
		GenericExample<String> myExample = new GenericExample<>();
		myExample.addToStorage("Hello");
		String result = myExample.getFromStorage(0);
		System.out.println(result);
		
		GenericExample<Integer> myExampleTwo = new GenericExample<>();
		myExampleTwo.addToStorage(10);
		int intResult = myExampleTwo.getFromStorage(0);
		System.out.println(intResult);
	}
	
}

package com.qa.streamslambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		// List of strings
		List<String> myAnimalList = new ArrayList<>();
		myAnimalList.add("cat");
		myAnimalList.add("dog");
		myAnimalList.add("fish");
		
		// List of integers
		List<Integer> myIntList = new ArrayList<>();
		myIntList.add(1);
		myIntList.add(2);
		myIntList.add(3);
		myIntList.add(4);
		myIntList.add(5);
		
		
		// Converting my lists to streams
		// This will allow me to use stream operations
		Stream<String> myAnimalStream = myAnimalList.stream();
		Stream<Integer> myIntStream = myIntList.stream();
		
		///////////////////////////////////////////////////////////////////////
		// TERMINAL OPERATIONS - ALWAYS GO AT THE END OF THE STREAM PIPELINE//
		/////////////////////////////////////////////////////////////////////
		// forEach() - performs an action with each value, like printing.
		myAnimalStream.forEach(animal -> System.out.println(animal));
		
		// collect() - converts the stream back into another datatype, usually a List, using collect(Collectors.toList()).
		List<String> collectedList = myAnimalStream.collect(Collectors.toList());
		
		// reduce()  - runs a method against the stream which takes the values within the stream and turns it into a single value.
		int sum = myIntStream.reduce((num1, num2) -> num1 + num2).get();
		System.out.println(sum);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// INTERMEDIATE OPERATIONS - ALWAYS GO IN THE MIDDLE OF A PIPELINE. THEY RETURN ANOTHER STREAM SO YOU CAN CONTINUE//
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// filter() - used to filter out certain values. The lambda should return true or false, where true values are kept.
		// This example filters then prints
		myAnimalStream.filter(animal -> animal.contains("a")).forEach(value -> System.out.println(value));
		
		// This example filters then collects
//		List<String> myFilteredList = myAnimalStream.filter(animal -> animal.contains("a")).collect(Collectors.toList());
		
		// Integer filter example
		myIntStream.filter(number -> number % 2 == 0).forEach(number -> System.out.println(number));
		
		// map()    - used to change/modify the values. The provided lambda will be used to change these values.
		// This example maps then prints
		myAnimalStream.map(animal -> animal.toUpperCase()).forEach(animal -> System.out.println(animal));
		
		// This example maps then collects
//		List<String> myUpperCaseAnimals = myAnimalStream.map(animal -> animal.toUpperCase()).collect(Collectors.toList());
		
		// sorted() - used to sort the stream, such as alphabetical order for strings, or ascending order for numbers.
		List<String> sortedAnimals = myAnimalStream.sorted().collect(Collectors.toList());
	}	
}

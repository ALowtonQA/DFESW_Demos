package com.qa.streamslambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExercises {

	public static void main(String[] args) {
		
		// Question one
		List<String> listOfNames = new ArrayList<>();
		listOfNames.add("Michael");
		listOfNames.add("Dean");
		listOfNames.add("James");
		listOfNames.add("Chris");
		
		Stream<String> streamOfNames = listOfNames.stream(); // Convert the list to stream
		
		streamOfNames.filter(name -> !name.contains("J")).forEach(name -> System.out.println("Hello " + name));
//		streamOfNames.filter(name -> !name.equals("James")).forEach(name -> System.out.println("Hello " + name));
		
		// Solution if you want to print James as well
//		streamOfNames.forEach(name -> {
//			if (!name.equals("James")) {
//				System.out.println("Hello " + name);
//			} else {
//				System.out.println(name);
//			}
//		});
		
		
		// Question two
		List<Integer> listOfInts = List.of(3, 4, 7, 8, 12);
		Stream<Integer> streamOfInts = listOfInts.stream();
		
		int product = streamOfInts.reduce((num1, num2) -> num1 * num2).get();	
		System.out.println(product);
		
		// Question three
		// Three ways of doing the same thing:
//		int max = streamOfInts.max((num1, num2) -> num1.compareTo(num2)).get();
		int max = streamOfInts.max((num1, num2) -> Integer.compare(num1, num1)).get();
//		int max = streamOfInts.max(Integer::compare).get();
		
		// Min works just like max.
		int min = streamOfInts.min((num1, num2) -> Integer.compare(num1, num1)).get();
	
		System.out.println(max);
		System.out.println(min);
		
		
		// Question four - removes odd numbers, by keeping even numbers.
		streamOfInts.filter(num -> num % 2 == 0).forEach(num -> System.out.println(num));
		
		// Remove the even numbers, by keeping the odd numbers
		streamOfInts.filter(num -> num % 2 != 0).forEach(num -> System.out.println(num));
		
		
		// Question 5
		int sum = streamOfInts.reduce((num1, num2) -> num1 + num2).get();
//		int sum = streamOfInts.mapToInt(Integer::intValue).sum();
		
//		System.out.println(sum);
		
		// Question 6
//		int min = streamOfInts.map(num -> num * num).filter(num -> num % 2 != 0).min((num1, num2) -> Integer.compare(num1, num1)).get();
		int result = streamOfInts.map(num -> (int)Math.pow(num, 2)).filter(num -> num % 2 != 0).min((num1, num2) -> Integer.compare(num1, num1)).get();
		System.out.println(min);
	}
}

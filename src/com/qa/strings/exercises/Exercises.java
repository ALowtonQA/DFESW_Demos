package com.qa.strings.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercises {

	public void questionOne() {
		
		String one = "yesterday it was raining";
		String two = "today it is sunny";
		String three = two + ", " + one;
		
		System.out.println(three.toUpperCase());
		
		String subStringOne = two.substring(0, 11);
		String subStringTwo = one.substring(16, one.length());
		
		System.out.println(subStringOne.toUpperCase() + subStringTwo.toUpperCase());
	}
	
	public int questionTwo(String input) {
		
		String[] words = input.split(" ");
		
		return words.length; // This is how many words there are
		
	}
	
	public void questionThree(String input) {
		
		String[] words = input.split(" ");
		
		for (String word : words) {
			System.out.println(word);
		}

	}
	
	public void questionFour(String input) {
		
		String[] words = input.split(" ");
		
//		List<String> list = Arrays.asList(words); // Convert to List
//		Collections.reverse(list); // Reversed the List
//		
//		for (String word : list) {
//			System.out.println(word);
//		}
		
		for (int i = words.length - 1; i >= 0 ; i--) {
			System.out.println(words[i]);
		}
		
	}
	
	public void questionFive() {
		
		
		
	}
	
}

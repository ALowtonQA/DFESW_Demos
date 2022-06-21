package com.qa.strings.exercises;

public class Runner {

	public static void main(String[] args) {
		
		Exercises ex = new Exercises();
		
		// Question 1
		ex.questionOne();
		
		// Question 2
		int numOfWords = ex.questionTwo("This should be four");
		System.out.println("Number of words: " + numOfWords);
		
		// Question 3
		ex.questionThree("These are on new lines");
		
		// Question 4
		ex.questionFour("These are in reverse order");
	}

}

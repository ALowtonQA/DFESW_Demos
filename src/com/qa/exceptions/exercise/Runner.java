package com.qa.exceptions.exercise;

public class Runner {

	public static void main(String[] args) {
		
		Exercise ex = new Exercise();
		
		try {
			ex.questionOne();
		} catch (DivisionException de) {
			System.out.println(de.getMessage());
		}
		
	}
	
}

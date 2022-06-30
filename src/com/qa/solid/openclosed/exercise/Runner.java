package com.qa.solid.openclosed.exercise;

public class Runner {

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		
		greeter.setGreetingType("friendly");
		
		System.out.println(greeter.greet());
	}
	
}

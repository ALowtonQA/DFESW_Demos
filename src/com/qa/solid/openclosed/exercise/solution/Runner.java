package com.qa.solid.openclosed.exercise.solution;

public class Runner {

	public static void main(String[] args) {
		
		FormalGreeting formal = new FormalGreeting();
		CasualGreeting casual = new CasualGreeting();
		FriendlyGreeting friendly = new FriendlyGreeting();
		
		Greeter greeter = new Greeter(friendly);
		
		System.out.println(greeter.greet());

	}

}

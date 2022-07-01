package com.qa.solid.liskov.animalsolution;

// Child class
public class Owl extends Bird implements Flying {

	@Override
	public void fly() {
		System.out.println("I'm flying!");
	}
	
}

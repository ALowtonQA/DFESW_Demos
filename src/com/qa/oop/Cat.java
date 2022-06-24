package com.qa.oop;

public class Cat extends Animal {

	public Cat(String name, String colour, int age, double weight) {
		super(name, colour, age, weight);
	}

	@Override
	public void makeNoise() {
		System.out.println("Meowww");
	}

}

package com.qa.oop;

public class Bird extends Animal implements Flyable, Peckable {

	public Bird(String name, String colour, int age, double weight) {
		super(name, colour, age, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNoise() {
		System.out.println("Chirp!");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
		
	}

	@Override
	public void flap() {
		System.out.println("I'm flapping");
		
	}

	@Override
	public void peck() {
		// TODO Auto-generated method stub
		
	}
	
}

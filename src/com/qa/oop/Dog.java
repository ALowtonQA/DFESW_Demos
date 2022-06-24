package com.qa.oop;

//Classes should have:
//1) private properties
//2) 'getters' and 'setters' for those properties
//3) A constructor which gives those properties initial values

// This class inherits from Animal
// It gets access to all of Animal's public members
public class Dog extends Animal {

	private String breed;
	private boolean isPanting;

	public Dog(String name, String colour, int age, double weight, String breed, boolean isPanting) {
		super(name, colour, age, weight);
		this.breed = breed;
		this.isPanting = isPanting;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isPanting() {
		return isPanting;
	}

	public void setPanting(boolean isPanting) {
		this.isPanting = isPanting;
	}

	@Override
	public void makeNoise() {
		System.out.println("Barkkkk!");
	}


}

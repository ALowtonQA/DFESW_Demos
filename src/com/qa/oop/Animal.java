package com.qa.oop;

// Classes should have:
//   1) private properties
//   2) 'getters' and 'setters' for those properties
//   3) A constructor which gives those properties initial values
public class Animal {

	private String name;
	private String colour;
	private int age;
	private double weight;
	
	public Animal(String name, String colour, int age, double weight) {
		this.name = name;
		this.colour = colour;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void makeNoise() {
		System.out.println("Makes random noise!!!!");
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", colour=" + colour + ", age=" + age + ", weight=" + weight + "]";
	}

}

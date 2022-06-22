package com.qa.oop;

public class Runner {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Bob", "Black", 16, 20.0);
		animal.makeNoise();
		
//		System.out.println(animal.getName());
//		animal.setName("Bill");
		
		
		Dog bob = new Dog("Bob", "Black", 16, 20.0, "Labrador", false);
		Dog charlie = new Dog("Charlie", "White", 17, 12.0, "Jack Russell", false);
		
		bob.makeNoise();
//		
//		System.out.println(bob.getAge());
	}

}

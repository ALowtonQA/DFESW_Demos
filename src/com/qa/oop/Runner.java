package com.qa.oop;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
				
		Cat bill = new Cat("Bill", "Brown", 8, 10.0);
		Dog bob = new Dog("Bob", "Black", 16, 20.0, "Labrador", false);

		
		List<Cat> listOfCats = new ArrayList<>();
		List<Dog> listOfDogs = new ArrayList<>();
		
		List<Animal> listOfAnimals = new ArrayList<>(); // BOTH cats and dogs can be stored here!
		
		List<String> listOfStrings = new ArrayList<>();

		// Animal is an Animal
		// Animal is an Object
		
		// Cat is a Cat
		// Cat is an Animal
		// Cat is an Object
		
		// Dog is a Dog
		// Dog is an Animal
		// Dog is an Object
		
//		List<Animal> listOfAnimals = new ArrayList<>();
		listOfAnimals.add(bob);
		listOfAnimals.add(bill);
		
		
	}

}

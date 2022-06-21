package com.qa.oop;

public class Runner {

	public static void main(String[] args) {
		
		Animal dog = new Animal("Bob", "Black", 16, 20.0);
		
		System.out.println(dog.getName());
		
		dog.setName("Bill");
		
		System.out.println(dog);
		
//		Dog bob = new Dog("Bob", "Black", 16, 20.0, "Labrador", false);
//		Dog charlie = new Dog("Charlie", "White", 17, 12.0, "Jack Russell", false);
//		
//		System.out.println(bob.getAge());
	}

}

package com.qa.constructors;


public class Runner {
	
	public static void main(String[] args) {
		//DataType variableName = value
		Person anoush = new Person("Anoush", 29, 12); // new person object

		Person tom = new Person("Tom", 15); // new person object
		
		Person ajibola = new Person("Ajibola", 20, 5);
		
		System.out.println(anoush.name);
		System.out.println(anoush.age);
		System.out.println(anoush.shoeSize);
		System.out.println();
		System.out.println(tom.name);
		System.out.println(tom.age);
		System.out.println(tom.shoeSize);

	}
}

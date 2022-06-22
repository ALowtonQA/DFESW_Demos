package com.qa.oop.personexercise;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		// DataType variableName = value
		Person anoush = new Person("Anoush", 29, "Trainer");
		Person dee = new Person("Dee", 29, "Student");
		Person james = new Person("James", 29, "Student");

		anoush.getName();
		
		// Testing the toString() method - Which is called when objects are printed.
//		System.out.println(anoush);
//		System.out.println(dee);
//		System.out.println(james);

		PersonManager pm = new PersonManager();
		
		pm.add(anoush);
		pm.add(dee);
		pm.add(james);
		
//		pm.printList();
		
		pm.search("Dee");
		
		pm.printEachPerson();
	}

}

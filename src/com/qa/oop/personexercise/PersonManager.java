package com.qa.oop.personexercise;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

	// DataType  variableName = value
	private List<Person> listOfPeople = new ArrayList<>();

	// Add to list
	public void add(Person input) {
		listOfPeople.add(input);
	}
	
	// Search the list
	public void search(String name) {
		for (Person person : listOfPeople) {
			if (person.getName().equals(name)) {
				System.out.println("Person Found");
			}
		}
	}
	
	// Printing the whole list
	public void printList() {
		System.out.println(listOfPeople);
	}
	
	// Loop through the list
	public void printEachPerson() {
		for (Person person : listOfPeople) {
			System.out.println(person);
		}
	}
	
}

package com.qa.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapDemo {

	
	public static void main(String[] args) {
		
//		This 
		
//		List<String> listOfStrings = new ArrayList<>();
//		listOfStrings.add("Anoush");   // 0
//		listOfStrings.add("Ajibola"); // 1
//		listOfStrings.add("Claire"); // 2
//		listOfStrings.add("James"); // 3
//		
//		System.out.println(listOfStrings.get(1));
		
		// First datatype is the Key
		// Second datatype is the value
		HashMap<String, Integer> nameAndAge = new HashMap<>();
		
		// Add key/value pairs
		nameAndAge.put("Anoush", 29);
		nameAndAge.put("Ajibola", 28);
		nameAndAge.put("Claire", 27);
		
		// Overwrite the existing value for claire.
		nameAndAge.put("Claire", 28);
		
		System.out.println(nameAndAge);
		
		// Get a value
		System.out.println(nameAndAge.get("Claire"));
		
		// Get the size
		System.out.println(nameAndAge.size());
		
		// Remove entries
		nameAndAge.remove("Anoush");
		System.out.println(nameAndAge);

		// Check if a value exists in the HashMap
		System.out.println(nameAndAge.containsValue(28));
		
		// Clear the hashmap
//		nameAndAge.clear();
		
		// Loop through the key
		for (String name : nameAndAge.keySet()) {
			System.out.println(name);
		}
		
		// Loop through the values
		for (Integer age : nameAndAge.values()) {
			System.out.println(age);
		}
		
		// Loop through BOTH the keys and values - known as Entries
		// To loop through both, you need to use an 'entry set'
		for (Entry<String, Integer> entry : nameAndAge.entrySet()) {
			System.out.println(entry);
		}
	}
}

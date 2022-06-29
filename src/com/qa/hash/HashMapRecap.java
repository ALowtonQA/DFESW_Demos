package com.qa.hash;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapRecap {

	// Key/Value pairs instead of index/value like lists
	private HashMap<String, String> capitalCities = new HashMap<>();
	
	public void hashMapRecapMethod() {
		// Add Values
		capitalCities.put("Spain", "Madrid");
		capitalCities.put("England", "London");
		
		// Get Values
		capitalCities.get("England"); // returns "London"
		
		// Remove
		capitalCities.remove("England"); // Removes "England" entry.
		
		// Get the size of the map
		capitalCities.size();
		
		// Clear the entire map
		capitalCities.clear();
		
		// Loop through keys
		for (String key : capitalCities.keySet()) {
			System.out.println(key);
		}
		
		// Loop through values
		for (String value : capitalCities.values()) {
			System.out.println(value);
		}
		
		// Loop through both - key/value pairs - known as 'Entry'
		for (Entry<String, String> entry : capitalCities.entrySet()) {
			System.out.println(entry);
		}
	}
	
}

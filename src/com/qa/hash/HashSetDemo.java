package com.qa.hash;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// Key/Value pairs
		// We don't choose the key
		// The key is a hash code of the value
		// The keys are unique
		// So you can't have duplicate objects
		// Order is not preserved
		HashSet<String> myHashSet = new HashSet<>();
		
		myHashSet.add("Anoush");
		myHashSet.add("Claire");
		myHashSet.add("Charles");
		
		// This will overwrite the previous "Anoush" String in the set
		// You CAN NOT add duplicate values.
		myHashSet.add("Anoush");
		
		System.out.println(myHashSet);
		
		// Size of the set
		System.out.println(myHashSet.size());
		
		// check if the set is empty or not
		System.out.println(myHashSet.isEmpty()); // true or false
		
		// Remove from the set
		myHashSet.remove("Anoush");
		
		// Check if the hashset contains an object
		System.out.println(myHashSet.contains("Claire"));
		
		// This is what a hashcode looks like
//		System.out.println("Charles".hashCode());
	}
	
}

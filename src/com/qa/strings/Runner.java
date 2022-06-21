package com.qa.strings;

public class Runner {

	public static void main(String[] args) {
		
		// String literals - These are stored in Java String Pool
		// Uses the SAME area in memory
		// They are the same object in memory
//		String message = "My Message";
//		String anotherMessage = "My Message";

		// This checks if the objects are the same object in memory
//		if (message == anotherMessage) {
//			System.out.println("They are the same!");
//		} else {
//			System.out.println("They are NOT the same! :(");
//		}
		
		// String Objects - These are DIFFERENT objects in memory
		String message = new String("My Message");
		String anotherMessage = new String("My Message");		
		
		// Actually compares string VALUES to see if they're equal
		if (message.equals(anotherMessage)) {
			System.out.println("They are the same!");
		} else {
			System.out.println("They are NOT the same! :(");
		}
		
		// You can check if two strings are equal and ignore the case!
		if (message.equalsIgnoreCase(anotherMessage)) {
			System.out.println("They Match!!");
		} else {
			System.out.println("They don't match :(");
		}
		
		// Get the length of the string!
		System.out.println(message.length());
		
		// String concatenation (Joining mulitple strings together);
		String thirdString = message + " " + anotherMessage;
		System.out.println(thirdString);
		
		String fourthString = message.concat(" ").concat(anotherMessage);
		System.out.println(fourthString);
		
		// You can also concatenate numbers onto strings!
		int num = 10;
		String fifthString = message + " " + num;
		System.out.println(fifthString);
		
		// String manipulation methods
		
		// Substring - extract strings from within other strings
		// Includes the first index
		// Does not include the final index
		
		// This gets everything from index 3, to the END of the string
		System.out.println(message.substring(3, message.length()));
		
		// This gets me a string from index 0, to index 2 (not including 2) - so 0 & 1.
		System.out.println(message.substring(0, 2));
		
		// Changing case
		String one = "aNoUsH@eMaIl.CoM";
		String two = "anoush@email.com";

		// you can change the case to match string values
		String oneUpper = one.toUpperCase();
		String twoUpper = two.toUpperCase();
		
		if (oneUpper.equals(twoUpper)) {
			System.out.println("They Match!!");
		} else {
			System.out.println("They don't match :(");
		}
		
		// You can also make it lowercase
		System.out.println(message.toLowerCase());
		
		// Get individual characters at a specific index
		System.out.println(message.charAt(7));
		
		// Get the index of a specific character
		System.out.println(message.indexOf('s'));
		
		// Starts with - Checks if a string starts with another string - Case sensitive
		System.out.println(message.startsWith("My"));
		// Ends with - Checks if a string ends with another string - Case sensitive
		System.out.println(message.endsWith("e"));
		
		// Replace - replaces one string, with another - Also case sensitive
		System.out.println(message.replace("My", "Your"));
		
		// Strip - Removes leading and trailing whitespace (spaces)
		String email = "      anoush@email.com        ";
		String emailFixed = email.strip();
		System.out.println(emailFixed);
		
		// Split
		String sentence = "Hello there class";
		String[] words = sentence.split(" "); // splitting on space, usually splits up words
		
		for (String word : words) {
			System.out.println(word);
		}
		
		System.out.println(words.length);
		
		// Contains - Checks if one string contains another - Case sensitive
		System.out.println(sentence.contains("class"));
	}
}

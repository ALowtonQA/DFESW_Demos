package com.qa.hash.hashmapexercise;

import java.util.HashMap;

public class MorseTranslator {

	private HashMap<String, String> morseMap = new HashMap<>();

	public MorseTranslator() {
		this.morseMap.put(".-", "a");
		this.morseMap.put("-...", "b");
		this.morseMap.put("-.-.", "c");
		this.morseMap.put("-..", "d");
		this.morseMap.put(".", "e");
		this.morseMap.put("..-.", "f");
		this.morseMap.put("--.", "g");
		this.morseMap.put("....", "h");
		this.morseMap.put("..", "i");
		this.morseMap.put(".---", "j");
		this.morseMap.put("-.-", "k");
		this.morseMap.put(".-..", "l");
		this.morseMap.put("--", "m");
		this.morseMap.put("-.", "n");
		this.morseMap.put("---", "o");
		this.morseMap.put(".--.", "p");
		this.morseMap.put("--.-", "q");
		this.morseMap.put(".-.", "r");
		this.morseMap.put("...", "s");
		this.morseMap.put("-", "t");
		this.morseMap.put("..-", "u");
		this.morseMap.put("...-", "v");
		this.morseMap.put(".--", "w");
		this.morseMap.put("-..-", "x");
		this.morseMap.put("-.--", "y");
		this.morseMap.put("--..", "z");
		this.morseMap.put(".---", "j");
		this.morseMap.put("-.-", "k");
		this.morseMap.put(".-..", "l");
		this.morseMap.put("--", "m");
		this.morseMap.put("-.", "n");
		this.morseMap.put("---", "o");
		this.morseMap.put(".--.", "p");
		this.morseMap.put("--.-", "q");
		this.morseMap.put(".-.", "r");
		this.morseMap.put("...", "s");
		this.morseMap.put("-", "t");
		this.morseMap.put("..-", "u");
		this.morseMap.put("...-", "v");
		this.morseMap.put(".--", "w");
		this.morseMap.put("-..-", "x");
		this.morseMap.put("-.--", "y");
		this.morseMap.put("--..", "z");

		this.morseMap.put("/", " ");
	}

	public String translate(String input) {
		String[] inputArray = input.split(" ");
		String output = "";
		
		for (String value : inputArray) {
			output += morseMap.get(value);
		}
		
		return output;
	}

}
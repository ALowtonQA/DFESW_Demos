package com.qa.solid.openclosed.exercise;

public class Greeter {

	private String greetingType;

	public void setGreetingType(String greetingType) {
		this.greetingType = greetingType;
	}

	public String greet() {
		if ("formal".equals(this.greetingType)) {
			return "Good evening, Sir.";
		} else if ("casual".equals(this.greetingType)) {
			return "Sup m8?";
		} else if ("friendly".equals(greetingType)) {
			return "Hi, hope you're well";
		} else {
			return "Hello";
		}
	}
}

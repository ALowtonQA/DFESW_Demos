package com.qa.solid.liskov.animalsolution;

// Child class
public class Penguin extends Bird implements Flightless {

	@Override
	public void flap() {
		System.out.println("I'm trying to fly... but can't :(");
	}

}

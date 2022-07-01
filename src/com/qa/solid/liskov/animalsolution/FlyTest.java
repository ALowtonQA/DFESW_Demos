package com.qa.solid.liskov.animalsolution;

public class FlyTest {

	public void learnToFly(Flying bird) { 
		bird.fly();
	}
	
	public void tryToFly(Flightless bird) { 
		bird.flap();
	}
}

package com.qa.classmembers;

public class Car {

	// Attributes
	public String make;
	public String model;
	public int numOfDoors;
	public boolean hasSunroof;
	
	// Static class member - This means it belongs to the class NOT the objects
	public static int numOfCarsCreated = 0;
	
	// Methods
	public Car(String make, String model, int numOfDoors, boolean hasSunroof) {
		this.make = make;
		this.model = model;
		this.numOfDoors = numOfDoors;
		this.hasSunroof = hasSunroof;
		numOfCarsCreated++;
		System.out.println("Car created!");
	}

	public void drive() {
		System.out.println("I'm Driving!!!!");
	}
}

package com.qa.oop.garage;

public class Boat extends Vehicle {

	// NO extra attributes YET
	// They would need getters and setters
	
	public Boat(String make, String colour, int numOfWheels) {
		super(make, colour, numOfWheels);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateBill() {
		System.out.println("The bill for a boat is £250");
		
	}

}

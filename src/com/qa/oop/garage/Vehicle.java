package com.qa.oop.garage;

public class Vehicle {

	private String make;
	private String colour;
	private int numOfWheels;

	public Vehicle(String make, String colour, int numOfWheels) {
		super();
		this.make = make;
		this.colour = colour;
		this.numOfWheels = numOfWheels;
	}

	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getNumOfWheels() {
		return numOfWheels;
	}
	
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public void calculateBill() {
		System.out.println("");
	}
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", colour=" + colour + ", numOfWheels=" + numOfWheels + "]";
	}
	
}

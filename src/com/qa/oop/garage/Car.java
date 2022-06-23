package com.qa.oop.garage;

public class Car extends Vehicle {

	private boolean hasSunRoof;
	private int numOfDoors;
	
	public Car(String make, String colour, int numOfWheels, boolean hasSunRoof, int numOfDoors) {
		super(make, colour, numOfWheels);
		this.hasSunRoof = hasSunRoof;
		this.numOfDoors = numOfDoors;
	}

	public boolean isHasSunRoof() {
		return hasSunRoof;
	}
	
	public void setHasSunRoof(boolean hasSunRoof) {
		this.hasSunRoof = hasSunRoof;
	}
	
	public int getNumOfDoors() {
		return numOfDoors;
	}
	
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	@Override
	public void calculateBill() {
		System.out.println("The bill for the car is £50");
	}
	
	
	@Override
	public String toString() {
		return "Car [hasSunRoof = " + hasSunRoof + ", numOfDoors = " + numOfDoors + ", Make = " + getMake()
				+ ", Colour =" + getColour() + ", NumOfWheels =" + getNumOfWheels() + "]";
	}
	

}

package com.qa.oop.garage;

public class Motorcycle extends Vehicle {

	private int handleBarWidth;

	public Motorcycle(String make, String colour, int numOfWheels, int handleBarWidth) {
		super(make, colour, numOfWheels);
		this.handleBarWidth = handleBarWidth;
	}

	public int getHandleBarWidth() {
		return handleBarWidth;
	}

	public void setHandleBarWidth(int handleBarWidth) {
		this.handleBarWidth = handleBarWidth;
	}

	@Override
	public void calculateBill() {
		System.out.println("The bill for the bike is £20");
	}
	
	@Override
	public String toString() {
		return "Motorcycle [handleBarWidth=" + handleBarWidth + ", Make = " + getMake() + ", Colour = "
				+ getColour() + ", NumOfWheels = " + getNumOfWheels() + "]";
	}
	
}

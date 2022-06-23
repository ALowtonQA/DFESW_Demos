package com.qa.oop.garage;

public class Van extends Vehicle {

	private int storageSpace;

	public Van(String make, String colour, int numOfWheels, int storageSpace) {
		super(make, colour, numOfWheels);
		this.storageSpace = storageSpace;
	}

	public int getStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}
	
	@Override
	public void calculateBill() {
		System.out.println("The bill for the van is £100");
	}

	@Override
	public String toString() {
		return "Van [storageSpace=" + storageSpace + ", Make = " + getMake() + ", Colour = " + getColour()
				+ ", NumOfWheels = " + getNumOfWheels() + "]";
	}
	
}

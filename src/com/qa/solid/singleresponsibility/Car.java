package com.qa.solid.singleresponsibility;

// POJO - Plain old Java object
// Responsiblity of this class is to define a car, so we can make Car objects.
public class Car {

	// Class properties
	private String colour;
	private String model;
	private int mileage;
	private boolean hasSpoiler;
	
	// Constructor
	public Car(String colour, String model, int mileage, boolean hasSpoiler) {
		super();
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
		this.hasSpoiler = hasSpoiler;
	}
	
	// Getters and Setters
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public boolean isHasSpoiler() {
		return hasSpoiler;
	}
	
	public void setHasSpoiler(boolean hasSpoiler) {
		this.hasSpoiler = hasSpoiler;
	}
}

package com.qa.solid.openclosed;

// POJO - Plain old java object
public class Circle implements Shape{

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return getRadius() * getRadius() * Math.PI;
	}
	
}

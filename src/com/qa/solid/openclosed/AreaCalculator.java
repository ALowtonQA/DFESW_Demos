package com.qa.solid.openclosed;

public class AreaCalculator {

//	We would need to add separate methods for EVERY shape!
//	public double calculateAreaRectangle(Rectangle rect) {
//		return rect.getLength() * rect.getWidth();
//	}
//	
//	public double calculateAreaCircle(Circle circle) {
//		return circle.getRadius() * circle.getRadius() * Math.PI;
//	}
//	
//	public double calculateAreaTriangle(Triangle triangle) {
//		return 0.5 * triangle.getBase() * triangle.getHeight();
//	}
	
	// This never needs to change.
	// It works for ALL shapes.
	// Therefore it is now CLOSED FOR MODIFICATION ! :D
	public double calculateArea(Shape shape) {
		return shape.calculateArea();
	}
}

package com.qa.solid.openclosed;

public class Runner {

	public static void main(String[] args) {
		
		// Shapes
		Rectangle rectangle = new Rectangle(10, 6);
		Circle circle = new Circle(10);
		Triangle triangle = new Triangle(10, 5);
		
		// Area Calculator
		AreaCalculator calc = new AreaCalculator();
		
		double areaRect = calc.calculateArea(rectangle);
		double areaCircle = calc.calculateArea(circle);
		double areaTri = calc.calculateArea(triangle);
		
		System.out.println("Area of rectangle: " + areaRect);
		System.out.println("Area of circle: " + areaCircle);
		System.out.println("Area of triangle: " + areaTri);
	}

}

package com.qa.classmembers;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Number of cars: " + Car.numOfCarsCreated);
		
		Car myCar = new Car("Skoda", "Octavia", 5, false);
		Car bmwM4 = new Car("BMW", "M4", 3, true);
		Car merc = new Car("Mercedes", "A5", 5, false);
		Car nissan = new Car("nissan", "skyline", 3, true);

		myCar.drive();
		bmwM4.drive();
		merc.drive();
		nissan.drive();
		
		System.out.println("Number of cars: " + Car.numOfCarsCreated);
		
	}
}

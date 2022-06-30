package com.qa.solid.singleresponsibility;

public class Runner {

	public static void main(String[] args) {
		
		
		Car myCar = new Car("black", "A5", 5000, false);
		
		Car MyOtherCar = new Car("Blue", "M5", 7000, true);
		
		System.out.println(myCar.getMileage());
		
		Driver driver = new Driver();
		
		driver.drive(myCar, 500);
		
		System.out.println(myCar.getMileage());
		
		Mechanic mech = new Mechanic();
		mech.setCar(myCar);
		mech.paintCar("Red");
		mech.changeSpoiler(true);
		
		mech.setCar(MyOtherCar);
		mech.paintCar("Black");
		mech.changeSpoiler(false);
		
		
	}	
}

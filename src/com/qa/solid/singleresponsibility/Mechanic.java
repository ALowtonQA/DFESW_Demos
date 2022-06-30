package com.qa.solid.singleresponsibility;

public class Mechanic {

	private Car car;
	
	public void paintCar(String newColour) {
		car.setColour(newColour);
	}
	
	public void changeSpoiler(boolean flag) {
		car.setHasSpoiler(flag);
	}

	public void setCar(Car car) {
		this.car = car;
	}

}

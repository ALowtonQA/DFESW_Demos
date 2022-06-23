package com.qa.oop.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	// ANY child of Vehicle can be stored here
	private List<Vehicle> garage = new ArrayList<>();
	
	// Add a vehicle
	public void add(Vehicle input) {
		garage.add(input);
	}
	
	public void printList() {
		for(int i = 0; i < garage.size(); i++) {
			System.out.println(garage.get(i));
		}
		
//		for(Vehicle vehicle : garage) {
//			System.out.println(vehicle);
//		}
	}
	
	public void calculateBills() {
		for(Vehicle vehicle : garage) {
			vehicle.calculateBill();
		}
	}
	
	public void removeByType(String type) {
		List<Vehicle> toBeRemoved = new ArrayList<>();
		
		for(Vehicle vehicle : garage) {
			
			if (vehicle.getClass().getSimpleName().equals(type)) {
				toBeRemoved.add(vehicle);
			}
			
		}
		
		for (Vehicle vehicle : toBeRemoved) {
			garage.remove(vehicle);
			
			System.out.println();
			System.out.println("Vehicle removed!");
			System.out.println();
		}
	}
	
	public void emptyGarage() {
		garage.clear();
		System.out.println("The Garage Was Emptied!");
	}
}

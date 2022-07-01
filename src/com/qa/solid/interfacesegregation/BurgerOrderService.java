package com.qa.solid.interfacesegregation;

public class BurgerOrderService implements OrderService {

	@Override
	public void orderBurger(int quantity) {
		System.out.println("Received order of " + quantity + " burgers.");
		
	}

	@Override
	public void orderFries(int fries) {
		throw new UnsupportedOperationException("Can't order fries here");
		
	}

	@Override
	public void orderMeal(int numOfBurgers, int numOfFries) {
		throw new UnsupportedOperationException("Can't order meals here");
	}
	
}

package com.qa.solid.interfacesegregation.solution;

public class BurgerAndFries implements BurgerOrderService, FriesOrderService {

	@Override
	public void orderFries(int fries) {
		System.out.println("Number of fries: " + fries);
	}

	@Override
	public void orderBurger(int quantity) {
		System.out.println("Number of burgers: " + quantity);		
	}

}

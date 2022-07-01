package com.qa.solid.liskov.exercise;

public class BedroomAdder {
	
    public void addBedroom(BedroomAddable apartment) {
    	apartment.setNumberOfBedrooms(apartment.getNumberOfBedrooms() + 1);
    }

}
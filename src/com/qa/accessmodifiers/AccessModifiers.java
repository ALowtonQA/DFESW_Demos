package com.qa.accessmodifiers;

public class AccessModifiers {

	// This can be accessed from ANYWHERE
	// With read/write access
	public String name = "Anoush";
	
	// This can only be access from THIS CLASS
	// We can control read/write access from elsewhere
	private int age = 29;
	
	// This is default
	// Can only be accessed from classes in the SAME package
	// With read/write access
	String jobTitle = "Software Dev";
	
	// The same as default
	// Except subclasses/child classes can also access it
	// No matter where they are.
	protected double height = 6.4;
}

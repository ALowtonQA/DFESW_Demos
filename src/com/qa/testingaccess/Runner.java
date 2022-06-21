package com.qa.testingaccess;

import com.qa.accessmodifiers.AccessModifiers;

public class Runner {

	public static void main(String[] args) {
		
		AccessModifiers access = new AccessModifiers();
		
		access.name = "Ajibola";
		System.out.println(access.name);
		
//		access.age = 30; // Can't write to private property
//		System.out.println(access.age); // Can't read private property
		
//		System.out.println(access.jobtitle); // Can't access this because we're in a different package
	}

}

package com.qa.solid.dependencyinversion.exercise;

public class Runner {

	public static void main(String[] args) {
		FrontEndDeveloper frontEndDev = new FrontEndDeveloper();
		BackEndDeveloper backEndDev = new BackEndDeveloper();
		
		Project p = new Project();
		
		p.implement(frontEndDev);
		p.implement(backEndDev);
	}

}

package com.qa.oop.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		SmartPhone smart = new SmartPhone();
		
		List<MusicPlayer> myList = new ArrayList<>();
		
		myList.add(smart);

		System.out.println(myList);
		
	}

}

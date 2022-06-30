package com.qa.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample<T> {

	private List<T> storage = new ArrayList<>();

	public void addToStorage(T input) {
		storage.add(input);
	}
	
	public T getFromStorage(int index) {
		return storage.get(index);
	}
	
}

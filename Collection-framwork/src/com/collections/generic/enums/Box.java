package com.collections.generic.enums;

public class Box<T extends Number> {
// This is a copy of the Box Class to learn about Generic constructors 

	private T value;
	
	// This is how you create a generic constructor 
	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}

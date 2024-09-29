package com.collections.generic.enums;

//This class is to show case that we can have a generic constructor in a non generic class
public class Box2 {

	public <T extends Number> Box2(T value) {
		
	}
	
	public static void main(String[] args) {
		Box2 box2 = new Box2(123);
	}
	
}

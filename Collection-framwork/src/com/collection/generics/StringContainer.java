package com.collection.generics;

public class StringContainer<T> implements Container<T> {

	// We have created a class that is implementing the container Interaface
	
	private T item;
	
	public void add(T item) {
		this.item = item;
		
	}


	public T get() {
		// TODO Auto-generated method stub
		return item;
	}
	
	// So this is an example where we are implementing a Generic Inteface where the class where it is being implemented to is not generic
	// Now if I want to to turn this class into a generic type we can do that and also use the <T>
	// when we create an object out of this class
}
package com.collection.generics;

// Once we have an interface we can make this interface generic by adding the <T>
public interface Container<T> {

	// Now lets define a method in the Ingerface
	
	void add( T item);
	
	// Now I will create a class that is going to implement this interface
	
	T get();
}

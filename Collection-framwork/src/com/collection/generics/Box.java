package com.collection.generics;

public class Box<T extends Number> {
	
	// Now we can also add conditions to a particular parameter which will either extend a class or implement an interface
	// In this class we have extended the Box class T parameter to Number class why because number is a superclass of all int float double etc

	private T value;
	
	//Here we need to change this normal class into a generic type class so that we can provide this class with a datatype
	// To add a generic type to the class while adding the class name we will use the diamond brackets to add the keyword T which stands for Type
	// class Box<T> { } like this
	// So now when we create an object from this class we will define the value of T then if its integer or string etc
	// Now instead of using Object as the datatype we will use T as the datatype so they datatype can also vary based on the object that has been created for the Class.
	// After we do that our box class is Generic type.
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
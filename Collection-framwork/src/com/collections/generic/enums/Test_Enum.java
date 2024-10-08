package com.collections.generic.enums;

import java.util.Iterator;

enum Day {
	SUNDAY, MONDAY, TUEDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


enum Operation {
	
	ADD, SUBTRACT, MULTIPLY, DIVIDE;
	
	// we notice that the operations mentioned above are all mathematical operations
	// so we will add generic enum method here 
	
	public <T extends Number> double apply(T a, T b) {
		switch (this) {
		case ADD:
			return a.doubleValue() + b.doubleValue();
		case SUBTRACT:
			return a.doubleValue() - b.doubleValue();
		case MULTIPLY:
			return a.doubleValue() * b.doubleValue();
		case DIVIDE:
			return a.doubleValue() / b.doubleValue();
		default:
			throw new AssertionError("Unknown operation " + this);
		
		}
		
	}
	
}

public class Test_Enum {

	// How to create Generic Methods

	public <T> void methodnName(T paramater) {
		// This is the Syntax to create a generic method
	}

	// Now if I want a function with a particular type of array or array list which
	// is generic lets see how we can do that
	public <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.println(element + " ");
		}

	}
	// We can also overload a method one with generic type and one with a hard-coded
	// data type

	public void display(Integer element) {
		System.out.println("Integer display :" + element);
	}

	public <T> void display(T element) {
		System.out.println("Generic display: "  + element);
	}

	public static void main(String[] args) {
		Day day = Day.MONDAY;

		// this is how we can use Enums so that we only take a value from the given
		// options
		// Now lets check Generic Constructor

		// Now we can create an object of Test class and use the print array method's
		// object

		Test_Enum test = new Test_Enum();

		Integer[] intarray = { 1, 2, 3, 4, 5 };
		String[] strarray = { "Nishant", "Gupta" };

		test.printArray(intarray);
		test.printArray(strarray);
		test.display("Nishant");
		// When we are calling it with integer the generic method will be called 
		test.display(1234);
		// When we will be calling it 
		test.display("Nishant gupta");
		
		// lets call the operations method which is using the enums
		double res1 = Operation.ADD.apply(1000,234);
		double res2 = Operation.MULTIPLY.apply(2344, 100);
		System.out.println(res1);
		System.out.println(res2);
		
		
		
	}

}

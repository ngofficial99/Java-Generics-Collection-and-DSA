package com.collection.generics;

import java.util.ArrayList;

import com.collection.generics.box.Box;

public class main {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		// this is how we define an array in java 
		// in an array you have to define what the length of the array is going to be but thats not the case in array list
		
		// Similar to array we have array list
		ArrayList list = new ArrayList();
		list.add("Hello");
		// this is how you add an object to an array list using the add key word
		// now if i want to get the object at the 0th index of this list
		// i will make use of the get method'
		//System.out.println(list.get(0));
		list.add(123);
		// we can add any data type to an Arraylist
		
		list.add(2.123);
		
		// now if i want to store it into a variable we have to to store it in an object
		// If i want to store an object as a string we have to cast it 
		String str = (String) list.get(0);
		//  similarly if we try to add the second element to an int we have to cast it 
		Integer integer = (Integer) list.get(1);
		//String str1 = (String) list.get(1);
		
		//Now lets say If i try to cast an Interger to a String variable then we will get an runtime error
		
		// So this is an issue with ArrayList, It is not type safe,
		//An d we have to manually cast the objects 
		
		//So in Generics we can give a datatype to my array list so that it will only accept data of a particular data type
		
		ArrayList<String> strlist = new ArrayList<String>();
		
		strlist.add("Nishant");
		// now if i try to add a int to this string arraylist we will witness the issue it will throw an error
//		strlist.add(123);
		
		//So now we wont be able to add any other data type in the array list, so there is no issue of conversion or manual casting.
		// So the Generics allowed us to implement No type safety
		//
		
		
		//Now we have created the Box object with getter and setter now lets try to access
		
		Box box = new Box();
		
		box.setValue(1);
		//After setting the value inside the box class we will try to store the value of box in a variable and that variable will require cast 
		
//		String i = (String) box.getValue();
		
//		System.out.println(i);
		
		// Now we are getting a runtime error
		//Now we have to make the Box class generic type to make sure we dont get a runtime error
		// Notice the changes done to the Box class before moving forward
		
		// WE will create a new Object from the box class
		
		Box<Integer> box1 = new Box<>();
		// Now this box object is of interger type
		//box1.setValue("Nishanty"); // If i try to set a String as its value it will throw error on the complile time and not on the run time 
    	box1.setValue(123);
		
    	Integer i = box1.getValue();
    	System.out.println(i);
		
	}

}

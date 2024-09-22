package com.collection.generics;

import java.util.ArrayList;

public class Generics_intro {
	
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
		
		
		
		
		
		
		
	}

}
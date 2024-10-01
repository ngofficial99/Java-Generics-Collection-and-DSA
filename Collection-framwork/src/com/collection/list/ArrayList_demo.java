package com.collection.list;

import java.util.*;

// ArrayList is an Dynamic array
// We use ArrayList when we are not sure about the size of the array.
// Internally it uses a normal array, set to some default capacity.
// When the capacity is reached, it will create a new array of bigger size( 50% of its current capacity) copies all the elements from the old array to the new array.
// New Array's reference for its internal usage.
// the old array is of no use now so it is garbage collected and then its gone.
public class ArrayList_demo {

	
	public static void main(String[] args) {
		
		// To create an ArrayList 
		List<Integer> alist = new ArrayList<>();
		
		
		// to add an element to the list we can use the add method
		
		alist.add(11);
		alist.add(22);
		alist.add(33);
		alist.add(44);
		
		
		// To print an array list we can use a for loop
		for (Integer integer : alist) {
			System.out.println(integer);
		}
		
	}
}

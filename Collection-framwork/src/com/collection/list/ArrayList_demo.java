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
		
		// in-case we want to modify an element of the arraylist at a particular index
		// i.e index 1, replace 22 to 23
		
		alist.set(1, 23);
		
		
		
		// To print an array list we can use a for loop
		for (Integer integer : alist) {
			System.out.println(integer);
		}
		
		// We can also directly print an Arraylist, it will be printed in form of an array
		System.out.println(alist);
		
		// Creating a new ArrayList, but this ArrayList will be created from the previous arraylist 
		// ArrayList it self is a class that takes a constructor so we can pass the previous array list while creating the new arraylist
		
		List<Integer> list2 = new ArrayList<>(alist); 
		for(Integer element : list2) {
			System.out.println(element);
		}
		
		// we can see that the new arraylist has all the elements of the prvious arraylist
		
	}
}

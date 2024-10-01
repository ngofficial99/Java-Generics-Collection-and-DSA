package com.collection.maps;

public class CollectionsTest {

	public static void main(String[] args) {

		Our_GenericList<Integer> list1 = new Our_GenericList<>();
		
		list1.add(1);
		list1.add(2);
		
		Integer value = list1.getItemAtIndex(0);
		System.out.println(value);	
	}
	
}

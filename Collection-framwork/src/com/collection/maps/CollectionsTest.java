package com.collection.maps;

import java.util.Iterator;

public class CollectionsTest {

	public static void main(String[] args) {

		Our_GenericList<Integer> list1 = new Our_GenericList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		Iterator<Integer> iterator = list1.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
	}
	
}

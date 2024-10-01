package com.collection.maps;

public class Our_GenericList<T> {
	private T[] items ;
	private int size;
	

	public void OurGenericList() {
		size = 0;
		items = (T[])new Object[100];
	}
	
	public void add(T item) {
		items[size ++] = item;
	}
	
	public T getItemAtIndex( int index) {
		return items[index];
	}

}

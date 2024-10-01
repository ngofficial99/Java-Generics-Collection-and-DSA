package com.collection.maps;

import java.util.Iterator;

public class Our_GenericList<T> implements Iterable<T> {
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

	@Override
	public Iterator<T> iterator() {
		return new OurGenericListIterator(this);
		}
	
	private class OurGenericListIterator implements Iterator<T> {
		
		private Our_GenericList<T> list;
		private int index = 0;

		public OurGenericListIterator(Our_GenericList<T> list) {
			this.list = list;
		}

		@Override
		public boolean hasNext() {
			return index < list.size;
		}

		@Override
		public T next() {
			return list.items[index++];
		}
		
	}

}

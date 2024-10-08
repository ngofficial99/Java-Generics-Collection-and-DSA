package com.collection.generics;

// Now in this class we are trying to see that there can be multiple parameters in a generic class
public class Pairs<K,V> {
	private K key;
	// The key can have a different datatype
	
	private V Value;
	//The value can have a different data type 
	// i.e : Key can be "Phone Number" which is a string and value can be 676767676 which is long
	
	public Pairs(K key, V value) {
		super();
		this.key = key;
		Value = value;
	}

	public K getKey() {
		return key;
	}


	public V getValue() {
		return Value;
	}

	// Now we can go to the main class and create a new Object with this class Pairs

}

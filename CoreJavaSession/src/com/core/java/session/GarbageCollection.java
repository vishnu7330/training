package com.core.java.session;

public class GarbageCollection {

	public static void main(String[] args) {

		GarbageCollection gc1 = new GarbageCollection();
		GarbageCollection gc2 = new GarbageCollection();
		GarbageCollection gc3 = new GarbageCollection();

		/** 3 ways a object reference can be removed **/
		/** object becomes eligible for Garbage Collection **/

		// re assigning with different object
		gc1 = gc2;

		// setting to null
		gc3 = null;

		// anonymous object
		new GarbageCollection().toString();

		System.out.println("Calling System.gc()");
		// no guarantee that Garbage collector will run always
		System.gc();
	}

}

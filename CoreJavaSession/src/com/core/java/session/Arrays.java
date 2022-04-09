package com.core.java.session;

public class Arrays {

	public static void main(String[] args) {

		// array initialization with primitives
		int[] myNum = { 10, 20, 30, 40 };

		for (int i = 0; i < myNum.length; i++) {
			System.out.println(" Array index i = " + i + " value = " + myNum[i]);
		}

		// array initialization with objects
		Dog dog1 = new Dog(5);
		Dog dog2 = new Dog(10);
		Dog dog3 = new Dog(20);

		Animal[] animals = { dog1, dog2, dog3 };

		// also can be initialized in the following way
		// Animal[] animals = { new Dog(5), new Dog(10), new Dog(20) };

		for (int i = 0; i < animals.length; i++) {
			System.out.println(" Array index i = " + i + " age = " + animals[i].getAge());
		}
	}

}

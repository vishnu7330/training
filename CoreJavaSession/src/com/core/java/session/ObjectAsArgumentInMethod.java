package com.core.java.session;

/* Passing object as an method argument */
public class ObjectAsArgumentInMethod {

	public static void main(String[] args) {

		Dog dog = new Dog("Walter");

		printDetails(dog);

		System.out.println("Age after modifying: " + dog.getAge());

	}

	private static void printDetails(Dog dogReference) {

		System.out.println("age -> " + dogReference.getAge());

		System.out.println(dogReference);

		dogReference.setAge(25);
	}

}

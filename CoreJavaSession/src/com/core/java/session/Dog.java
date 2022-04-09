package com.core.java.session;

/* method overriding */
public class Dog extends Animal {

	public Dog() {
		// Default Constructor
	}

	// Constructor overloading
	public Dog(int age) {
		super(age);
	}

	public Dog(String name) {
		super(name);
	}

	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
	public void animalSound(int age) {
		System.out.println("The dog says: bow wow, my age is " + age);
	}

}
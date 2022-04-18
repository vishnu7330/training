package com.core.java.session;

/* method overriding */
//child class
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
	//overwritten method
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
	public void animalSound(int age) {
		System.out.println("The dog says: bow wow, my age is " + age);
	}
	
	public void bark() {
		System.out.println("I'm loud");
	}

}
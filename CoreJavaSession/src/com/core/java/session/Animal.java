package com.core.java.session;

import java.util.Objects;

public class Animal{

	private String name;
	private int age = 11;

	/** super class constructor **/
	// Default Constructor
	public Animal() {

	}

	// Overloaded Constructor 1
	public Animal(String name) {
		this.name = name;
	}

	/** super class constructor **/
	// Overloaded Constructor 2
	public Animal(int age) {
		this.age = age;
	}
	
	// Overloaded Constructor 3
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void animalSound() {
		System.out.println("The animal makes a sound");
	}

	/* method overloading */
	public void animalSound(int age) {
		System.out.println("The animal makes a sound, age is " + age);
	}
	
	/* method overloading */
	public void animalSound(String name, int age) {
		System.out.println("The animal makes a sound, age is " + age);
	}

	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString() method overriding
	@Override
	public String toString() {
		return name;
	}

	// equals() method overriding
	@Override
	public boolean equals(Object object) {
		boolean flag = false;
		System.out.println("equals called");
		if (object != null) {
			// type casting of the argument
			Animal animal = (Animal) object;
			if (animal.getName().equals(this.getName())) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getName());
	}
}
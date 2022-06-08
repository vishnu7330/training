package com.core.java.session;

public class ConstructorExample {

	public int x;

	// simple Constructor
	public ConstructorExample() {
		System.out.println("inside ** Constructor **");
		x = 10;
	}

	// Overloading Constructor
	public ConstructorExample(int x) {
		System.out.println("inside ** Overloaded Constructor **");
		this.x = x;
	}

	// main method
	public static void main(String[] args) {
		System.out.println("inside main method");
		/** Object creation **/
		ConstructorExample constructorExample = new ConstructorExample();
		System.out.println(" x value is " + constructorExample.getX());
		ConstructorExample constructorExampleTwo = new ConstructorExample(20);
		System.out.println(" x value with ** Overloaded Constructor ** is " + constructorExampleTwo.getX());
		System.out.println("exiting main method");
	}

	// getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}

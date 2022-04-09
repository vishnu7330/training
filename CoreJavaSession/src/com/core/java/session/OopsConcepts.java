package com.core.java.session;

/* extends helps to achieve Inheritance */
public class OopsConcepts extends A {

	/* Encapsulation/Abstraction */
	private int data = 100;
	
	/** Static variable **/
	public static int AGE = 25;

	/** CONSTANTS - final keyword **/
	public final static int AVG_LIFE_TIME = 60;
	
	//real projects example
	public static final String url  = "https://google.com/data/api";
	
	/** getters and setters **/
	public int getData() {
		return data;
	}

	public void setData(int data) {
		/* Data validation */
		if( data >= 0) {
			this.data = data;
		} else {
			System.out.println("Value cannot be negative");
		}
	}
	
	/** static method **/
	public static String getMessages() {
		return "Hello";
	}
	
	public static void main(String[] args) {
		AGE = 50;
		OopsConcepts oopsConcepts = new OopsConcepts();
		/* method can be accessed because of Inheritance */
		System.out.println(oopsConcepts.getMessage());
		
		oopsConcepts.getZ();
		
		oopsConcepts.setData(50);
		
		OopsConcepts oopsConcepts2 = new OopsConcepts();
		oopsConcepts2.setData(75);
		
		System.out.println(OopsConcepts.AGE);
		
	}
}

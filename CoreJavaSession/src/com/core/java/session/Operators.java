package com.core.java.session;

public class Operators {

	public static void main(String[] args) {

		/** Arithmetic operators ->  ( + , - , *, /, % )   **/
		int x = 10;
		int y = 5;

		System.out.println("Addition -> " + (x + y));
		System.out.println("Subtraction -> " + (x - y));
		System.out.println("Multiplication -> " + (x * y));
		System.out.println("Division -> " + (x / y));
		System.out.println("Modulus -> " + (x % y));
		
		/** Increment & Decrement operators -> ( ++ , -- ) **/
		System.out.println("Increment - step 1 -> "+ x++); // x = x + 1 
		System.out.println("Increment - step 2 -> "+ x);
		System.out.println("Decrement - step 1 -> "+ y--);
		System.out.println("Decrement - step 2 -> "+ y);
		
		/** Relational / Comparison operators -> ( ==, !=, >, < , >=, <= ) **/
		System.out.println("Greater than -> " + (x > y)); // ex: if( age > 40 )
		
		/** Assignment operator -> ( +=, -=, *=, /= , %= ) **/
		int z  = 10;
		z += 5; // same as z = z+5; z becomes 15
		System.out.println("After assignment -> " + z);
		
		/** Logical operators -> ( &&, ||, ! ) **/
		/** AND and OR and NOT operations **/
		int a = 9;
		System.out.println("AND operation -> " + (  (a < 5 )  &&  (a < 10)  ));
		System.out.println("OR operation -> " + (  (a < 5 )  || (a < 10)  ));
		System.out.println("NOT operation -> " + (a != 9));
	}
}
package com.core.java.session;

public class WrapperClasses {

	public static void main(String[] args) {

		// int myInt = 5;
		Integer myInteger = Integer.valueOf(5);
		
		// double myDouble = 5.99;
		Double myDouble = 5.99;

		// char myChar = 'A';
		Character myChar = 'A';

		// boolean flag = true;
		Boolean flag = true;

		System.out.println("int value from Integer Wrapper -> " + myInteger.intValue());

		System.out.println("double value from Double Wrapper -> " + myDouble.doubleValue());

		System.out.println("char value from Character Wrapper -> " + myChar.charValue());

		System.out.println("boolean value from Boolean Wrapper -> " + flag.booleanValue());
		
		int intValue = myInteger.intValue();
		
		// flag.booleanValue() return type is boolean
		boolean test = flag.booleanValue();
		
	}

}

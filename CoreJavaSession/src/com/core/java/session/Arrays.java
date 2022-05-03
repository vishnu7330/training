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

		// Multi dimentional arrays example
		multiDimensionalArrays();
	}

	public static void multiDimensionalArrays() {
		// Two dimensional array:
		int[][] twoDimensionalArray = new int[10][20];

		//Initialization – Syntax:
		//array_name[row_index][column_index] = value;
		twoDimensionalArray[0][0] = 1;
		twoDimensionalArray[9][19] = 200;

		// Three dimensional array:
		int[][][] threeDimensionalArray = new int[10][20][30];

		System.out.println(twoDimensionalArray);
	}

}

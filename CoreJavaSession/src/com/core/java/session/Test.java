package com.core.java.session;

public class Test {

	//global variable - heap memory
	private int balance;
	private int x;
	private int y;
	
	public static int count = 10;
	
	public static final double SENIOR_CITIZEN_INTEREST_RATE = .09;
	
	// default
	public Test() {
		//initialization - default
		x = 50;
		y = 100;
		
	}
	
	//overloaded constructors
	public Test(int x, int y) {
		System.out.println("*** inside overloaded constructtor ***");
		this.x = x;
		this.y = y;
	}
	
	public void testMethod() {
		
		//local variable - create in stack memory
		int x = 12;
		int y = 15;
		
		this.x = x;
		this.y = y;
		
	}

	// main method
	public static void main(String[] args) {

//		Test obj_One = new Test();
		
		Test obj_One = new Test(55,65);
		obj_One.testMethod();
		System.out.println(obj_One);

		obj_One.setX(30);
		obj_One.setY(100);
		
		System.out.println(obj_One);

		// obj_One = null; //cleaning object, Java will run Garbage Collection to
		// removed unused objects

		Test obj_Two = new Test(77,88);
		obj_Two.testMethod();
		
		obj_Two.setX(70);
		obj_Two.setY(90);

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if( x > 0) {
			this.x = x;
		} else {
			System.out.println("Age cannot be negative");
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		// validation
		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.out.println("Error: balance cannot be negative");
		}
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}
	
	
	public static String getMessage() {
		return "this is test message";
	}

}

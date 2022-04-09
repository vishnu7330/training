package com.core.java.session;

public class Test {

	private int x;
	private int y;
	
	//main method
	public static void main(String[] args) {

		Test obj_One = new Test();
		
		obj_One.setX(30);
		obj_One.setY(100);
		
		//obj_One = null; //cleaning object, Java will run Garbage Collection to removed unused objects
		
		Test obj_Two = new Test();
		
		obj_Two.setX(70);
		obj_Two.setY(90);
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

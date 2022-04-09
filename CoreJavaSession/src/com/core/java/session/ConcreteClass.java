package com.core.java.session;

public class ConcreteClass extends ExampleAbstractClass {

	@Override
	public String getMessage() {
		return "from ConcreteClass";
	}

	public static void main(String[] args) {

		ConcreteClass concreteClass = new ConcreteClass();
		System.out.println(concreteClass.getMessage());
	}

}

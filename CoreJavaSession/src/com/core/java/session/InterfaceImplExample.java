package com.core.java.session;

public class InterfaceImplExample implements InterfaceExample {

	@Override
	public String getName() {
		return null;
	}

	@Override
	public int getAge() {
		return 0;
	}

	@Override
	public void setAge(int age) {

	}

	@Override
	public int getInterestRate() {
		return calculateInterestRate();
	}

	public int calculateInterestRate() {
		// i = pnr /100
		//discounts
		return 7;
	}

}

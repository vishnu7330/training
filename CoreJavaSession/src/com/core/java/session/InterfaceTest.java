package com.core.java.session;

public class InterfaceTest {

	public static void main(String[] args) {
		
		InterfaceExample bankApi = new InterfaceImplExample();
		
		bankApi.getInterestRate();
		
		int seniorCitizenAge = InterfaceExample.SENIOR_CITIZEN_AGE;
		
	}

}

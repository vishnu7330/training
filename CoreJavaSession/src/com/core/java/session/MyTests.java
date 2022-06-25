package com.core.java.session;

import java.util.List;

public class MyTests {

	public static void main(String[] args) {
		System.out.println("Message: " + Test.getMessage());
		System.out.println("Count: " + Test.count);
		
		List<String> messages = StringUtils.splitMessage("this is a full string");
		
		
		System.out.println(Test.SENIOR_CITIZEN_INTEREST_RATE);
	}

}

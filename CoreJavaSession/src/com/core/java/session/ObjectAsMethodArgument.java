package com.core.java.session;

public class ObjectAsMethodArgument {

	private static int interest = 10;

	public static void main(String[] args) {
		
		Account account = new SBIAccount();
		
		
		account.setBalance(100);

		System.out.println("before calling method account: " + account);
		System.out.println("before calling method interest: " + interest);

		System.out.println("******************************************");

		changeValues(interest, account);

		System.out.println("after calling method account: " + account);
		System.out.println("after calling method interest: " + interest);

	}

	//pass by reference - objects
	//pass by value - primitives - copy is sent
	private static void changeValues(int interest, Account account) {
		System.out.println("changing balance amount and interest");
		interest = 20;
		account.setBalance(200);
	}

}

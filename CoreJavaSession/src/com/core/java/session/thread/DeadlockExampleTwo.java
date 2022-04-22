package com.core.java.session.thread;

import com.core.java.session.Test;

public class DeadlockExampleTwo {

	public static void main(String[] args) {

		Test testOne = new Test();
		Test testTwo = new Test();

		// start first Thread
		Thread threadOne = new ThreadOne(testOne, testTwo);
		threadOne.start();

		// start second Thread
		Thread threadTwo = new ThreadTwo(testOne, testTwo);
		threadTwo.start();

	}
}

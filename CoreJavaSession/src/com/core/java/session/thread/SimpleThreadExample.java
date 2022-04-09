package com.core.java.session.thread;

/**
 * The major difference is that when a class extends the Thread class, you
 * cannot extend any other class, but by implementing the Runnable interface, it
 * is possible to extend from another class as well
 * 
 * @author tamil
 *
 */
public class SimpleThreadExample extends Thread {

	public void run() {
		// infinite loop
		for (int i = 0; i < 5;) {
			System.out.println(" ******** inside run() *********");
		}
	}

	public static void main(String[] args) {

		Thread thread = new SimpleThreadExample();
		thread.start();

		// infinite loop
		for (int i = 0; i < 5;) {
			System.out.println("inside main");
		}

	}

}

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

	public SimpleThreadExample(String name) {
		super(name);
	}

	public void run() {
		// infinite loop
		for (int i = 0; i < 5;) {
			System.out.println(" ******** inside run() ********* " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		Thread thread1 = new SimpleThreadExample("Thread *** 1 ***");
		//thread1.setDaemon(true);
		thread1.start();

		Thread thread2 = new SimpleThreadExample("Thread *** 2 ***");
		//thread2.setDaemon(true);
		//thread2.setPriority(MAX_PRIORITY);
		thread2.start();

		// infinite loop
		for (int i = 0; i < 5;) {
			System.out.println("inside main");
		}

	}

}

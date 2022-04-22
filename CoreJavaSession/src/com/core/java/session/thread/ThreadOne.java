package com.core.java.session.thread;

import com.core.java.session.Test;

public class ThreadOne extends Thread {

	Test testOne;
	Test testTwo;

	public ThreadOne(Test testOne, Test testTwo) {

		this.testOne = testOne;
		this.testTwo = testTwo;

	}

	@Override
	public void run() {

		// acquire lock on testOne
		synchronized (testOne) {

			System.out.println("ThreadOne acquired the testOne");
			
			pause();

			// acquire lock on testTwo
			synchronized (testTwo) {
				System.out.println("ThreadOne acquired the testTwo");
			}
		}

	}

	private void pause() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

package com.core.java.session.thread;

import com.core.java.session.Test;

public class ThreadTwo extends Thread {

	Test testOne;
	Test testTwo;

	public ThreadTwo(Test testOne, Test testTwo) {

		this.testOne = testOne;
		this.testTwo = testTwo;

	}

	@Override
	public void run() {

		// acquire lock on testTwo
		synchronized (testTwo) {
			System.out.println("ThreadTwo acquired the testTwo");
			
			pause();

			// acquire lock on testOne
			synchronized (testOne) {
				System.out.println("ThreadTwo acquired the testOne");
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

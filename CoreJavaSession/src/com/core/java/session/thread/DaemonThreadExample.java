package com.core.java.session.thread;

class SampleThread extends Thread {

	public void run() {
		boolean d = isDaemon();
		System.out.println("daemon = " + d);
	}
}

public class DaemonThreadExample {

	public static void main(String[] args) throws Exception {
		Thread thread = new SampleThread();
		System.out.println("thread = " + thread.currentThread());
		thread.setDaemon(true);
		thread.start();
	}

}
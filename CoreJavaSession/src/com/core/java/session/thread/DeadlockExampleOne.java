package com.core.java.session.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExampleOne {

	private Lock lock1 = new ReentrantLock(true);
	private Lock lock2 = new ReentrantLock(true);

	public static void main(String[] args) {

		DeadlockExampleOne deadlock = new DeadlockExampleOne();

		new Thread(deadlock::operation1, "Thread: T1").start();
		new Thread(deadlock::operation2, "Thread: T2").start();
	}

	public void operation1() {
		lock1.lock();
		System.out.println("lock1 acquired, waiting to acquire lock2. -->" + Thread.currentThread().getName());

		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		lock2.lock();
		System.out.println("lock2 acquired");

		System.out.println("executing first operation.");

		lock2.unlock();
		lock1.unlock();
	}

	public void operation2() {
		lock2.lock();
		System.out.println("lock2 acquired, waiting to acquire lock1. -->" + Thread.currentThread().getName());

		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		lock1.lock();
		System.out.println("lock1 acquired");

		System.out.println("executing second operation.");

		lock1.unlock();
		lock2.unlock();
	}
}
package com.subex.test;

class AAA implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread Name "
					+ Thread.currentThread().getName() + ": " + i);
		}
	}
}

class BBB extends Thread {
	public void run() {
		for (int i = 65; i <= 69; i++) {
			System.out.println("Thread Name "
					+ Thread.currentThread().getName() + ": " + (char) i);
		}
	}
}

public class Question7 {

	public static void main(String[] args) {

		Runnable runnable = new AAA();
		Thread thread = new Thread(runnable);
		thread.start();
		new BBB().start();
	}
}

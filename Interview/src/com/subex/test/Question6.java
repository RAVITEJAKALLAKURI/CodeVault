package com.subex.test;

class A extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread Name " + this.getName() + ": "+i);
		}
	}
}

class B implements Runnable {
	public void run() {
		for (int i = 65; i <= 69; i++) {
			System.out.println("Thread Name " + Thread.currentThread().getName() + ": "+(char) i);
		}
	}
}

public class Question6 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		Thread thread = new Thread(b);
		a.run();
		thread.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread Name "+Thread.currentThread().getName() + ": " + i);
		}
	}
}

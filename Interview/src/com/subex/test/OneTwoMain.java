package com.subex.test;

/**
 * Exactly
 * @author sridhar.r
 *
 */
class AA extends Thread {
	public void run() {
		System.out.println("1");
	}
}
class BB implements Runnable{
	public void run() {
		System.out.println("2");
	}
}
public class OneTwoMain{
public static void main(String [] args) {
	AA a = new AA();
	BB b = new BB();
	Thread thread = new Thread(b);
	a.run();
	thread.start();
		System.out.println("main");
	}
}




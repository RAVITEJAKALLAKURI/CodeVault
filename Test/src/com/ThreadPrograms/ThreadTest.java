package com.ThreadPrograms;


	 public class ThreadTest implements Runnable {
	
	 public static void main(String[] args) 
	
	 {
	 new Thread(new Tester()).start();
	 new Thread(new Tester()).start();

	 }
	 
	 public void run() 
	 {
		 Thread.currentThread().getId(); 
		 
	 }
	 
}
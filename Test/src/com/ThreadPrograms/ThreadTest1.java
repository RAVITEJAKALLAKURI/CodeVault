package com.ThreadPrograms;

public class ThreadTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread1=new Thread(new ExtendThread(),"thread1");
		Thread thread2=new Thread(thread1,"thread2");
		thread1.start();
		thread2.start();
		thread1.start();

	}

}

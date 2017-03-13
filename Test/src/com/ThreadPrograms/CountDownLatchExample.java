package com.ThreadPrograms;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample implements Runnable {

	
	
	private CountDownLatch countDown;

	public CountDownLatchExample(CountDownLatch cd) {
		// TODO Auto-generated constructor stub
		this.countDown=cd;
	}

	public static void main(String... args)
	{
		
		final CountDownLatch cd=new CountDownLatch(3);
		
		
		Thread t1=new Thread(new CountDownLatchExample(cd),"Thread-1");
		Thread t2=new Thread(new CountDownLatchExample(cd),"Thread-2");
		Thread t3=new Thread(new CountDownLatchExample(cd),"Thread-3");
		
		t1.start();
		
		t2.start();
		t3.start();
		
		Thread t4=new Thread(new CountDownLatchExample(cd),"Thread-3");
		t4.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Acheived");
			countDown.countDown();
			countDown.await();
			//countDown.countDown();
			System.out.println("crossed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

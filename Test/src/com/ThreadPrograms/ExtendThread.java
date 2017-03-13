package com.ThreadPrograms;

public class ExtendThread extends Thread {

	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}

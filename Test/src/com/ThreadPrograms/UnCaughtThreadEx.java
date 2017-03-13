package com.ThreadPrograms;

import java.lang.Thread.UncaughtExceptionHandler;

public class UnCaughtThreadEx extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UnCaughtThreadEx t=new UnCaughtThreadEx();
		UncaughtExceptionHandler eh=new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("Hi");
			}
		};
		t.setUncaughtExceptionHandler(eh);
		t.start();
		t.setDefaultUncaughtExceptionHandler(eh);
	}
@Override
	public void run()
	{
	try
	{
		System.out.println(1/0);
	}
	catch(NullPointerException e)
	{
		System.out.println("12");
	}
	}
}

package com.ThreadPrograms;

public class ThreadPrint extends Thread{

	/**
	 * @param args
	 */
	Thread t1;
	Thread t2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ThreadPrint tp=new ThreadPrint();
tp.Thp();
java.util.Collections.sor
	}
	public void Thp()
	{

		 t1=new Thread();
		 t2=new Thread();
		t1.start();
		t2.start();
	}
	@Override
public void run()
{
  if (t1.getName().equals("Thread-0"))
	  for (int i=1;i<=10;i=1+2)
		  
	  {
		  System.out.println(i);
		  try {
			t1.wait();
			t2.notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

if (t2.getName().equals("Thread-1"))
	  for (int i=2;i<=10;i=1+2)
	  {
		  System.out.println(i);
		  try {
			t2.wait();
			t1.notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
}

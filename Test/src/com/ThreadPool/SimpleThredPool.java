package com.ThreadPool;

import java.util.LinkedList;

public class SimpleThredPool {

	public WorkerThreads[] threads;
	public LinkedList<Runnable> taskQueue;
	
	public  SimpleThredPool(int noOfThreads)
	{
		taskQueue=new LinkedList<Runnable>();
		threads=new WorkerThreads[noOfThreads];
		for(int i=0;i<threads.length;i++)
		{
			threads[0]=new WorkerThreads();
			threads[0].start();
		}
	}
}

 class WorkerThreads extends Thread
{
	 public void run()
	 {
		 
	 }
	 
	 
	 
	}

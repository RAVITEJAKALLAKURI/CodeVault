package com.ThreadPrograms;

class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   
	   ThreadDemo( String name){
	       threadName = name;
	       System.out.println("Creating " +  threadName );
	   }
	   public void run() {

			if(this.threadName.equals("Thread-1"))
				try {
					first();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			else
		second();}
		

		private static synchronized void first() throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.out.println("first");
			Thread.sleep(5000);
			
		}

		private static synchronized void second() {
			// TODO Auto-generated method stub
			System.out.println("second");
		}
	

	   
	   
	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }

	}

	public class TestThread {
		static ThreadDemo T1;
		static ThreadDemo T2;
	   public static void main(String args[]) {
	   
		    T1 = new ThreadDemo( "Thread-1");
	      T1.start();
	      
	       T2 = new ThreadDemo( "Thread-2");
	      T2.start();
	   }   
	}
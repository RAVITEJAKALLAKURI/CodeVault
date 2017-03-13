package com.ThreadPrograms;

public class SuspendResume extends Thread{

	/**
	 * @param args
	 */
	public static int i;
	@SuppressWarnings({ "deprecation", "static-access" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuspendResume th=new SuspendResume();
		th.start();
		
		
		
if(i==100)
{
	th.yield();
	
for(i=100;i <=9999;i++)
{
 
	 if(i==1000)
		 th.resume();
System.out.println("Main"+""+i);
}
}
	}
 public void run(){
	 
	 for(i=1;i <=9999;i++)
		{
		 
			 
	 System.out.println(i);
		}
 }
}

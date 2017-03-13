package com.CPrograms;

import java.sql.Date;

public class TestC {

	/**
	 * @param args
	 */
	static Runtime runtime=Runtime.getRuntime();
	static int temp=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean choice=false;
		
		try {
	        if (choice) 
	        {
	             while (true)
	            	 System.out.println(12);
	        } else {
	           // System.exit(1);
	        }
	}finally {
	    System.out.println(1);
	
	}
		long start,end;
		Object obj;
		runtime.gc();
		start=runtime.freeMemory();
		obj=new Object();
		end= runtime.freeMemory();
		System.out.println( (start-end) + " bytes");
		//System.out.println(this.temp);
System.out.println(new java.util.Date());
	    for(int i = 100000; i > 0; i--) {}
	    System.out.println(new java.util.Date());
	    for(int i = 1; i < 100001; i++) {}
	    System.out.println(new java.util.Date());


	                 A s1 = new A();
	                 B S2= new B();
	                 System.out.println("Print S1 " + s1.S); 
	                 System.out.println("Print S1 " + S2.S);
	                 System.out.println(s1.toString());
	                 s1=S2;
	                 System.out.println(s1.toString());
	                 System.out.println("Print S1 now " + s1.S) ;
	                 System.out.println( "Print S1.gets() now " + s1.gets());
	                 
	        }
	
		
	
	
public void test()
{
	
	
}}

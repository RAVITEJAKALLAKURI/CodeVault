package com.poly;

public class B extends A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//A a1 =new A();
		
		A a =new B();
		a.getA(1);
		
	}	
	
	public void getA(int num)
	{
		System.out.println("sub class"+num);
	

	
	try
	{
	return;
	
	}
	catch(Exception e)
	{}
	finally
	{
		System.out.println("in Finally");
	}
	
	System.out.println("Out");
	}
}

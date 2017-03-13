package com.ds;

public class ExceptionTets {

	public static void main(String[] args) {
	int a;
		
		try{
			
			a=10;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			a=20;
		}
		catch(NullPointerException b)
		{
			//System.out.println(a);
		}
	}
}

package com.AspectJ;

public class A {

	public A() {
		// TODO Auto-generated constructor stub
	}

public void m() throws Exception
{
	int m=10;
	//System.out.println("Created AspectJ");
	
	if(m==10)
	throw new Exception();
	}

public void m1() 
{
  System.out.println("m1");	
}
}

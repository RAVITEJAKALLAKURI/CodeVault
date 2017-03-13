package com.oops;

public enum Singleton {
	
	INSTANCE;

	private Singleton()
	{
		System.out.println("in enum constr");
	}
	public void m1()
	{}
}

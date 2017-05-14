package com.design;

public class Singleton implements Cloneable{

	/**
	 * @param args
	 */
	
	private static Singleton st;
	private  Singleton(){}
	
	
	
	public static Singleton getInstance(){
		
		if(st==null)
			st=new Singleton();
		return st;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

package com.design;

public class TestSingleton {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Singleton ss= Singleton.getInstance();
		Singleton s1=(Singleton) ss.clone();
		System.out.println(ss.equals(s1));
		Singleton c=(Singleton)Class.forName("com.design.Singleton").newInstance();



	}


}

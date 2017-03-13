package com.AspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		A a=(A)ctxt.getBean("proxy", A.class);
		try {
			a.m();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("after m");
		a.m1();	
	}

}

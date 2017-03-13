package com.DIInhBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee e=(Employee)ctxt.getBean("InBean");
	e.details();

	}

}

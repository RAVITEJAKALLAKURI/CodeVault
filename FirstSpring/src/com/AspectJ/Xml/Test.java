package com.AspectJ.Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationaop.xml");
		Operation op=(Operation)ctxt.getBean("xmlBean12",Operation.class);
		op.m();

	}

}

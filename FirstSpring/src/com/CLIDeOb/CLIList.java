package com.CLIDeOb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CLIList {

	public CLIList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		Question1 q=(Question1)ctxt.getBean("CLIDeob",Question1.class);
		q.details();
	}

}

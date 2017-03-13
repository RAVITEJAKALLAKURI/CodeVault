package com.CLIList;

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
		Question q=(Question)ctxt.getBean("CLIList",Question.class);
		q.details();
	}

}

package com.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO e=(EmployeeDAO)ctxt.getBean("jdbcBean");
		int status=e.saveEmployee(new Employee(12,"RAVI","HYD"));

	}

}

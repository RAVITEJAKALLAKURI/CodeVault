package com.AutowireMode;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMode {

	public AutoWireMode() {
		// TODO Auto-generated constructor stub
	}
public static void  main(String[] args){
  ApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationcontext.xml");
  A a=ctxt.getBean("a", A.class);
  a.display();
}
}

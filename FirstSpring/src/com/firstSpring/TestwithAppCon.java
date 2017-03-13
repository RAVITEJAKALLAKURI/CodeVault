package com.firstSpring;

import java.io.ObjectInputStream.GetField;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestwithAppCon {
	
	public static void main(String[] args) 
	{
	ApplicationContext appc=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Student std=(Student)appc.getBean("tejabean");
	std.displayInfo();
	}
}

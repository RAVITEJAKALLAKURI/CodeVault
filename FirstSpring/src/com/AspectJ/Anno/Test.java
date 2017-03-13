package com.AspectJ.Anno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Resource rs=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		Operation a=(Operation)factory.getBean("annoBean");
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation a1=(Operation)ctxt.getBean("annoBean",Operation.class);
		try {
			a.k();
			a1.m();
			a1.k();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

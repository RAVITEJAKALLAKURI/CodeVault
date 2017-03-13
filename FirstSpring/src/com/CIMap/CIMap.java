package com.CIMap;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class CIMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Question2 q =(Question2)ctxt.getBean("addCIMap", Question2.class);
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Question2 q=(Question2)factory.getBean("addCIMap");
		q.details();
	}

}

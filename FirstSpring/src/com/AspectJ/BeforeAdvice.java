package com.AspectJ;

import java.lang.reflect.Method;  
import org.springframework.aop.MethodBeforeAdvice;  

public class BeforeAdvice implements MethodBeforeAdvice{

	public BeforeAdvice() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before main method");
	}

}
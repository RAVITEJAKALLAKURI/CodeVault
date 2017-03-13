package com.AspectJ;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class AroundAdvice implements org.aopalliance.intercept.MethodInterceptor{



	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		Object obi=null;
		System.out.println("concern before");
		 obi = mi.proceed();
		System.out.println("concern after");
		return obi;
	}

	
	
}

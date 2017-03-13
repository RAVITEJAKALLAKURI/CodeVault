package com.AspectJ.Xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TrackOperation {

	
	/*public void myadvice(JoinPoint jp)
	{
		System.out.println("additional concern");
	}*/
	
	public void myadvice(JoinPoint jp,Object result) throws Throwable
	{
		System.out.println("additional concern around"+result);
		System.out.println(jp.getSignature());
		System.out.println("additional concern around after");
	}
}

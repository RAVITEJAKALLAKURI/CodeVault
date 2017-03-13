package com.AspectJ.Anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	
	@Pointcut("execution(* Operation.m*(..))")
	public void p(){}
	
	@Before("p()")
	public void toadvice(JoinPoint jp)
	{
		System.out.println("additional concern");
	}
	@After("p()")
	public void afteradvice(JoinPoint jp)
	{
		System.out.println("after concern");
	}
	@AfterReturning(pointcut="execution(* Operation.*(..))",returning="result")
	public void afterreturningadvice(JoinPoint jp,Object result)
	{
		System.out.println("after returning");
		System.out.println(result);
	}
	@Around("p()")
	public Object arounadvice(ProceedingJoinPoint jp) throws Throwable
	{
		System.out.println("around concern");
		return (jp.proceed());
	}
}

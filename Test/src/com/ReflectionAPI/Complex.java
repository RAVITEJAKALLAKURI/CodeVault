package com.ReflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Complex {

	public static void main(String[] args) throws Exception
	{
	Class c=Class.forName("com.ReflectionAPI.Simple");
	Object o=c.newInstance();
	Method m=c.getDeclaredMethod("valid",null);
	m.setAccessible(true);
	m.invoke(o,null);
	
	Method m1=c.getDeclaredMethod("validInput",new Class[]{String.class});
	m1.setAccessible(true);
	m1.invoke(o,"Good");
	

	Method m2=c.getDeclaredMethod("validateInput",new Class[]{String.class});
	m2.setAccessible(true);
	m2.invoke(null,"Good");

	Method m3=c.getDeclaredMethod("publicInput",new Class[]{String.class});
	m3.setAccessible(false);
	m3.invoke(o,"Good");
	
	Method m4=c.getDeclaredMethod("InputInt",int.class);
	m4.setAccessible(true);
	m4.invoke(o,4);
	
	Field f=c.getDeclaredField("Input");
	f.setAccessible(true);
	System.out.println(f.get(o));
	

	Field f1=c.getDeclaredField("stInput");
	f1.setAccessible(true);
	System.out.println(f1.get(null));
	
	Field[] f2=c.getDeclaredFields();
	for(Field fi:f2)
		
	{
		fi.setAccessible(true);
		System.out.println(fi.get(o));
	}
	
	
	Class c1=boolean.class;
	System.out.println(c1.getName());
	
	
	
	}
	
	
}

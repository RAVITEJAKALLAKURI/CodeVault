package com.oops;

import java.util.regex.Pattern;

public class B extends A{

	
	void m1(){System.out.println(a);
	System.out.println(x);}
	
	public static void main(String[] args) {
		B b =new B();
		System.out.println(a);
		System.out.println(b.x);
		b.m1();
		 Pattern pattern = Pattern.compile(".*[0-9].*");
		 System.out.println(pattern.matcher("555").matches());
	}
}

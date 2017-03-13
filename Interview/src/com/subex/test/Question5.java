package com.subex.test;
/**
 * Exactly
 * @author sridhar.r
 */
public class Question5 {

	public void test(int [] a) {
		int b [] = new int [2];
		a = b;
		System.out.println("Inside test Method : a : "+a.length );
		System.out.println("Inside test Method : b : "+b.length );
	}
	
	public static void main(String[] args) {
		int [] a = new int [5];
		new Question5().test(a);
		System.out.println("Inside Main After test method call: a : "+a.length );
	}
}

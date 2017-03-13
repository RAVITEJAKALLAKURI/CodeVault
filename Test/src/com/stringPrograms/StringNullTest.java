package com.stringPrograms;

import java.io.Serializable;
import java.util.concurrent.Callable;

public class StringNullTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=null;
		test(s);
	}

	private static void test(String s) {
		// TODO Auto-generated method stub
	
		if(s==null || s.length()==0)
			System.out.println("empty");
		else
			System.out.println("No");
		
		String s1="RAVI";
		System.out.println(s1.substring(-1,-1));
	}

}

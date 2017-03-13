package com.subex.test;
/**
 * 
 * @author sridhar.r
 * Output : 
 */
public class Question2 {

	static {
		System.out.println("static1");
	}
	
	{
		System.out.println("Inside simple empty block");
	}
	
	static {
		System.out.println("static2");
	}
	
	public static void main(String [] args) {
		System.out.println("Inside main");  
		
		new Question2();  // Without this line Output : 
									// static1
									// static2
									// Inside main
						// With this line Output : 
									// static1
									// static2
									// Inside main
									// Inside simple empty block
	}
}

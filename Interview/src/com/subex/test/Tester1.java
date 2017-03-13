package com.subex.test;
/**
 * Exactly
 * @author sridhar.r
 *
 */
class Bird1 {

	static {
		System.out.println("static1");
	}

	{
		System.out.println("Init1");
	}

	static {
		System.out.println("static2");
	}

	Bird1() {
		System.out.println("Bird");
	}
}

class Falcon1 extends Bird1 {
	Falcon1() {
		System.out.println("Falcon");
	}
	
	static {
		System.out.println("static3");
	}
}

public class Tester1 {

	public static void main(String[] args) {
		new Falcon1();
		System.out.println("Inside main");
		
		// Output : 
//		static1
//		static2
//		Init1
//		Bird
//		Falcon
//		Inside main
		
//		System.out.println("Inside main");
//		new Falcon1();
		
		// Output:
//		Inside main
//		static1
//		static2
//		Init1
//		Bird
//		Falcon
		
		
//		VERY IMPORTANT : Put main inside Falcon class and check
	}
}

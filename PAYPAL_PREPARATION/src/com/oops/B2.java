package com.oops;

public class B2 extends A2 {

	/**
	 * @param args
	 */
	
		
		static int b= m2();
		static int m2(){
			System.out.println("B2:b");
			return 20;
		}
		static {System.out.println("B2 class is loaded");}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("B2 main");
			System.out.println("B2 main a:"+a);
			System.out.println("B2 main b:"+b);
	}

}

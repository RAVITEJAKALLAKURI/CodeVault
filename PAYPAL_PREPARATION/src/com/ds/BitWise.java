package com.ds;

public class BitWise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2;
		int b=5;
		int c= -2;
		int number= a >>b;
		System.out.println(number);
		number= a >> 3;
		System.out.println(number);
		number = b << 2;
		System.out.println(number);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(c));
		number= c >> 2;
		System.out.println(Integer.toBinaryString(number));
		System.out.println(number);

	}

}

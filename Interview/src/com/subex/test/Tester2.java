package com.subex.test;

class Demo2 {
	static int x = 10;
	int y;
	Demo2(int input){
		y = input;
		System.out.println(this.x); // works fine
		System.out.println(this.y); // works fine
		System.out.println(x+ " "+ y); // works fine
	}
	
	public void DemoMethod(){
		System.out.println(this.x); // works fine
		System.out.println(this.y); // works fine
		System.out.println(x+ " "+ y); // works fine
	}
}

public class Tester2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo2(20);
		System.out.println(this.x+" "+this.y); // this.x : Cannot use this in a static context
										// this.y: Cannot use this in a static context
		System.out.println(x+" "+y);  // x: x cannot be resolved to a variable
										// y: y cannot be resolved to a variable
	}
}

package com.subex.test;
/**
 * Exactly
 * @author sridhar.r
 *
 */
public class Demo3 {
	static int x = 10;
	int y;
	Demo3(int input){
		y = input;
		System.out.println(this.x); // works fine   ---- Only this line
		System.out.println(this.y); // works fine
		System.out.println(x+ " "+ y); // works fine
	}
	
	// The following method is not present in the actual question.
	public void DemoMethod(){
		System.out.println(this.x); // works fine
		System.out.println(this.y); // works fine
		System.out.println(x+ " "+ y); // works fine
	}

	
	public static void main(String[] args) {
		new Demo2(20);
		System.out.println(this.x+" "+this.y); // this.x : Cannot use this in a static context
										// this.y: Cannot use this in a static context
		System.out.println(x+" "+y);  // x: works fine
										// y: Cannot make a static reference to the non-static field y  ---- Only this line
	}
}

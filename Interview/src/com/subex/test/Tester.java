package com.subex.test;

class Creature {
	void grow () {
		System.out.println("Creature is growing");
	}
}

class Bird extends Creature {
	void fly() {
		System.out.println("Bird is flying");
	}
}

class Falcon extends Bird {
	void hunt () {
		System.out.println("Falcon is hunting");
	}
}

public class Tester {
	public static void main(String[] args) {
		Creature c1 = new Falcon ();
		c1.grow();
//		c1.fly();     // Compilation error : Add cast to c1 as (Bird)
		((Bird) c1).fly();
		((Falcon) c1).hunt();
		
		Creature c2 = new Bird ();
		c2.grow();
//		c2.fly();     // Compilation error : Add cast to c2
		((Bird) c2).fly();
		((Falcon) c2).hunt();    // Runtime Exception : java.lang.ClassCastException
		
	}
}

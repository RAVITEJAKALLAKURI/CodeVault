package com.subex.test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Exactly
 * @author sridhar.r
 *
 */
class Human implements Comparable<Human> {

		Integer age;
		public Human(int a) {
			this.age = a;
		}

	public int compareTo(Human h1) {
		// TODO Auto-generated method stub
		
		return h1.age.compareTo(this.age);
	}
}

public class Tester0 {
	public static void main(String[] args) {
		
		ArrayList<Human> humans = new ArrayList<Human>();
		humans.add(new Human(13));
		humans.add(new Human(33));
		humans.add(new Human(21));
		humans.add(new Human(21));
		
		Collections.sort(humans);
		System.out.print(humans.get(0).age);
		System.out.print(humans.size());
	}
}



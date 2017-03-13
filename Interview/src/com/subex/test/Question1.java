package com.subex.test;

import java.util.LinkedHashMap;
import java.util.TreeSet;

import javax.sound.sampled.ReverbType;

public class Question1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A;
		int B;
		Question1 test = new Question1();
		
		for(int i = 0; i<1000; i++) {
			A = i;
			B = test.reverseNumber(A);
			
			if(B > A) {
				int temp = (B-A);
				if((temp % 7) == 0) {
//					System.out.println("'A' Value : "+A+"', B' Value : "+B);
					System.out.print(A+" , ");
				}
			}
		}
		
	}
	
	public int reverseNumber(int n) {
		int reverse = 0;
		 	 
	      while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
	      return reverse;
	}
}

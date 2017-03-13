package com.CPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		FibonacciSeries fb=new FibonacciSeries();
		
	Map<Integer, Integer> hmap=new HashMap<Integer, Integer>();
		
		hmap.put(1,1);
		hmap.put(2,1);
		System.out.println(fb.printFibo(input,hmap));
		
	}

	private Integer printFibo(int input, Map<Integer, Integer> hmap) {
		// TODO Auto-generated method stub
		
		if(hmap.get(input)!=null)
			return hmap.get(input);
		else
		{
			int temp=printFibo(input-1, hmap)+printFibo(input-2, hmap);
			hmap.put(input,temp);
			return temp;
			
		}
		
		
		
	}


}

package com.stringPrograms;

import java.util.Scanner;

public class StringCircular {

	/**
	 * @param args
	 */
static String origInput=null;
static String input=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		origInput=sc.next();
		input=sc.next();
		
		StringCircular src=new StringCircular();
		System.out.println(src.iscircularreverse());

	}
	private boolean iscircularreverse() {
		// TODO Auto-generated method stub
		
		if((origInput.length()==input.length()) &&(origInput+origInput).contains(input))
				return true;
		else
			return false;
		
		
	}

}

package com.stringPrograms;

import java.util.HashSet;
import java.util.TreeSet;

public class IdentifyDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArr={"one","two","four","four"};
		TreeSet<String> unique= new TreeSet<String>();
		for(int i=0;i<strArr.length;i++)
		if(!unique.add(strArr[i]))
		{
			System.out.println("duplicate is"+strArr[i]);
		}
		HashSet<String> uniqueset=new HashSet<String>();
		for(int i=0;i<strArr.length;i++)
			if(!uniqueset.add(strArr[i]))
			{
				System.out.println("duplicate is"+strArr[i]);
			}
		
	}

}

package com.stringPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepetant {

	/**
	 * @param args
	 */
	public static int count,value;
	public static String input;
//	public static HashMap<String,Integer> hash=new HashMap<String,Integer> ();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Scanner sc=new Scanner(System.in);
		//input=args[0];
		input="RAAVi";
		String[] strArr=input.split("");
		 HashMap<String,Integer> hash=new HashMap<String,Integer> ();
		for(int i=1;i<strArr.length;i++)
		{
			value=0;
			System.out.println("First Caharcter"+strArr[i]+i);
			if(hash.get(strArr[i]) != null)
			{
				count=hash.get(strArr[i])+1;
				hash.put(strArr[i], count);
			}
			else
			{
				hash.put(strArr[i],1);
			}
		}
		
		for(int i=1;i<strArr.length;i++)
		{
			count=0;
			count=hash.get(strArr[i]);
			if(count ==2)
			{
				System.out.println("First Caharcter"+strArr[i]);
				return;
			}
		  	
		}
		}
	}



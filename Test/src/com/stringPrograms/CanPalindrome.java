package com.stringPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class CanPalindrome {

	/**
	 * @param args
	 */
	
	static HashMap< Character, Integer> hm=new HashMap<Character,Integer>();
	static int value;
	public static  boolean temp=true;
	public static String tempstr="1";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		String input = sc.next();
		
		for(int i=0;i<input.length();i++)
		{
			if(hm.get(input.charAt(i))==null)
	
				{
				hm.put(input.charAt(i),1);
				
			tempstr=tempstr+input.charAt(i);
				}
			else
			{
				 value = hm.get(input.charAt(i))+1;
			hm.put(input.charAt(i),value);
			
			}
		}
		
		CanPalindrome cpd=new CanPalindrome();
		if(cpd.checkPalindrome())
	
System.out.println("Can");
	}
	
	public boolean checkPalindrome()
	{
		
		for(int i=1;i<tempstr.length();i++)
		{
			value=hm.get(tempstr.charAt(i));
		if(value%2!=0)
			if(temp)
				temp=false;
			else
			{
				System.out.println("cannot");
				
		return false;
			}
		
	}
		return true;
	}
}

package com.stringPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubstrPerm {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String[] input=sc.next().split("");
		String[] temp=doPermute(sc.next()).toArray(new String[]{});
		System.out.println(temp);
		Set<String> temp=new HashSet<String>();
		for(String tempStr :temp)
		{
			temp.add(doPermute(tempStr, 3));
		}
		
		
		
	}
	
	public static Set<String> doPermute(String input)
	{
		Set<String> resStr=new HashSet<String>();
		if(input==null)
			return null;
		else if(input.length()==0)
		{
			resStr.add("");
		return resStr;
		}
		
		char ab=input.charAt(0);
		String rem=input.substring(1);
	Set<String> words=	doPermute(rem);
	
	for(String newString:words)
	{
		
		for(int i=0;i<=newString.length();i++)
		resStr.add(newcahar(newString,ab,i));
	}
	
	return resStr;
		
	}
	
	public static Set<String> doPermute(String input,int length)
	{
		Set<String> resStr=new HashSet<String>();
		if(input==null)
			return null;
		else if(input.length()==0)
		{
			resStr.add("");
		return resStr;
		}
		
		char ab=input.charAt(0);
		String rem=input.substring(1,length);
	Set<String> words=	doPermute(rem,length-1);
	
	for(String newString:words)
	{
		
		for(int i=0;i<=newString.length();i++)
		resStr.add(newcahar(newString,ab,i));
	}
	
	return resStr;
		
	}
	
	public static String newcahar(String str,char c,int j)
	{
		
		String first=str.substring(0, j);
		String last=str.substring(j);
		return first+c+last;
	}

}

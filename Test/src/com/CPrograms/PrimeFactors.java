package com.CPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PrimeFactors {

	/**
	 * @param args
	 */
	public static int count,value,input;
	
	public static HashSet<Integer> hash=new HashSet<Integer> ();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		input=sc.nextInt();
		if(input<=0)
		{
			System.out.println("Input should be greater than 0");
			
		}
		
		if(isPrime(input))
		System.out.println("Input is prime"+input);
		else
		{
			PrimeFactor(input);
		}

	}
	public static boolean isPrime(int value1)
	{
		int count1=0;
		for(int i=2;i<=value1;i++)
		{
			if(value1%i==0)
			count1=count1+1;
			
				
		}
		if(count1 == 1)
		return true;
		else
			return false;
	}
	public static void PrimeFactor(int value)
	{
		int count1=0;
		for(int i=2;i<=value;i++)
		{
			if(value%i==0)
				if(isPrime(value))
			System.out.println(value);
			
				
		}
		
		
	}
}

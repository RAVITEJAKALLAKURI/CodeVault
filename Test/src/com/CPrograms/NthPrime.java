package com.CPrograms;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class NthPrime {

	/**
	 * @param args
	 * 
	 * 
	 */
	public static int input,count,value;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		input=sc.nextInt();
		if(input<=0)
		{
			System.out.println("Input should be greater than 0");
			
		}
		for(value=1;count!=input;value++)
		{
			if(isPrime(value))
			count+=1;
			
		}
		value-=1;
		System.out.println(value);
	}
	public static boolean isPrime(int value)
	{
		int count1=0;
		for(int i=2;i<=value;i++)
		{
			if(value%i==0)
			count1=count1+1;
			
				
		}
		if(count1 == 1)
		return true;
		else
			return false;
	}
	}



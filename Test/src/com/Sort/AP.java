package com.Sort;

import java.util.Scanner;

public class AP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int temp=10;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[temp];
		for (int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int diff=0;
		int count;
		for (int i=0;i<temp-1;i++)
		{
		count=0;
			if(i==0)
				diff=a[i+1]-a[i];
			else
			{
				count=a[i+1]-a[i];
				if(diff !=count)
				{
					System.out.println(a[i+1]-diff);
				break;
				}
			}
					
		}
	}
	
	public int getal()
	{
		//int a=10;
		int b=20;
		int a[]=new int[2];
		return a[0]-b;
		
	}

}

package com.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

	static List<Integer> origlist=new ArrayList<Integer>();
	static Integer a[]=new Integer[6];
	static List<Integer> sortedlist=new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String line;
		int temp=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(temp<=5)
		{
			a[temp]=Integer.valueOf(br.readLine());
			temp++;
		}
		reverselist(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	private static void reverselist(Integer[] a) {
		// TODO Auto-generated method stub
		
		int min,temp;
		for(int i=0;i<a.length-1;i++)
		{
			
			min=i;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
			for(int k=0;k<a.length;k++)
			{
				System.out.print(a[k]);
			}
			System.out.println();
			}
		}
		
	}




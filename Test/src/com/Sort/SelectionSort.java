package com.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

	/**
	 * @param args
	 */
	
	static List<Integer> origlist=new ArrayList<Integer>();
	static int a[]=new int[5];
	static List<Integer> sortedlist=new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String line;
		int temp=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(temp<5)
		{
			a[temp]=Integer.valueOf(br.readLine());
			temp++;
		}
		reverselist(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i);
		}
	}
	private static void reverselist(int[] a2) {
		// TODO Auto-generated method stub
		
		
		int min,temp;
		for(int i=0;i<a.length;i++)
		{
			
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if (a[min]>a[j])
				{
					min=j;
					
					
				}
			}
			if(i!=min)
			{

				temp=a[i];
				
				a[i]=a[min];
				a[min]=temp;
			}
			}
		}
		
	}



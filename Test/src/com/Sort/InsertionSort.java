package com.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

	static List<Integer> origlist=new ArrayList<Integer>();
	static Integer a[]=new Integer[5];
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
			System.out.println(a[i]);
		}
	}
	private static void reverselist(Integer[] a) {
		// TODO Auto-generated method stub
		
		int min,temp;
		for(int i=1;i<a.length;i++)
		{
			
			min=a[i];
			int j;
			for(j=i-1;j>=0 && min<a[j];j--)
			
				a[j+1]=a[j];
			a[j+1]=min;
			}
		}
		
	}





package com.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StringBubbleSort {

	 List<Integer> origlist=new ArrayList<Integer>();
	static String a[]=new String[5];
	static List<Integer> sortedlist=new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String line;
		int temp=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(temp<5)
		{
			a[temp]=br.readLine();
			temp++;
		}
		reverselist(a);
		StringBubbleSort sb=new StringBubbleSort();
		sb.getall();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	private void getall() {
		// TODO Auto-generated method stub
		origlist.add(10);
		
	}
	private static void reverselist(String[] a) {
		// TODO Auto-generated method stub
		
		String min,temp;
		for(int i=0;i<a.length-1;i++)
		{
			
			//min=i;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
				temp=a[j];
				
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
			}
		}
		
	}





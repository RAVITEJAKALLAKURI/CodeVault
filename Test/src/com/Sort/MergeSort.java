package com.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	

	static List<Integer> origlist=new ArrayList<Integer>();
	static Integer a[]=new Integer[]{1,3,5,7,19};
	static Integer b[]=new Integer[]{2,4,6,8,10,12,14};
	static Integer c[]=new Integer[a.length+b.length];
	static Integer c1[]=new Integer[]{3,5,1};
	static Integer d[]=new Integer[c1.length];
	static List<Integer> sortedlist=new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		//merge(a,b,c);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		mergesort(c1);
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
	}
	private static void merge(Integer[] a2, Integer[] b2, Integer[] d) {
		// TODO Auto-generated method stub
		
		int i=0,j=0,k=0;
		
		while(i<=a2.length-1&& j<=b2.length-1)
		{
			
			if(a2[i]<b2[j])
				d[k++]=a2[i++];
			else
				d[k++]=b2[j++];
		}
		
		while(i<a2.length)
			d[k++]=a2[i++];

		while(j<b2.length)
			d[k++]=b2[j++];
	}
	
	public static void mergesort(Integer[] arr)
	{
		if(arr.length <2) return;
		int mid =(arr.length)/2;
		Integer[] left =new Integer[mid];
		for(int i=0; i<mid;i++)
			left[i]=arr[i];
		Integer[] right =new Integer[arr.length-mid];
		for(int i=0; i<arr.length-mid;i++)
			right[i]=arr[mid+i];
		mergesort(left);
		
		mergesort(right);
		System.out.println("from merge");
		merge(left,right,MergeSort.d);
		
	}
	
}

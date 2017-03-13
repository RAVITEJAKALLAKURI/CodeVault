package com.Sort;

import java.util.Arrays;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr= {1,5,8,0,-7,9,2,3,90,11};
		int[] arr= {9,8,15,2,6,0,5};
		
		quick(arr,0 ,arr.length-1);
	System.out.println(Arrays.toString(arr));	
	}

	private static void quick(int[] arr, int i, int length) {
		// TODO Auto-generated method stub

		int pivot;
		if(i<length)   //i==high sublist has only one elemnt and i>high means no sublist
		{
			pivot =partiton(arr,i ,length);
			
			quick(arr,i,pivot-1);
			quick(arr,pivot+1,length);
			
			
		}
		
	}

	private static int partiton(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
//int temp ,i ,j, pivot;
//i=low+1;
//j=high;
//
//pivot =arr[low];
//
//while(i<=j)
//{
//	
//
//while(arr[i]<pivot && (i<=high))
//	i++;
//	
//while(arr[j]> pivot)
//	j--;
//
//if(i<j)
//{
//    temp=arr[i];
//    arr[i]=arr[j];
//    arr[j]=temp;
//    i++;
//    j--;
//
//}
//else
//	i++;
//}
//
//arr[low]=arr[j];
//arr[j]=pivot;
//return j;
		
		
		int pivot = arr[high];
		
		
		int index=low;
		int temp=0;
		
		for (int i=low ; i<high; ++i)
		{
			if (arr[i] <= pivot)
			{
				 temp=arr[i];
	    arr[i]=arr[index];
		    arr[index]=temp;
			index++;
			}
		}
		
		temp=arr[index];
	    arr[index]=arr[high];
		    arr[high]=temp;
		return index;
		
		
		
		
		
		

}







		
	}



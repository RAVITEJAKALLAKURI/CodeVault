package com.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeSet;

public class BeltRotation {

	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner sc =new Scanner (System.in);
	        
	        int no= sc.nextInt();
	        int arr[] =new int[no];
	        String s1=null;
	        try {
                // Read input from console
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(System.in));
                s1 = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

	        String s[]=s1.split(" ");
	        for(int i=0;i<no;i++)
	            {arr[i]=Integer.valueOf(s[i]);}
	        TreeSet<Integer> ts=new TreeSet<Integer>();
	        for(int i=0; i<no;i++)
	            {
	               int val=calaculatesum(arr);
	            ts.add(val);
	            arr= reversearray(arr,no);
	            
	        }
	        System.out.println(ts.last());
	        
	    }
	    
	    public static int calaculatesum(int arr[])
	        {
	        int sum=0;
	        int count=1;
	        for(int i=0;i<arr.length;i++){
	            sum+=count*arr[i];
	        count++;
	        }
	        return sum;
	    }
	    
	    public static int[] reversearray(int[] arr,int no)
	        {
	        int temp= arr[0];
	        int i=0;
	         for(i=0;i<arr.length-1;i++)
	             {
	             arr[i]=arr[i+1];
	         }
	        arr[i]=temp;
	        return arr;
	    }
	}


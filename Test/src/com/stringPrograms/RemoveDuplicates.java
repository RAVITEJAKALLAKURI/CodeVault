package com.stringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicates {
	
	public  static void main(String[] args)
	{
		
		 String[] strArr = {"one","two","three","four","four","five"};
	        //convert string array to list
		 
		 
	        List<String> tmpList = Arrays.asList(strArr);
	        System.out.println(tmpList);
	        //System.out.println(tmpList.toArray(strArr).toString());
	        //create a treeset with the list, which eliminates duplicates
	        TreeSet<String> unique = new TreeSet<String>(tmpList);
	        System.out.println(unique+""+strArr.length);
	        
	        HashSet<String> uniqueset=new HashSet<String>(tmpList);
	        System.out.println(uniqueset);
	        
	        
	        
	}

}

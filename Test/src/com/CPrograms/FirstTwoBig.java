package com.CPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FirstTwoBig {

	/**
	 * @param args
	 */
	public static int value,first,second=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		List<Integer> intlist=new ArrayList<Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(br.readLine().equals("Y"))
		{
			String str=br.readLine();
			value=Integer.parseInt(str);
		intlist.add(
				value);
		
		}

		for(Integer i:intlist)
		{
			if(first<i)
			{
				second=first;
				first=i;
				
			}
			else if(second<i)
				second=i;
			
			
		}
		System.out.println(first+"val"+second);
	}

}

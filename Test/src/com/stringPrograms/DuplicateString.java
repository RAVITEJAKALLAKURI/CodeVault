package com.stringPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateString {

	/**
	 * @param args
	 */
	
	HashSet<String> hsStr=new HashSet<String>();
	ArrayList<String> arrStr=new ArrayList<String>();
	String[] str=new String[10];
	int count=0;
	String strtemp=null;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DuplicateString dstr=new DuplicateString();
		dstr.checkDuplicates();
		
		
	}

	private void checkDuplicates() throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 while ((strtemp = br.readLine()) != null && !strtemp.equals("exit") )
		{
			str[count]=strtemp;
			count++;
		}
		
		for (int i=0;i<count;i++)
		{
			strtemp=str[i].toLowerCase();
			
			if(hsStr.add(strtemp))
				arrStr.add(str[i]);
				
		}
		System.out.println(arrStr.toString());
	}

}

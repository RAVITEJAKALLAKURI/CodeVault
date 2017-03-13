package com.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Stringpatern {
	
	public static void main(String[] args) {
		
		Vector<String> as = new Vector<String>();
		GenerateStringsWithPattern1("01??",as);
		
		String s1="0101101";
		
		compareandreturncount(s1,as);
	}
	
	private static void compareandreturncount(String s1, Vector<String> as) {
		// TODO Auto-generated method stub
		
		Set uniq =new HashSet<String>();
		
		Iterator<String> itr= as.iterator();
		while(itr.hasNext())
		{
			String com= (String)itr.next();
			int len=com.length();
			if(!uniq.contains(com)&& len <s1.length() ){
				
		for(int i=0; i<s1.length();i++)
		{
			if(i+len <s1.length()){
		if(s1.substring(i, i+len).equals(com))uniq.add(com);	
		}
		
			}
		}
		}
		System.out.println(uniq.size());
	}

	public static void GenerateStringsWithPattern1(String pattern, Vector<String> vec)
	{
	    Stack<String> s =new Stack<String>();
	    s.push(pattern);

	 while(!s.isEmpty()){
	    	
	    	
	        String str = s.peek();
	       s.pop();

	        int idx = str.indexOf('?');

	        if(idx != -1){
	        	
	        	StringBuilder myName = new StringBuilder(str);
	        	myName.setCharAt(idx, '0');
	          
	        	   s.push(myName.toString());
	        	myName.setCharAt(idx, '1');
		          
	        	   s.push(myName.toString());
	        }
	        else{
	            vec.add(str);
	        }
	    }
	 
	 System.out.println(vec.toString());
	}

	
	
	
}

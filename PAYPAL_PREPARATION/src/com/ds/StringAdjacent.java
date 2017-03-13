package com.ds;

import java.util.Scanner;

public class StringAdjacent {

	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner sc= new Scanner(System.in);
	        String s =sc.next();
	        

	        for(int i=0;i<s.length();i++)
	            {
	            i=0;
	            if(s.charAt(i)== s.charAt(i+1)){
	            	int j= (s.length()-i>1) ?i+2 :i+(s.length()-i);
	            	s = s.substring(0, i) + s.substring(j);
	            	
	            }
	            i=0;
	            System.out.println(s+i);
	            i=0;
	        }
	    }
}

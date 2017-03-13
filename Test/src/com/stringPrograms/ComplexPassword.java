package com.stringPrograms;

import java.util.Scanner;

public class ComplexPassword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String password =sc.nextLine();
	    if(password.length()< 8)
	    {
	    	System.out.println("Password shoud be 8 characyers");
	    	return;
	    }
	    else
	    {
	    	for(int i=0;i<password.length();i++)
	    	{
	    		char ch=password.charAt(i);
	    		if(Character.isLetterOrDigit(ch))
	    		{
	    		if(Character.isDigit(ch))
	    		{
	    			
	    			System.out.println(ch+"is a digit");
	    		}
	    		else
	    		{
	    			if(Character.isLowerCase(ch))
	    			System.out.println(ch+"is a charctera in lower");
	    			else
	    				System.out.println(ch+"is a charctera in upper");
	    		}
	    		
	    		}
	    		else
	    		{
	    			System.out.println(ch+"is special" );
	    		}
	    	}
	    	
	    }
			
		}

	

}

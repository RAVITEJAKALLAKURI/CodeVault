package com.stringPrograms;

public class PasswordCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String password=args[0];
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
    			System.out.println(ch+"is a charctera");
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

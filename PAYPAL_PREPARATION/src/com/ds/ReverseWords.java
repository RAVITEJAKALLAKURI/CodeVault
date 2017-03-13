package com.ds;

public class ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	String str = "Iaa am qudsia";
	int prev = str.length() , index ;

	for (int i = str.length()- 1; i > 0;i--)
	{
	index = str.indexOf(" ", i);
	if (i == index)
	{
	System.out.print(str.substring(i+1, prev));
	System.out.print(" ");
	prev = i;

	}

	}
	System.out.println(str.substring(0, prev));

	}

}

package com.CPrograms;

public class ReverseStringUsingChars {

	
	public static void main(String... args)
	{
		
		//String str = "This was a String to reverse";
		String str = "Th Isw";

		char[] characters = str.toCharArray();
		
	
		for( int i = 0 ; i < characters.length/2  ; i++){
			char t = characters[i];
			characters[i] = characters[(characters.length-1)-i];
			characters[(characters.length-1)-i] = t;
		}
	System.out.println(new String(characters).toString());
	}
}

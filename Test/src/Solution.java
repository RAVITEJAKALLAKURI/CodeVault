// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    
    static boolean modified=true;
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inout=sc.next();
    	Solution s=new Solution();
    	System.out.println(s.solution(inout));
    }
    public String solution(String S) {
        // write your code in Java SE 8
        
        
        return substitute(S,modified);
    }
    private static String substitute (String input,boolean modify)
{
    if(modify)
    modify =false;
    else
    return input;
    String temp;
    if(input.length()>2)
     temp=input.substring(0,2);
    else
    	 temp=input;
    if(temp.equals("AB"))
    {
    //input="AA"+input.substring(2,input.length());
    if(input.length()>2)
    	input="AA"+input.substring(2,input.length());
       else
    	   input="AA"+input.substring(1);
    modify=true;
    }
    if(temp.equals("BA"))
     {
    	if(input.length()>=2)
        	input="AA"+input.substring(2,input.length());
           else
        	   input="AA"+input;
        modify=true;
    }
    if(temp.equals("CB"))
     {
    	if(input.length()>2)
        	input="CC"+input.substring(2,input.length());
           else
        	   input="CC"+input;
        modify=true;
    }
    if(temp.equals("BC"))
     {
    	if(input.length()>2)
        	input="CC"+input.substring(2,input.length());
           else
        	   input="CC"+input;
        modify=true;
    }
    if(temp.equals("AA"))
     {
    	if(input.length()>=2)
        	input="A"+input.substring(2,input.length());
           else
        	   input="A"+input;
        modify=true;
    }
    if(temp.equals("CC"))
     {
    	if(input.length()>2)
        	input="C"+input.substring(2,input.length());
           else
        	   input="C"+input;
        modify=true;
    }
    
    substitute(input,modify);
    return temp;
    
    }
}
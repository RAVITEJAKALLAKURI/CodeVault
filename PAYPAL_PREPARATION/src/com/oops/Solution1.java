package com.oops;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int testcases;
       
        HashMap<String,Integer>  hm= new HashMap<String,Integer>();
        
        Scanner sc =new Scanner(System.in);
        testcases=sc.nextInt();
        
        for(int i=0 ;i<testcases;i++)
            {
            int size=sc.nextInt();
//            BufferedReader br =new BufferedReader(new InputStreamReader(  System.in));
//            String input =br.readLine();
            sc.nextLine();
            String input=sc.nextLine();
           String s[]= input.split(" ");
            hm.clear();
            if(s.length !=size){
            	System.out.println(0);
            	continue;
            }
            boolean notint=false;
            for(int j=0;j<size;j++)
            {
            	try
                {
                Integer.parseInt(s[j]);
            }
            catch(Exception e )
                {
                System.out.println(0);
                notint=true;
        	break;
            }
           
                if(hm.get(s[j])!=null)
                hm.put(s[j],hm.get(s[j])+1);
                else
                  hm.put(s[j],1);
            }
            if(notint)
            	continue;
                Iterator<String> itr = hm.keySet().iterator();
              int pairs=0;
            while(itr.hasNext())
                {
                String str= (String)itr.next();
                int count = hm.get(str);
  
                if(count >1)
                {
                
                  pairs+=  fact(count);
                }
            
            }
           
            	System.out.println(pairs);
        }
    }
           public static int fact(int count)
            {
                int fact =1;
                for(int i=count;i>0;i--)
                    {
                    fact = fact*count;
                    count--;
                }
                    return fact;
            }
        }
        
        
        
        
        


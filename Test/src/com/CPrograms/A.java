package com.CPrograms;

class A
{
    static int i = 1111;
 
    static
    {
    	System.out.println(i--);
    	System.out.println(--i);
        i = i-- - --i;
        System.out.println(i);
    }
 
    {
    	System.out.println(i);
        i = i++ + ++i;
        System.out.println(i);
    }
    
    public String S= "S1";
    public String gets() {
        return S;
   
}
}

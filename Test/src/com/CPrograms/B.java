package com.CPrograms;



class B extends A
{
    static
    {
    	System.out.println(i);
        i = --i - i--;
        System.out.println(i);
    }
 
    {
    	System.out.println(i);
        i = ++i + i++;
        System.out.println(i);
    }

    public static void main(String[] args)
    {
        B b = new B();
 
        System.out.println(b.i);
        int j=10 + + 11 - - 12 ;//+ + 13 - - 14 + + 15;
        System.out.println(j);
    }
    
    public String S = "S2";
    public String gets() {
        return S;
    }
}

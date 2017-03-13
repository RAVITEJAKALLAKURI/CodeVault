package com.CPrograms;


public class mm {
   public static void main(String args[]) { 
      int i=0, j=2;
      do {
         i=++i;
         j--;
      } while(j>0);
      System.out.println(i);
      Xas();
   }
   
   


static void  Xas() 
{ 
    String r = new String("abc");
    String s = new String("abc");
    r = r+1; //1
    r = null; //2
    s = s + r; //3
    return;
} //4
        


}

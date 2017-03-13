package com.oops;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws ParseException {
//        Scanner in = new Scanner(System.in);
//        int a0 = in.nextInt();
//        int a1 = in.nextInt();
//        int a2 = in.nextInt();
//        int b0 = in.nextInt();
//        int b1 = in.nextInt();
//        int b2 = in.nextInt();
//        
//        int alice=0,bob=0;
//        
//        if(a0>b0) alice=1;
//        else if(a0<b0)  {bob=1;}
//        
//        if(a1>b1) {alice+=1;}
//        else if(a1<b1){bob+=1;  }
//        
//        
//        if(a2>b2) alice+=1;
//        else if(a2<b2){ bob+=1;}
//        
//        
//        
//        System.out.println(alice!=0 ? bob!=0 ?alice+" "+bob:alice :bob!=0 ?bob:"");
//        
//        long sum=0;
//      
//        for(int arr_i=0; arr_i < 5; arr_i++){
//            sum= sum+in.nextInt();
//        }
//        System.out.println(sum);
//        Scanner in = new Scanner(System.in);
//    	 String time = in.next();
//    	 DateFormat sd= new SimpleDateFormat("hh:mm:ssa");
//         DateFormat sd1= new SimpleDateFormat("HH:mm:ss");
//         Date date = sd.parse(time);
//    
//         System.out.println(sd1.format(date));
 //   	System.arraycopy(src, srcPos, dest, destPos, length)
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int i, temp;
        for(int p=0;p<k;p++){
       	 temp = a[n-1];
          for ( i = n-1; i > 0 ;i--){
          
              a[i] = a[i - 1];
            
          }
          a[i] = temp;
       }
           for(int a0 = 0; a0 < q; a0++){
               int m = in.nextInt();
                if(m<a.length && m>=0)
               System.out.println(a[m]);
           }
           
    }
}

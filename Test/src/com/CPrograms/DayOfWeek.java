package com.CPrograms;

//Import Libraries
import javax.swing.*;
import java.util.*;
import java.io.*;


//This is my program.
public class DayOfWeek
{
 public static void main (String[] args)
 {
      int gd,gm,gy,ym,yp,d,isJanFeb;
     int[] m=new int[]{0,3,3,6,1,4,6,2,5,0,3,5};
     String[] wd=new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
     Scanner ip=new Scanner(System.in);
     System.out.println("Enter Date Month Year \"DD MM YYYY\"");
     gd=ip.nextInt();
     gm=ip.nextInt();
     gy=ip.nextInt();
     ym=gy-1900;  // years since 1900
     yp=ym/4;     // leap years since 1900
     int isJanFebLeap = ( gm < 3 && gy%4 == 0) ? 6 : 0;
     
     int leap=gy%4 == 0 && (gy%100 != 0 || gy%400 == 0) ? 6:0;
     System.out.println(gd + " " + gm + " " + gy + " " + ym + " " + yp);
     d=(gd+m[gm-1]+ym+yp +isJanFebLeap)%7;
     
     int d1=(gd+m[gm-1]+ym+yp +leap)%7;
     System.out.print(wd[d]+wd[d1]);
 }
}

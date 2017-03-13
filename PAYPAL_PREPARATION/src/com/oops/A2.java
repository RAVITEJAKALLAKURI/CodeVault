package com.oops;

public class A2 {
static int a =m1();
static int m1(){
	
	System.out.println("A2:a");
	return 10;
}
static {System.out.println("A2 class is loaded");}
public static void main(String[] args) {
	System.out.println("A2 main");
}
}

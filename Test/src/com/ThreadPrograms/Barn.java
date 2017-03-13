package com.ThreadPrograms;

public class Barn {
 public static void main(String[] args) {
 new Barn().go( 1,"hi");
 new Barn().go("hi", "world", 2);
 }
 public void go( int x,String... y) {
 System.out.print(y[y.length - 1] + " ");
 }
}
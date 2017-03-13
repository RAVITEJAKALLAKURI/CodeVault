package com.MapPrograms;

import java.util.*;

public class NavigableMapDemo implements Comparable<NavigableMapDemo>{
 
	int i;
  public NavigableMapDemo(int i) {
		// TODO Auto-generated constructor stub
	  
	  this.i=i;
	}

public static void main(String[] args) {
 
	NavigableMap<String,Integer> navigableMap=new TreeMap<String, Integer>();
 
	navigableMap.put("X", 500);
	navigableMap.put("B", 600);
	navigableMap.put("A", 700);
	navigableMap.put("T", 800);
	navigableMap.put("Y", 900);
	navigableMap.put("Z", 200);
 
	System.out.printf("Descending Set  : %s%n",navigableMap.descendingKeySet());
 
	System.out.printf("Floor Entry  : %s%n",navigableMap.floorEntry("L"));
 
	System.out.printf("First Entry  : %s%n",navigableMap.firstEntry());
 
	System.out.printf("Last Key : %s%n",navigableMap.lastKey());
 
	System.out.printf("First Key : %s%n",navigableMap.firstKey());
 
	System.out.printf("Original Map : %s%n",navigableMap);
 
	System.out.printf("Reverse Map : %s%n",navigableMap.descendingMap());
	
	 
		NavigableSet<Integer> navigableSet=new TreeSet<Integer>();
		NavigableSet<NavigableMapDemo> navigabledemo=new TreeSet<NavigableMapDemo>();
		navigabledemo.add(new NavigableMapDemo(20));
		navigabledemo.add(new NavigableMapDemo(10));
		navigabledemo.add(new NavigableMapDemo(30));
		navigabledemo.add(new NavigableMapDemo(-1));
		System.out.println(navigabledemo.first());
		System.out.println(navigabledemo.last());
	 //Collections.sort(navigableSet);
		navigableSet.add(500);
		navigableSet.add( 600);
		navigableSet.add( 700);
		navigableSet.add( 800);
		navigableSet.add( 900);
		navigableSet.add( 200);
	 
		System.out.printf("Descending Set  : %s%n",navigableSet.descendingSet());
	 
		System.out.printf("Floor Entry  : %s%n",navigableSet.floor(780));
	 
		System.out.printf("First Entry  : %s%n",navigableSet.first());
	 
		System.out.printf("Last Key : %s%n",navigableSet.last());
	 System.out.println(navigableSet.ceiling(0)+"celi"+navigableSet.higher(100));
		
	 
		System.out.printf("Original Map : %s%n",navigableSet);
	 
		
 
  }

@Override
public int compareTo(NavigableMapDemo demo) {
	// TODO Auto-generated method stub
	return (demo.i);
}
 public String toString()
 {
	 return this.i+"";
 }
}
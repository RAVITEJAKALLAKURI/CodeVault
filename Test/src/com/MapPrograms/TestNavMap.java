package com.MapPrograms;



import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;


public class TestNavMap {
	public static void main(String... args) {
        
		
		NavigableMap <Integer, String>navMap = new 
        ConcurrentSkipListMap<Integer, String>();
		
		navMap.put(4, "April");
		navMap.put(5, "May");
		navMap.put(6, "June");
		navMap.put(1, "January");
		navMap.put(2, "February");
		navMap.put(3, "March");

        navMap.pollFirstEntry();
        navMap.pollLastEntry();
        navMap.pollFirstEntry();
        System.out.println(navMap.size());


	     	      
	}
}
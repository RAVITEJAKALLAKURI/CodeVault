package com.ds;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	public static void main(String[] args) {
		
		List<? extends Object> a = new ArrayList<String>();
		
		//List<Object> b = new ArrayList<String>();
		//a.add("hh");
		
		
		String s =a.get(0);
	}

}

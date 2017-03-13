package com.Collections;

import java.util.ArrayList;

public class RemDupLiList {


public static void main(String[] args)
{
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(10);
	al.add(30);
	al.add(10); 
	
	for (int i = 0; i < al.size() - 1; i++) {

		final int element = al.get(i);
		for (int j = i + 1; j < al.size(); j++) {
		if (element == al.get(j)) {

		al.remove(j);
		j--;

		}

		}

		}

		System.out.println(al);

		} 



}

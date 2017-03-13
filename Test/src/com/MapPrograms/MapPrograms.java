package com.MapPrograms;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MapPrograms {

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
		
	    public static void main(String a[]){
	        Map<String, Integer> map = new TreeMap<String, Integer>();
	        map.put("java", 20);
	        map.put("C++", 45);
	        map.put("Java2Novice", 2);
	        map.put("Unix", 67);
	        map.put("MAC", 26);
	        map.put("Why this kolavari", 93);
	       @SuppressWarnings("unchecked")
		List list=Arrays.asList(map);
	       ConcurrentHashMap<String, Integer> con=new ConcurrentHashMap<String, Integer>();
	       con.put("java", 20);
	        con.put("C++", 45);
con.	        put("Unix", 67);
for (String key:con.keySet())
{
	
	if(con.get(key) ==45)

		con.remove(key);

		}
Map<String, Integer> nmp=new NavigableMap<String, Integer>() {
};


Hashtable<Integer, Integer> htt=new Hashtable<Integer, Integer>();
IdentityHashMap<String, Integer> thm=new IdentityHashMap<String, Integer>();

thm.put("java", 20);
thm.put("JAVA",21);
thm.put("C++", 45);
thm.put("Java2Novice", 2);
thm.put("Unix", 67);

for(String key :thm.keySet())
{
	String key1=null;
	if(key.equalsIgnoreCase(key1))
	{
	System.out.println("equal");	
	}
		 key1=key;
	}
		System.out.println("Successfully removed a pair!");
	
		for (String key:con.keySet())
		{
			System.out.println(key);

				}
		CopyOnWriteArrayList<Integer> cli=new CopyOnWriteArrayList<Integer>();
		cli.add(1);
		cli.add(2);
		cli.add(3);
		
		cli.add(4);
		Collections.unmodifiableList(cli);
		for(Integer cl:cli)
			
		{
			if(cl==2)
			cli.remove(1);
			
		}
	for(Integer cl:cli)
			
		{
			System.out.println(cl);
			
		}
	
	        
	       
	List<Integer> icl=new ArrayList<Integer>();
	icl.add(1);
	icl.add(2);
	icl.add(3);
	
	icl.add(4);

	for (int i = 0; i < icl.size(); i++) {
		
	
	System.out.println(icl.size());
		
			if(icl.contains(2))
				icl.remove(1);
		
	}
for(Integer cl:icl)
		
	{
		System.out.println(cl);
		
	}
	}

}

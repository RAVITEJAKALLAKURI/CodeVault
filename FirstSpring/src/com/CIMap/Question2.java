package com.CIMap;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question2 {

	private String EdUcation;
	
	private String name;
	private Map<Address,User> add;
	
	public Question2() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Question2(String name,String EdUcation,Map<Address,User> values)
	{
		this.EdUcation=EdUcation;
		this.name=name;
		this.add=values;
	}

	public Question2(String name,String EdUcation,String values)
	{
		this.EdUcation=EdUcation;
		this.name=name;
		//this.add=values;
	}
	
	
	public Question2(String name,String EdUcation)
	{
		this.EdUcation=EdUcation;
		this.name=name;
		//this.add=values;
	}


	public void details()
	{
		System.out.println(EdUcation+""+name+""+add);
		Set<Entry<Address,User>> set=add.entrySet();
		Iterator<Entry<Address,User>> it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}
}

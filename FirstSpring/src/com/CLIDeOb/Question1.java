package com.CLIDeOb;

import java.util.Iterator;
import java.util.List;

public class Question1 {

	private String EdUcation;
	
	private String name;
	private List<Address> add;
	
	public Question1() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Question1(String name,String EdUcation,List<Address> values)
	{
		this.EdUcation=EdUcation;
		this.name=name;
		this.add=values;
	}

	public void details()
	{
		System.out.println(EdUcation+""+name+""+add);
		Iterator<Address> it=add.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}
}

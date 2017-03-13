package com.CLIList;

import java.util.Iterator;
import java.util.List;

public class Question {

	public Question() {
		// TODO Auto-generated constructor stub
	}
	private String EdUcation;
		
			private String name;
			private List<String> techs;
	
	public Question(String name,String EdUcation,List<String> values)
	{
		this.EdUcation=EdUcation;
		this.name=name;
		this.techs=values;
	}

	public void details()
	{
		System.out.println(EdUcation+""+name+""+techs);
		Iterator<String> it=techs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		{
			
		}
	}
}

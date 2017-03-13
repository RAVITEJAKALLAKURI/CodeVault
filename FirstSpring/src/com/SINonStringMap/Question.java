package com.SINonStringMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question 
{
	private String name;
	private Map<Answer,User> ans;

	public Question()
	{
		
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	
	public Map<Answer, User> getAns() {
		return ans;
	}
	public void setAns(Map<Answer, User> ans) {
		this.ans = ans;
	}
	public void display()
	{
		System.out.println(name);
		Set<Entry<Answer,User>> set=ans.entrySet();
		Iterator<Entry<Answer, User>> it=set.iterator();
		while(it.hasNext())
		{
			Entry<Answer, User> ent=it.next();
			Answer ans=ent.getKey();
			User us=ent.getValue();
			System.out.println(ans+""+us);
		}
	}
}

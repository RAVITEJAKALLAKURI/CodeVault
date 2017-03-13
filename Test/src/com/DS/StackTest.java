package com.DS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//import java.util.Entry;
import java.util.Stack;

public class StackTest {

	/**
	 * @param args
	 */
	int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st=new Stack();
		st.push(new Integer(10));
		st.push(new Integer(20));
		st.push(new Integer(30));
		st.push(new Integer(40));
		st.pop();
		System.out.println(st.search(new Integer(10)));
	StackTest st1=new StackTest();
	st1.callStack();
Map<Integer,Integer> mp=new HashMap();
Set<Map.Entry<Integer,Integer>>stw=mp.entrySet();
Iterator<Map.Entry<Integer, Integer>> iter=stw.iterator();

while(iter.hasNext())
{
Map.Entry<Integer,Integer> ent=iter.next();
ent.getKey();
ent.getValue();
}}

	
	//System.out.println(x);
	
	private void callStack() {
		// TODO Auto-generated method stub
		System.out.println(x);
	}
}

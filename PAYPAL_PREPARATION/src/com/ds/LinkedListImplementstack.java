package com.ds;


public class LinkedListImplementstack {

	/**
	 * @param args
	 */
	

	static int top=-1;
	static ListNode main = new ListNode();
	static ListNode first=null;
	public void push(int data)
	{
	
		ListNode n = new ListNode();
		n.data =data;
		    n.next = first;
		    first = n;
	}
	
	public ListNode pop() {
	    ListNode temp = first;
	    first = first.next;
	    return temp;
	}

	

	public boolean isEmpty() {
	    return (first == null);
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedListImplementstack ls= new LinkedListImplementstack();
ls.push(1);
ls.push(2);
ls.push(3);
ls.pop();
ls.pop();
	}

}

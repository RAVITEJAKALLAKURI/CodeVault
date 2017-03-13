package com.ds;

import com.ds.LinkedList.Node;

public class NthNodeinLinkedList {

	/**
	 * @param args
	 */
	public static ListNode head;
	class ListNode
	{
		int data;
		ListNode next;
	}
	
	public NthNodeinLinkedList()
	{
		head= new ListNode();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NthNodeinLinkedList  nr= new NthNodeinLinkedList();
		nr.add(10);
//		nr.add(12);
//		nr.add(22);
//		nr.add(3);
//		nr.add(5);
//		nr.add(-1);
		nr.add(0);
		nr.add(5);
		//nr.add(-1);
		nr.add(0);
		
	findNthNode(3);
	removeduplicates();

	}

	private static void removeduplicates() {
		// TODO Auto-generated method stub
		
		ListNode p1=head,p2=head;
		
		while(p1.next!=null)
		{
			p2=p1;
			while(p2.next!=null)
			{
			if(p1.data==p2.next.data)
			{
				p2.next=p2.next.next;
				
			}
			else
				p2=p2.next;
			}
			p1=p1.next;
		
		}
		
		System.out.println("12");
	}

	private static void findNthNode(int n) {
		// TODO Auto-generated method stub
		int temp=n;
		ListNode p1=head,p2=head;
		
		while(temp>=0 )
			
		{
			if(p1.next ==null){
				System.out.println("Nodes are less than specified value");
				return;
			}
			p1=p1.next;
			temp--;
		}
		
		while(p1.next!=null)
		{
			p1=p1.next;
			p2=p2.next;
		}
		
		System.out.println(p2.data);
	}

	private ListNode add(int i) {
		// TODO Auto-generated method stub
		ListNode temp= head;
		if(temp.next ==null && temp.data ==0)
		{
			temp.data=i;
		return temp;
		}
		while(temp.next !=null)
		{
			
			temp =temp.next;
			
		}
		
		ListNode newNode= new ListNode();
		newNode.data=i;
		
		temp.next =newNode;
		return temp;
	}

}

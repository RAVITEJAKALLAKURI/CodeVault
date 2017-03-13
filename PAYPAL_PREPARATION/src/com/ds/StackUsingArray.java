package com.ds;

public class StackUsingArray {

	
	
	static int arr[]=new int[10];
	static int top=-1;
	
	
	public void push(int data)
	{
		top++;
		arr[top]=data;
	}
	
	public int pop()
	{
	
		top--;
		return arr[top];
	}
	
	public int peek()
	{
		
		return arr[top];
	}
	public static void main(String[] args) {
	
		StackUsingArray ar= new StackUsingArray();
	ar.push(10);
	ar.push(20);
	ar.push(30);
	ar.peek();
	ar.pop();
	ar.peek();
display();
	}

	private static void display() {
		// TODO Auto-generated method stub
		for(int i= top ;i>=0;i--)
			System.out.println(arr[i]);
	}
}

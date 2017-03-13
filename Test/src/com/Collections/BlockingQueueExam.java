package com.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExam 
{

	public static void main(String[] args) throws InterruptedException
	{
		Deque<Integer> br =new ArrayDeque<Integer>() ;
		
		br.add(1);
		br.addFirst(2);
		br.addLast(3);
		System.out.println(br.toString());
		
		br.pollFirst();
		System.out.println(br.toString());
		
		BlockingQueue<Integer> ir=new ArrayBlockingQueue<Integer>(10);
		
		ir.put(2);
		//ir.put(1);
		ir.take();
		ir.take();
		ir.put(1);
		System.out.println(ir.toString());
		}
	
}

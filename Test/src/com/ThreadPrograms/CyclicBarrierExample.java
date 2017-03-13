package com.ThreadPrograms;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
* Java program to demonstrate how to use CyclicBarrier in Java. CyclicBarrier is a
* new Concurrency Utility added in Java 5 Concurrent package.
*
* @author Javin Paul
*/
public class CyclicBarrierExample {

   //Runnable task for each thread
   private static class Task implements Runnable {

       private CyclicBarrier barrier;

       public Task(CyclicBarrier barrier) {
           this.barrier = barrier;
       }

       @Override
       public void run() {
           try {
               System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
               barrier.await();
               System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
           } catch (InterruptedException ex) {
               Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
           } catch (BrokenBarrierException ex) {
               Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   }

   public static void main(String args[]) {

       //creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()
       final CyclicBarrier cb = new CyclicBarrier(3, new Runnable(){
           @Override
           public void run(){
               //This task will be executed once all thread reaches barrier
               System.out.println("All parties are arrived at barrier, lets play");
           }
       });
       //starting each of thread
       Thread t1 = new Thread(new Task(cb), "Thread 1");
       Thread t2 = new Thread(new Task(cb), "Thread 2");
       Thread t3 = new Thread(new Task(cb), "Thread 3");

       t1.start();
       
       t2.start();
       
       System.out.println(t1.interrupted() +""+t2.interrupted());
       t1.interrupt();
       
       
       System.out.println(t1.interrupted() +""+t2.interrupted());
       System.out.println(t1.isInterrupted()+""+t1.isInterrupted());
       t3.start();
       final CyclicBarrier c=new CyclicBarrier(3);
       
       cb.reset();
       //starting each of thread
       Thread t11 = new Thread(new Task(cb), "Thread 11");
       Thread t12 = new Thread(new Task(cb), "Thread 12");
       Thread t13 = new Thread(new Task(cb), "Thread 13");

       t11.start();
       t12.start();
       t13.start();
       
    
   }
}



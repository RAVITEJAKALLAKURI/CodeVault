
public class TestJoin extends Thread{  
     public void run(){  
      for(int i=1;i<=10;i++){  
       try{  
        Thread.sleep(500);
        if(Thread.currentThread().getName().equals("Thread-1"))
        Thread.yield();
       }catch(Exception e){System.out.println(e+Thread.currentThread().getName());}  
      System.out.println(i+Thread.currentThread().getName()+Thread.currentThread().getPriority());  
      }  
     }  
    public static void main(String args[]){  
    	TestJoin t1=new TestJoin();  
    	TestJoin t2=new TestJoin();  
     TestJoin t3=new TestJoin();  
     t1.start();  
     //t1.setPriority(123);
     try{  
      t1.join();  
     }catch(Exception e){System.out.println(e);}  
      
     t2.start();  
     t2.yield();
     t3.start();  
     }  
    }  
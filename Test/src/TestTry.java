import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class TestTry extends Thread
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println(checknumber(sc.nextInt()));
		
		String s="abc";
		StringBuffer sb=new StringBuffer("bbc");
		StringBuilder sb1=new StringBuilder("bbd");
		Integer i=12;
		Character ch=new Character('1');
		System.out.println(s.toString()+""+sb1.toString()+""+i.toString()+""+ch.toString());
		
		try
		{
		    try
		    {
		    	Thread t1=new Thread();
		    	Thread t2=new Thread();
		    	t1.setName("1");
		    	t1.setName("2");
		    	t1.start();
		    	t2.start();
		    	t1.join();
		    	
		    }
		  catch(Exception e){}
		}
		catch(Exception e)
		{
		}
		finally
		{
			
		}
	}
public void run()
{
	for (int i=0;i<=10;i++)
	{
		System.out.println(Thread.currentThread().getName());
	}
	}
	private static int checknumber(Integer next) {
	
		try
		{
			if(next%0 ==0)
			
				System.out.println("123");
			return 3;
		}
		
		catch(Exception e)
		{
			System.out.println("in Excep");
			return 1;
		}
		finally
		{
			return 2;
		}
	}
}

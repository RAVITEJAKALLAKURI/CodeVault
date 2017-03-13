import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Exam {

	
	public static void main(String[] as) throws ClassNotFoundException
	{
		Boolean b=new Boolean("TRue");
		Boolean b1=new Boolean("true");
		System.out.println(b.equals(b1));
		
	System.out.println(calltry(10,2));
	System.out.println(callexit());
	callex();
	ArrayList<Integer> a=new ArrayList<Integer>();
	ArrayList<Integer> a1=new ArrayList<Integer>();
	Class c=Class.forName("java.util.List");
	System.out.println(c.isInstance(a)+"IN");
	System.out.println(a.equals(a1));
	a.add(0);
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(5);
	a.add(4);
	a1.add(0);
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	Integer a2[]=new Integer[10]; 
	Integer a3[]=a.toArray(a2);
	a.iterator();
	System.out.println(a.equals(a1));
	a1.add(5);
	a1.remove(0);
	System.out.println(a.equals(a1));
	Set<Integer> s=new HashSet<Integer>();
	Set<Integer> s1=new HashSet<Integer>();
	s.add(0);
	s.add(1);
	s1.add(1);
	s1.add(0);
	System.out.println(s.equals(s1)+"syssysoSet");
	}

	private static void callex() {
		// TODO Auto-generated method stub
		try
		{
			throw new IOException();
		//	System.out.println("a");
		}
		catch(Exception e )
		{
			System.out.println("exception");
		}
	}

	private static int callexit() {
		// TODO Auto-generated method stub
	try
	{
		System.out.println(1);
		//System.exit(0);
		return 1;
	}
	catch(Exception e)
	{
		System.out.println("exception");
	}
	return 1;
	}

	private static int calltry(int a ,int b) {
		// TODO Auto-generated method stub
		try
		{
			int x=a/b;
			System.out.println(x);
			return x;
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		return b;
	}
	
	
}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;


public class B extends A implements Serializable{

	int y;
	final transient int  x=10;
	public B()
{
this.y=20;
System.out.println("B init");
}
	
	
	static public void m1()
	{
		System.out.println("Sub m1");
	}
	private void m3()
	{
		
	}
	
	static public void m5(String s){}
	void m4(char ch)
	{
		System.out.println("sub cahr");
	}
	public static void main(String[] s) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		A a =new B();
		a.m2();
		a.m4('a');
		a.m4('a');
		B b=new B();
		ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("ab.ser"));
		b.y=100;
		oo.writeObject(b);
//b.m4(5000);
//b.m5(50);
		ObjectInputStream oos=new ObjectInputStream(new FileInputStream("ab.ser"));
		b.y=100;
		
		System.out.println(oos.readObject());
		LinkedList<Integer> lik=new LinkedList<Integer>();
		//lik.add(1, 2);
	//	lik.add(1, 2);
		//lik.add(1, 2);
		System.out.println(lik);
		System.out.println(b.x);
		
	}
	public String toString()
	{
		return y+"";
	}
}

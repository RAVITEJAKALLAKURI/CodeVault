import java.io.IOException;


public class Sub  extends Super
{
	int[] a =new int[2];
	public Integer inte() throws ArithmeticException
	{
		System.out.println("Sup");
		return 1;
		}
	public void test(String abc)
	{
		System.out.println("one sub");
		}
	public static void main(String... s) throws IOException, InterruptedException
	{Sub s1=new Sub();
	Sub s9=(Sub)new Super();
	s9.test();
	s1.test();
	s1.inte();
	s1.m(10);
	String s2=new String();
	System.out.println(s2);
	String s3="abc";
	char[] ch=s3.toCharArray();
	
	char c=ch[0];
	//s2.wait();
	s1.inarrtest(s1.a);
	System.out.println(s1.a.length);
	Thread.sleep(100000);
	
	//Sub saa=(Sub)new Super();
	//saa.m();
	}
	
	public void inarrtest(int[] a)
	{
		int[]b =new int[3];
		a=b;
		System.out.println(b.length);
		System.out.println(a.length);
	}
	/*@Override
/*	public void m(int x)
	{
		System.out.println("Sub m");
	}*/
}

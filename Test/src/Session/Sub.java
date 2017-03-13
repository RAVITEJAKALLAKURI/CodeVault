package Session;

public class Sub extends Super {

	
	public static void m()
	{
		System.out.println("Sub");
	}
	
	public static void main(String... args)
	{
		Sub sb=new Sub();
		sb.m();
		
	}
}

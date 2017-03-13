import java.io.Serializable;


public class A implements Serializable{

	 int x;
	public A()
	{
		this.x=10;
		System.out.println("A intit");
	}

	static public void m1()
	{
		System.out.println("Super m1");
	}
	
	public void m2()
	{
		System.out.println("Super m2");
		m1();
	}
	
	private void m3()
	{
		
	}

	public void m4(int c) {
		// TODO Auto-generated method stub
		System.out.println("Super m4");
	}
	public void m5(int c) {
		// TODO Auto-generated method stub
		System.out.println("Super m5");
	}
}

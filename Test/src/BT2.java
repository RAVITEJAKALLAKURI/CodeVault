
public class BT2 extends BT1 
{
public BT2() 
{
	}
	
	public void overr(int x)
	{
		System.out.println("X");
	}
	
	public static final void main(String... args)
	{
		
		
		BT1 bt1=new BT1();
		bt1.overr(2);
		
		BT2 bt2=new BT2();
		bt2.overr(2);
		System.out.println(bt2.toString());
	bttint();
	
	}	
	
	@Override
	public int hashCode()
	{
		return 0;
		
	}
public static int bttint()
{
	try
	{
		return 3;
	}
	finally
	{
		System.out.println("fin");
	}
	//System.out.println(12);
	}

}
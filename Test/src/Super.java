import java.io.IOException;


public class Super {


public Number inte() throws IOException
{
	System.out.println("Super");
	return 1;
	}
	
protected	void m()
	{
		System.out.println("Super");
	}

public void m(final int  x)
{
	
	try
	{
		int i=10/0;
		return ;
	}
	catch(Exception e)
	{
		
	}
	finally
	{
		
	}
	System.out.println("ravi");
	}

public void test()
{
	System.out.println("one super");
	}
}

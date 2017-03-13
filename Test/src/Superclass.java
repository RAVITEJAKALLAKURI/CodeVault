import java.io.IOException;


public class Superclass {

	/**
	 * @param args
	 */
	
	public int doIt(String str,Integer...integers ) throws IOException
	{
		
		String signature="(String , Integer1[])";
		System.out.println(str+""+signature);
		return 1;
	}
	
}


class subClass extends Superclass
{

	
	public int doIt(String str,Integer...integers ) throws Error
	{
		
		String signature="(String , Integer[])";
		System.out.println(str+""+signature);
		return 0;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
subClass sb=new subClass();
sb.doIt("hello", 3);
	}

}

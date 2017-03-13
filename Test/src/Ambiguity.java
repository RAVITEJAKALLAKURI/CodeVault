import java.util.HashMap;
import java.util.Map;


public class Ambiguity {

	/**
	 * @param args
	 */
	Map<Integer,String> mp=new HashMap<Integer, String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ambiguity ab=new Ambiguity();
ab.m(10000000.1,100.1);

	}

	public void m(float i,double d)
	{
	System.out.println("int");	
	}
	public void m(double b,float f)
	{
		System.out.println("byte");
	}
	
	
	
}

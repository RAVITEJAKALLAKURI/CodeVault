import java.util.ArrayList;
import java.util.List;


public class Generics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List a =new ArrayList<Integer>();
		
		a.add(1);
		
		m1(a);
		
		String s="a";
		String s2="a";
		System.out.println(s==s2);
		String s1=s.intern();
		System.out.println(s==s1);
		
		
	}
	
	public static void m1(List<Integer> a)
	
	{
		int sum=0;
	for(int i=0;i<a.size();i++)
	{
		System.out.println(sum=sum+a.get(i));
	}
	}
}

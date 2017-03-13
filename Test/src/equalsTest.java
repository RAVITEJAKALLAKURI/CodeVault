import java.util.ArrayList;
import java.util.HashMap;


public class equalsTest {

	private String name;
	/**
	 * @param args
	 */
	
	public equalsTest(String name)
	{
		this.name=name;
	}
	
	public static final equalsTest EAST=new equalsTest("EAST");
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Object> al1=new ArrayList<Object>();
		al1.add(1);
		al1.add(2);
		al1.add("2");
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(1);
		al2.add(1,2);
		System.out.println(al1.equals(al2));
		
		HashMap<String,String> mp1=new HashMap<String,String>();
		mp1.put("1", "1");
		mp1.put("2", "2");
		HashMap<Object,Object> mp2=new HashMap<Object,Object>();
		mp2.put("1", "1");
		mp2.put("2", "2");
		
		System.out.println(mp1.equals(mp2));
		System.out.println(EAST.equals(equalsTest.EAST));
		
		//m1(new Object());
	}

	private static void m1(Object obj) {
		// TODO Auto-generated method stub
		
		
		/*if(obj instanceof int[])
			int a[]=(int[])obj;
		
		if(obj instanceof String[])
			String[] s=(String[])obj;*/
		
	}

}

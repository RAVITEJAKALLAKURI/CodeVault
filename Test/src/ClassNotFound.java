import java.util.HashSet;

import com.I18N.LocaleExample;


public class ClassNotFound {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		/*Test t=new Test();
		String s="Test";
		Class.forName(s);*/
		
		byte a=10;
		a++;
		//a=a+1;
		System.out.println(a);
		
		Test t=new Test();
		String s="Test";
		LocaleExample l=new LocaleExample();
		System.out.println(t instanceof Test);
		System.out.println(Class.forName("com.I18N.LocaleExample").isInstance(l));
		
		HashSet< String> s1=new HashSet<String>();
		s1.add(null);
		System.out.println(s1.toArray());

	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class ClassLoader {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	static final synchronized  public void main(String[] a) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		
		System.out.println(Class.forName("java.lang.String").getClassLoader());
		System.out.println(Class.forName("ClassLoader").getClassLoader());
		Object o=Class.forName("java.lang.String").newInstance();
	      System.out.println(o.getClass().getModifiers());
	      
	      
	      byte b=1;
	      
	      b=(byte) (b+1);
	      //m1();
	      
	ClassLoader cd=new ClassLoader();
	String msg = "http://10.123.43.67:80/";
    StringTokenizer st = new StringTokenizer(msg,"10");
    System.out.println(st);
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());

        
	}

    List<String> ali=new ArrayList<String>();
    ali.add("1");
    String[] arr=ali.toArray(new String[2]);
    System.out.println(arr.toString());    
  
/*ClassLoader(int a)
{
	}*/
}
	  public static void main(String ar)
	    {
	    	System.out.println("abc");
	    }
	
}

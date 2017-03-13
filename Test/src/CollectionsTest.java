import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import java.util.ListIterator;




public class CollectionsTest extends HashMap{

	/**
	 * @param args
	 * @throws NoSuchFieldException 
	 * @throws SecurityException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	
	int x;
	static
	{
	new CollectionsTest().	x=10;
	}
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub

		java.util.Hashtable hs=new Hashtable();
		java.util.HashMap hsm=new HashMap();
		//Collections.sy
		//hs.put(null, 2);
	//	hsm.put(null, 3);
		//hsm.put(null, 4);
		
		hsm.put(1,1);
		hsm.put(2,1);
		hsm.put(3,1);
		hsm.put(4,1);
		hsm.put(5,1);
		hsm.put(6,1);
		hsm.put(7,1);
		hsm.put(8,1);
		hsm.put(9,1);
		hsm.put(10,1);
		hsm.put(11,11);
		hsm.put(12,12);
		hsm.put(13,12);
		
		System.out.println(hsm.size());
		System.out.println(hsm.values().size());
		Field tableField = HashMap.class.getDeclaredField("table");
		tableField.setAccessible(true);
		Object[] table = (Object[]) tableField.get(hsm);
		System.out.println(table == null ? 0 : table.length);
		hsm.put(1, 4);
		Iterator<Map.Entry> ite=hsm.entrySet().iterator();
		while(ite.hasNext())
		{
			Map.Entry mp=ite.next();
			if((Integer)mp.getKey()==1)
				ite.remove();
			
				
		}
		hsm.put(new CollectionsTest(), "test");
		System.out.println(hsm.get(1)+"1");
		
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(null);
		
		hset.add(null);
		System.out.println(hset.size());
		hset.add(1);
		
		Iterator<Integer> itr=hset.iterator();
		
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		//Collections.si
		
		ListIterator<Integer> liite=list.listIterator();
		while(liite.hasNext())
		{
			liite.set(200+liite.next());
		}
		
		Properties p=new Properties();
		
		
	}

}

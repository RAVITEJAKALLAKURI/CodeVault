import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class Test {

	
	public  static void main(String[] args)
	{
		String[] as={"RAVI","TEJA"};
		List<String> astr=Arrays.asList(as);
		//testList(astr);
		List<String> asr=new ArrayList<String>();
		asr.add("BO");
		asr.addAll(astr);
		System.out.println(asr);
		Test t=new Test();
		//t.testList(astr);
		
		
		ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        arrl.addAll(list);
        System.out.println("After Copy: "+arrl);
        
        //m1(12);
        
        String s="RAVI";
        System.out.println(s.substring(10)+"Sub");


	}

	private  void testList(List<Object> astr) {
		// TODO Auto-generated method stub
		
	}
	
	private static void m1(int... a)
	{}

	private static void m1(float... a)
	{}
}

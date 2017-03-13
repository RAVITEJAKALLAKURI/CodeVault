
public class wordreverse {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
String str="How are You";
StringBuffer sb=new StringBuffer();
String[] temp=str.split(" ");
/*for (String val:temp){
	sb.append(val);
	
}*/

for(int i=temp.length-1;i>=0;i--)
{
	sb.append(temp[i]);
	sb.append("\t");
	}
System.out.println(sb.toString());

	

	Integer in=100;
	System.out.println(in.toString());
	
	wordreverse www=(wordreverse)Class.forName("wordreverse").newInstance();
	
	System.out.println(www.toString());
	
	String st="123";
	st="456";
	System.out.println();
}
}
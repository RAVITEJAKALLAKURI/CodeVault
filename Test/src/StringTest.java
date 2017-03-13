
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abc";
		s="123";
		System.out.println(s);
		//System.out.println(this);
		
		StringTest st=new StringTest();
		st.m();
		
	}

	private void m() {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

}

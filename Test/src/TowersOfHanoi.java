
public class TowersOfHanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char source='A',dest='C',temp='B';
		recurse(3,source,temp,dest);
		
	}

	private static void recurse(int i, char source, char temp, char dest) {
		// TODO Auto-generated method stub
		
		if(i==1)
		{
			System.out.println(i+""+source+""+dest);
		return;	
		}
		recurse(i-1,source,dest,temp);
		System.out.println(i+""+source+""+dest);
		recurse(i-1,temp,source,dest);
	
	
	}

}

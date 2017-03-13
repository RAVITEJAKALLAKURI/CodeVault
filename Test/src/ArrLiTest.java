import java.util.ArrayList;


public class ArrLiTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> sr=new ArrayList<Integer>();

sr.add(0,10);
sr.add(1,20);
sr.add(2,30);
sr.add(3,40);

int i=10;
test(sr,i);
System.out.println(sr+""+i);

substr("WXYZ");
	
	}

	private static void substr(String input) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < input.length(); i++) {             // pos. of 1st letter
		    for (int j = 0; j < input.length(); j++) {         // pos. of 2nd letter
		        for (int k = 0; k < input.length(); k++) {     // pos. of 3rd letter
		            if (i == j || i == k || j == k) continue;  // any letter taken twice? -> skip
		            System.out.printf("%c%c%c\n", input.charAt(i), input.charAt(j), input.charAt(k));
		        }
		    }
		}
		
	}

	private static void test(ArrayList<Integer> sr,int i) {
		// TODO Auto-generated method stub
		sr.remove(3);
		i=20;
		System.out.println(sr+""+i);
	}
	
	
	
}

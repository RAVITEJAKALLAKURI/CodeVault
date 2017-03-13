import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class HelloWorld {

	/**
	 * @param args
	 */
	int j;
	 static public  void main(String... s) throws IOException {
		   // The comment below is no typo. 
		   // \u000d out.println("Hello World!");
		 
		 int i;
		// System.out.println(i);
		 HelloWorld hw=new HelloWorld();
		 System.out.println(hw.j);
		

	 int[] arr= new int[10];
	 String[] srr= new String[5];
	 Character[] crr=new Character[5];
	 String line;
	 int temp=0;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
while(!(line =br.readLine()).isEmpty())
{
	crr[temp]=line.charAt(0);
	temp++;
	}


	 Collections.sort(Arrays.asList(crr));
	 Collections.reverse(Arrays.asList(crr));
	 System.out.println(crr[1]);
}
}
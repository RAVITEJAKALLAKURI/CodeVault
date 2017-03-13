import java.math.BigDecimal;
import java.util.Collections;


public class SysProp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double d1=new Double("1.25");
		Double d2=new Double("1.05");
		System.out.println(d1-d2);
		

		Float f1=new Float("1.25");
		Float f2=new Float("1.05");
		System.out.println(f1-f2);
		
		
BigDecimal b1=new BigDecimal("1.25");

BigDecimal b2=new BigDecimal("1.05");

System.out.println(b1.subtract(b2));

BigDecimal b11=new BigDecimal(1.25);

BigDecimal b21=new BigDecimal(1.05);

System.out.println(b11.subtract(b21));


System.out.println(System.getProperty("java.home"));

System.out.println(System.getProperty("JAVA_HOME"));


	}

}

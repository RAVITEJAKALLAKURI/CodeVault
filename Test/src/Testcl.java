import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


 class Testcl implements TestIn {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println(a);
		
		int i=25;
		int j=10;
		int resuke= ++i-j--%12>3?i++:--j;
		System.out.println(resuke);
		testvar(1);
		testvar(1,"1","2");
		testvar(1,new String[]{"1"});
		testvar(1);
		
		Testcl c1=new Testcl();
		System.out.println(10==10);
		System.out.println(10.0==10.0);
		c1.wait();
		
		Lock ck=new ReentrantLock();
		Exception et=new ArithmeticException();
		
	}
public static void testvar(int i,String... args)
{
	}
}

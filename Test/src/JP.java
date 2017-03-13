


public class JP implements Runnable{
Thread t1;
Thread t2;
	
	public static void main(String[] args)
	{
		JP j=new JP();
		j.t1=new Thread(new JP(),"t1");
		 j.t2=new Thread(new JP(),"t2");
		j.t1.start();
		j.t2.start();
	}

	private static void callint(int i) {
		// TODO Auto-generated method stub
	callint(i++)	;
	}
	@Override
	public void run()
	{
		
		if(t1.getName().equals("t1"))
			try {
				first();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else
	second();}
	

	private static synchronized void first() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("first");
		Thread.sleep(5000);
		
	}

	private static synchronized void second() {
		// TODO Auto-generated method stub
		System.out.println("second");
	}
}

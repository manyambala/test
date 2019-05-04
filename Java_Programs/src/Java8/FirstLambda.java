package Java8;

public interface FirstLambda extends Runnable {

	String FirstLambda = null;
	public abstract void add();
	
	public default void run()
	{
		
				
		for(int i=0;i<=2;i++)
		{
		try
		{
			Thread.sleep(2000);
			System.out.println("Thread resumed"+Thread.currentThread());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstLambda fl=()->System.out.println();
		
		//fl.run();
		//fl.sub();
		System.out.println(fl);
		
		FirstLambda fl1=()->System.out.println();
		System.out.println(fl1);

	/*	synchronized concept
	  Thread t=new Thread(fl);	

		synchronized (t) {

			t.setName("First Thread");
			t.start();
			//t.run();
		}
			t.run();
			
			*/
		
		  Thread t=new Thread(fl);
		  t.setName("First Thread");

		Thread t1=new Thread(fl);
		
		t1.setName("second thread");
		//t1.start();
		//t1.run();
		System.out.println(t1.getPriority()+" "+t.getPriority());
		
		//t1.setDaemon(true);
		t1.holdsLock(t);
		t.start();
		t.run();
		//t1.stop();
		//t1.start();
		t1.start();
		t1.run();

	}

}

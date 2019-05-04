package threads;

public class First_Thread extends Thread {

	/*
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("run method in Threads");
		
		}
	}
	
	public static void main(String[] arsg)
	{
		First_Thread ft=new First_Thread();
		First_Thread ft1=new First_Thread();
		
		ft.run();
		ft1.run();
		System.out.println("start method");
	
		ft.start();
		ft1.start();
	}
	*/
	
	
		
/*	
	synchronized void add(int n)
	{
		for(int i=0;i<5;i++)
		{
		System.out.println(Thread.currentThread()+"From synchronized "+n*i);
		try
		{
		sleep(1000);
		}
		catch(InterruptedException exc)
		{
			exc.printStackTrace();
		}
		}
	}
	*/
	
	public void add(int n)
	{
		for(int i=0;i<5;i++)
		{
		System.out.println(Thread.currentThread()+"From synchronized "+n*i);
		try
		{
		sleep(1000);
		}
		catch(InterruptedException exc)
		{
			exc.printStackTrace();
		}
		}
	}
	public void run()
	{
		add(5);
	}
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		First_Thread ft=new First_Thread();
		Thread ft1=new Thread(ft);
		Thread ft2=new Thread(ft);
		ft1.setName("first thread");
		ft2.setName("second thread");
		ft1.start();
		ft2.start();
		ft1.run();
		ft2.run();
		
		/*First_Thread ft=new First_Thread();
		First_Thread ft1=new First_Thread();
		//ft.start();
		//ft1.start();
		
		ft.run();
		ft1.run();
		
		System.out.println("**************");*/
	}
	
}

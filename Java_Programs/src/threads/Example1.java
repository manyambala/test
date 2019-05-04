package threads;

import java.util.Hashtable;

public class Example1 extends Thread{
	
	public void add()
	{
		Hashtable<Integer, String> ht=new Hashtable();
		ht.put(1, "naresh");
		ht.put(2, "bala");
		ht.put(1, "manyam");
		ht.put(3, "pppp");
		
		System.out.println(ht+" "+currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example1 ex=new Example1();
		ex.add();
		
		/*it is not working 
		 * Thread t1=new Thread(ex);
		Thread t2=new Thread(ex);
		t1.setName("first thread");
		t2.setName("second thread");
		
		t1.start();
		t2.start();*/
		
	}

}

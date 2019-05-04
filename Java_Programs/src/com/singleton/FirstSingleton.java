package com.singleton;

public class FirstSingleton {
	
	private FirstSingleton()
	{
		
	}
	
	public static int a;
	
	private static FirstSingleton fs=new FirstSingleton();
	
	//private static FirstSingleton fs=null;
	
	public static FirstSingleton getInstance()
	{
		return fs;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstSingleton fs1=fs.getInstance();
		FirstSingleton fs2=fs.getInstance();
		FirstSingleton fs3=fs.getInstance();
		
		System.out.println(fs1);
		System.out.println(fs2);
		
		int x=980;
		fs1.a=x;
		
		System.out.println(fs1.a+" "+fs1.hashCode());
		System.out.println(fs2.a+" "+fs2.hashCode());
		System.out.println(fs3.a+" "+fs3.hashCode());
		
		
		int y=444;
		fs3.a=y;
		

		System.out.println(fs1.a+" "+fs1.hashCode());
		System.out.println(fs2.a+" "+fs2.hashCode());
		System.out.println(fs3.a+" "+fs3.hashCode());
		
		/*FirstSingleton fs1=new FirstSingleton();
		FirstSingleton fs2=new FirstSingleton();
		FirstSingleton fs3=new FirstSingleton();
		
		System.out.println(fs1);
		System.out.println(fs2);*/
		
		
		
	}

}

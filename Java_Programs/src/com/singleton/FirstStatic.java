package com.singleton;

public class FirstStatic {
	
	public static int a;
	
	public void add()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstStatic fs=new FirstStatic();
		FirstStatic fs1=new FirstStatic();
		FirstStatic fs2=new FirstStatic();
		
		System.out.println(fs);
		System.out.println(fs1);
		
		int x=897;
		fs.a=x;
		
		System.out.println(fs.a+" "+fs.hashCode());
		System.out.println(fs1.a+" "+fs1.hashCode());
		System.out.println(fs2.a+" "+fs2.hashCode());
		
	}

}

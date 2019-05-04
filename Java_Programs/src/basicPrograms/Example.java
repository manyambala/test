package basicPrograms;

import java.util.Scanner;

public class Example {
	
	volatile int a=100;
	
	public void add()
	{
		//int a,b,c;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example ex=new Example();
		ex.add();
		int b=ex.a;
		System.out.println(b);
		/*
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter values");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		

		if (a>b && a>c && b>c)
		{
		System.out.println(a+" is greater");
		}
		
		else if(b>c && b>a);
		{
		System.out.println(b+" is greater");
		}
		
		//else
		{
		System.out.println(c+" is greater");
		}
		
		
		int d=a+b+c;
		System.out.println(d);
		*/
	}

}

package logics;

import java.util.Scanner;

public class Armstrong {
	public void add()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num for checking armstrong or not");
		int r=sc.nextInt();
		int num=r;
		int a=1;
		int b=0;
		
		String s=String.valueOf(num);
		
		int length=s.length();
		System.out.println(length);
		
		
		for(int d=1;d<=length;d++)
		{
			int p=num%10;
			a=1;
		for(int c=1;c<=length;c++)
		{
			
			a=a*p;
			System.out.println(a);
		}
		
		num=num/10;
		System.out.println(p+"###");
		
		b=b+a;
		System.out.println(b+"*****");
		}
		if(b == r)
		{
			System.out.println(b+" it is a armstrong number");
		}
		else
		{
			System.out.println(b+" it is a not a armstrong number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Armstrong am=new Armstrong();
		am.add();
	}

}

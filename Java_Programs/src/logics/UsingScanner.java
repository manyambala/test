package logics;

import java.io.InputStream;
import java.util.Scanner;

import javax.net.ssl.HandshakeCompletedEvent;

public class UsingScanner {
	
	int a,b,c;
	
	public void details(int a,int b)
	{
		int c=a+b;
		System.out.println("a+b="+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a and b values");
		int x=sc.nextInt();
		System.out.println("value a is "+x);
		int y=sc.nextInt();
		System.out.println("value b is "+y);
		
		UsingScanner us=new UsingScanner();
		us.details(x,y);
		
		System.out.println("enter the string value");
		String we=sc.next();
		System.out.println(we);
		
		String p="my name is bala naresh";
		p="kokokokk";
		
		System.out.println(p);
		
		String q="my name is parrot";
		System.out.println(p+" "+ q);
		
		String r=p+q;
		
		System.out.println(r);
		
		String s=p+"manyam";
		
		StringBuffer xb=new StringBuffer("youtube");
		xb.append("twitter");
		System.out.println(xb);
		xb.insert(0,xb);
		System.out.println(xb);
		
		String nenu="nenevunanni";
		nenu.concat("avnu");
		System.out.println(nenu);
		
		int m=nenu.hashCode();
		
		System.out.println(m);
		
		
		System.out.println(s);
		
		 
		
		
	}

}

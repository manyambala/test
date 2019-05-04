package logics;

import java.util.Scanner;

public class ReverseString {
	
	public void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to reverse that string");
		String s=sc.nextLine();
		//String s="manyam Bala Naresh";
		char[] ch=s.toCharArray();
		int l=ch.length;
		System.out.println(l);
		for(int k=(l-1);k>=0;k--)
		{
			System.out.print(ch[k]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseString rs=new ReverseString();
		rs.add();

	}

}

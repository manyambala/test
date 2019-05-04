package logics;

import java.util.Scanner;

public class PrimeNum {
	
	public int a;
	int count;
	
	public void prime(int a)
	{
		for(int i=2;i<=a;i++)
		{
			if((a%i) == 0)
			{
				count ++;
			}
		}
		
		if(count == 2)
		{
			System.out.println(a+" it is prime number");
		}
		else
		{
			System.out.println(a+" it is not a prime num");
		}
		
		count=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int	b=sc.nextInt();
	
	PrimeNum pn=new PrimeNum();
	pn.prime(b);
	
		
		
	}

}

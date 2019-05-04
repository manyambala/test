package logics;

import java.util.Scanner;

public class NumericPattern {

	public void halfDiamond()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to form the diamond");
		int num=sc.nextInt();
		int k=0;
		for(int a=num;a>=0;a--)	
		{
			for(int c=1;c<=a;c++)
			{
				System.out.print(" ");
			}
			for(int b=a;b<=num;b++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			k=k+1;

		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumericPattern np=new NumericPattern();
		np.halfDiamond();
		
	}

}

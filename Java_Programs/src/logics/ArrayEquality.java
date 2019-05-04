package logics;

import java.util.Arrays;

public class ArrayEquality {
	
	public void add()
	{
		int ar[]= {1,2,3,4};
		int ar1[]= {3,4};
		
		System.out.println(Arrays.equals(ar, ar1));
		
		int a=ar.length;
		int b=ar1.length;
		
		boolean equal=true;
		
		if(a == b)
		{
			System.out.println(a+"  "+b);
		for(int k=0;k<a;k++)
		{
			if(ar[k] != ar1[k])
			{
				equal=false;
			}
		}
		System.out.println(equal);

		if(equal == true)
		{
			System.out.println("both arrays are in same");
		}
		else
		{
			System.out.println("both arrays are not same");
		}
		
		}
		else
		{
			System.out.println("both arrays length is not same");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayEquality ae=new ArrayEquality();
		ae.add();
		
	}

}

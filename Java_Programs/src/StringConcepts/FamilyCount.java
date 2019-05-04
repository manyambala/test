package StringConcepts;

import java.util.Scanner;

public class FamilyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String m1="";
		int pos=1;
		int neg=0;

	for(int i=0;i<=4;i++)
	{	
		Scanner sc=new Scanner(System.in);
		//System.out.println("please enter name");
		String s=sc.nextLine();

		if(s!=null && s!="")
		{
			//m1=m1.concat(s+" ");
			m1=s+" "+m1;
		//	System.out.println(m1+" after concating the string");
			String[] m10=m1.split(" ");
			int len=m10.length;
			//System.out.println(m10[len-2]);
		if(m10[0].equals(m10[len-2]))
		{
			System.out.println("they are both same families "+m1);
			pos=pos+1;
			System.out.println("in family 1 member "+i+" "+s);
		}
		else
		{
			System.out.println("both are different family names");
			neg=neg-1;
			System.out.println("in family 2 member "+i+" "+s);
		}
		}
		else
		{
			//throw an exception if name is empty
		}
	
	} 
	System.out.println(pos+" "+neg);
	int count=pos+neg;
	System.out.println("total number families are "+count);
	}
}

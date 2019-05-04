package logics;

import java.util.Arrays;

public class Anagram {
	
	public void add()
	{
		String s1="mother in law";
		String s2="hitler woman";
		
		String sh1=s1.replaceAll("\\s", "");
		String sh2=s2.replaceAll("\\s", "");
		System.out.println(sh1);
		
		char[] ch1=sh1.toLowerCase().toCharArray();
		char[] ch2=sh2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		System.out.println(ch1);
		
		Arrays.sort(ch2);
		System.out.println(ch2);
		
		boolean equal=true;
		equal=Arrays.equals(ch1, ch2);
		
		/*
		for(char c1:ch1)
		{
			for(char c2:ch2)
			{
				System.out.println(c1+"=="+c2);
				if(c1 == c2)
				{
					equal=true;
					System.out.println(equal);
				}
				equal=false;
				
			}
		}
		*/
		
		System.out.println(equal);
		if(equal == true)
		{
			System.out.println(s1+s2+"then both strings are anagram");
		}
		else
		{
			System.out.println("then these strings are not anagram");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anagram an=new Anagram();
		an.add();
	}

}

package logics;

import java.util.*;
public class DuplicatesWithList {
	
	public void add()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		
		System.out.println(al); 
		
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		for(Integer al2:al)
		{
			if(!al1.contains(al2))
			{
				al1.add(al2);
			}
		}
		
		System.out.println(al1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuplicatesWithList dl=new DuplicatesWithList();
		dl.add();
	}

}

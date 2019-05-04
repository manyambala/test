package collections;

import java.util.*;

public class List_Class {
	
	
	String emp="pp";
	
	public void list_method()
	{
		ArrayList<String> ls=new ArrayList<String>();
		

		ls.add("naresh");
		ls.add(0, "p");
		ls.add("evaro");
		ls.add("sachinoo");
		ls.add("Sehwagooo");
		ls.add("Ganugulyiiii");
		//System.out.println(ls);
		
		ls.contains("evaro");
		ls.containsAll(ls);
		ls.equals("evaro");
		ls.add("vamo");
		System.out.println(ls);
		
	}
	
	/*public static void main(String[] args)
	{
		List_Class lstc=new List_Class();
		lstc.list_method();
		ListIterator it=ls.ListIterator();
		while(it.hasNext())
		{
			String s=(String)it.next();
			System.out.println(s);
		}
		
	}*/

	

	public static void main(String[] args)
	{
	
		List_Class lc = new List_Class();
		lc.list_method();
	
		/*Employee ee=new Employee();
		ee.emp1(90,"bala naresh","Manyam");
		ee.emp1(12, "nam", "name1");
		ee.emp2(33);
		
		ArrayList<Employee> emm=new ArrayList<Employee>();
		
		emm.add(ee);
		
		
		ListIterator iter=emm.listIterator();
		while(iter.hasNext())
		{
			String s=(String)iter.next();
			System.out.println(s);
		}
		System.out.println();*/
	
	}
	
}

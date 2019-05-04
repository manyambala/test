package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {

	public void methodArray()
	{

	ArrayList<String> al=new ArrayList<String>();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Naresh");
		al.add("Sachin");
		al.add("Naresh");
		
		System.out.println(al);
		
		System.out.println(al.lastIndexOf(al));
		
		
		
		al.set(1, "Ganguly");
		al.addAll(0, al);
		
		System.out.println(al);
		
		al.add(0, "Emo");
		
		System.out.println(al);
		
		al.remove(0);
		
		System.out.println(al);
		
		//al.clear();
		
		System.out.println(al);
		
		al.get(1);
		System.out.println(al);
		
		al.clone();
		System.out.println(al);
		
		al.add("vareva");
		al.add("Naresh");
		
		System.out.println(al);
		
		al.get(0);
		System.out.println(al);
		
		al.size();
		System.out.println(al);
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			//it.remove();
			//System.out.println(it);
			
			System.out.println(it.next());
		}
		
		
	}

}

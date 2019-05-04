package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Float> lhs=new LinkedHashSet<Float>();
		
		lhs.add(1f);
		lhs.add(67f);
		lhs.add(1f);
		System.out.println(lhs);
		lhs.add(0f);
		System.out.println(lhs);
		lhs.add(0f);
		lhs.add(0f);
		lhs.add((float) 67);
		System.out.println(lhs);
		
		Iterator it=lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Sachin");
		hs.add("Ganguly");
		hs.add("VVSLaxman");
		hs.add("sehwag");
		
		System.out.println(hs);
		
		hs.add("Sehwag");
		hs.add("sehwag");
		hs.add("    ");
		System.out.println(hs);
		
		HashSet<Integer> ht=new HashSet<Integer>();
		ht.add(1);
		ht.add(2);
		ht.add(3);
		ht.add(5);
		ht.add(0);
		ht.add(5);
		System.out.println(ht);
		ht.add(0);
		System.out.println(ht);
		
		Iterator it=ht.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}

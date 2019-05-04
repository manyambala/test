package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap lhm=new LinkedHashMap();
		
		lhm.put(3, "Emo Vamo");
		lhm.put(2, 7);
		
		System.out.println(lhm);
		
		boolean b=lhm.containsKey(3);
		System.out.println(b);
	
		System.out.println(lhm.size());
		
		System.out.println("EntrySet"+lhm.entrySet());
		
		String name=new String("emo");
		String name1=new String("emo");
		
		lhm.put(name,10);
		lhm.put(name1,12);
		
		System.out.println(lhm);
		
		System.out.println("entryset "+lhm.entrySet());
		
		Iterator it=lhm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry e=(Entry) it.next();
			System.out.println("Key "+e.getKey()+"Value "+e.getValue());
			
		}

		
	}

}

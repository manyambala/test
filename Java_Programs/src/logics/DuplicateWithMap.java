package logics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWithMap {
	
	public void dupChars(String n)
	{
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		char[] ch=n.toCharArray();
		for(char c:ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			
			else
			{
				hm.put(c, 1);
				
			}
		}
		
		/*Set<Character> sc=hm.keySet();
		System.out.println(sc);
		
		for(Character cc : sc)
		{
			if(hm.get(cc)>1)
			{
				System.out.println("character is "+cc+" number of times "+hm.get(cc));
				
			}
		}*/

		Set s1=hm.entrySet();
		System.out.println(s1);
		
		Iterator it=s1.iterator();
		while(it.hasNext())
		{
			Map.Entry it1=(Entry) it.next();
			System.out.println(it1.getKey()+" "+it1.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuplicateWithMap dwm=new DuplicateWithMap();
		dwm.dupChars("narayana");
	}

}

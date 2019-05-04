package collections;

import java.util.*;
import java.util.Map.Entry;
public class Array_List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="bala naresh";
		
		char[] ch=s.toCharArray();
		
		Set<Character> st=new HashSet<>();
		
		for(char cr:ch)
		{
			st.add(cr);
		}
		
		System.out.println(st);
		
	
		
		ArrayList<Character> al=new ArrayList<>();
		for(char c:ch)
		{
		if(!al.contains(c))
		{
			al.add(c);
		}
		}
		
		System.out.println(al);
		
		HashMap<Character,Integer> hm=new HashMap();
		int k=0;
		
		for(char chhh:ch)
		{
			hm.put(chhh, k++);
		}
		System.out.println(hm);
		Set sw=hm.entrySet();
		Iterator i=sw.iterator();
		while(i.hasNext())
		{
			Entry e=(Entry)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}

package collections;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm=new HashMap();
		hm.put(0, 9);
		hm.put(0, 8);
		hm.put(1, 7);
		hm.put(7, 67);
		
		System.out.println(hm);
		
		
		System.out.println(hm.get(2));
		
		hm.putAll(hm);
		System.out.println(hm);
		
		hm.entrySet();
		System.out.println(hm.entrySet());
	}

}

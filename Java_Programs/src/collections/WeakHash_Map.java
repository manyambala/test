package collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WeakHashMap wh=new WeakHashMap();
		HashMap hm=new HashMap();
		
		WeakHash_Map w=new WeakHash_Map();
		
		wh.put(w, "mmo");
		
		System.out.println(wh);
		
		hm.put(w, "mama");
		
		w=null;
		System.gc();
		
		
		System.out.println(wh);
		System.out.println(hm);
		
	}

}

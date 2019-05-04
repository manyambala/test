package collections;

import java.util.IdentityHashMap;

public class IdentityHash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IdentityHashMap it=new IdentityHashMap();
		
		String name=new String("emo");
		String name1=new String("emo");
		
		Object obj=new Object();
		obj.equals("emo");
		
		
		System.out.println(name==name1);
		
		System.out.println(name.equals(name1));
		
		
		it.put(name,10);
		it.put(name1,56);
		
		System.out.println(it);
		
	}

}

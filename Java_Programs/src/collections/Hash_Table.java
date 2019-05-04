package collections;

import java.util.Hashtable;

public class Hash_Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Hashtable ht=new Hashtable();
		ht.put(0, 8);
		ht.putIfAbsent(0, 8);
		ht.put(5, 5);
		ht.put(0, 5);
		//ht.entrySet();
		System.out.println(ht);
		System.out.println(ht.entrySet());
		
		ht.wait(3000);
		
		//System.out.println(" "+ht);
	}

}

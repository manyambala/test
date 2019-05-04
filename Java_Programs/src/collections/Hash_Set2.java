package collections;

import java.util.*;

public class Hash_Set2 {

	public void add()
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("naresh");
		System.out.println(hs.hashCode());
		hs.add("bala");
		System.out.println(hs.hashCode());
		hs.add("manyam");
		System.out.println(hs.hashCode());
		hs.add("naresh");
		System.out.println(hs.hashCode());
		 System.out.println(hs);
		 
		 System.out.println(hs.add("naresh"));
		 
		 hs.add("bala");
		 System.out.println(hs);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hash_Set2 hh=new Hash_Set2();
		hh.add();
	}

}

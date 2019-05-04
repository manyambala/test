package collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vc=new Vector<String>();
		
		vc.add("NTR");
		vc.addAll(vc);
		vc.add("Mahesh");
		
		System.out.println(vc.elementAt(0));
		
		
		System.out.println(vc.indexOf(1));
		
		System.out.println(vc);
		int i=vc.indexOf(0);
		System.out.println(i);
		
		Enumeration<String> en = Collections.enumeration(vc);
		System.out.println(en.asIterator());
		System.out.println(en.nextElement());
		/*while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
			
		}*/
		
	}

}

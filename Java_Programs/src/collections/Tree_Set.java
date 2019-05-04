package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Tree_Set implements Comparator {
	
		public int compare(Object obj1,Object obj2)
		{
			
		
			String s1=obj1.toString();
			String s2=obj2.toString();
			
			return -s1.compareTo(s2);
			
			/*Integer i1=(Integer)obj1;
			Integer i2=(Integer)obj2;
				
			
			if(i1>i2)
			{
				return -1;
			}
			else if(i1<i2)
			{
				return +1;
			}
			else return 0;*/
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t=new TreeSet(new Tree_Set());
		
		t.add("aanono");
		t.add("jiji");
		t.add("bgtyu");
		t.add(10);
		t.add(10);
		
		System.out.println(t);
		
		
			
	}

}

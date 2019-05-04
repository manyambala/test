package collections;

import java.util.*;
public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("mama");
		ll.addFirst("emo");
		
		System.out.println(ll);
		
		ll.get(0);
		System.out.println(ll);
		
		ll.addLast("vamo");
		System.out.println(ll);
		
		String s=ll.getLast();
		System.out.println(s);
		
		System.out.println(ll.getFirst());
		
		ListIterator li=ll.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		

	}

}

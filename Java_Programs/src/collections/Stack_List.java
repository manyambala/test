package collections;

import java.util.ListIterator;
import java.util.Stack;

public class Stack_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> st=new Stack<String>();
		
		st.push("AAMM");
		System.out.println(st);
		st.push("CMS");
		System.out.println(st);
		st.push("Fastrak");
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.spliterator());
		
		ListIterator it=st.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

package Java8;

import java.util.*;
public class Lambda2 {

	public void add()
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(125);
		al.add(5);
		al.add(5);
		
		al.forEach(i -> System.out.println(i));
		
		List<String> ll=new ArrayList<>();
		
		ll.add("cbn");
		ll.add("babu");
		ll.add("vamo");
		
		ll.forEach(s -> System.out.println(s));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lambda2 lm=new Lambda2();
		lm.add();
	}

}

package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=new ArrayList<>();
		l.add(121);
		System.out.println(l.hashCode());
		l.add(131);
		l.add(141);
		l.add(121);
		System.out.println(l);
		//l.forEach(k->System.out.println(k));
		
		Set<Integer> s=new HashSet<>();
		s.add(121);
		System.out.println(s.hashCode());
		s.add(131);
		s.add(141);
		s.add(121);
		System.out.println(s);
	//	s.forEach(k->System.out.println(k));
		
		Map<Integer,String> m=new HashMap<>();
		m.put(111, "sachin");
		m.put(121, "sehwag");
		System.out.println(m.hashCode());
		m.put(131, "nagarjuna");
		m.put(111, "naresh");
		System.out.println(m);
		
	}

}

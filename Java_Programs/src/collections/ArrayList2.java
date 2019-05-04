package collections;

import java.util.*;

public class ArrayList2  {

	public void add()
	{
		List<String> ls=new ArrayList<>();
		
		ls.add("naresh");
		ls.add("manyam");
		ls.add("bala");
		ls.add("evaru");
		System.out.println(ls.add("bala"));
		
		System.out.println(ls);
		
		Enumeration en=Collections.enumeration(ls);
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		/*Employee e=new Employee();
		e.emp1(1,"sachin","mumbai");
		e.emp1(2, "sehwag", "delhi");
		e.emp1(3, "kohli", "bengaluru");
		
*/
		
		List<Employee> ll=new ArrayList<>();
		
		Enumeration ee=Collections.enumeration(ll);
		
		while(ee.hasMoreElements())
		{
			System.out.println(ee.nextElement());
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList2 al2=new ArrayList2();
		//al2.add();
		
		Employee e=new Employee(41,"sachin","mumbai");
		Employee e1=new Employee(241,"sachin","mumbai");
		Employee e2=new Employee(1,"sachin","mumbai");

		
		List<Employee> ll=new ArrayList();
		ll.add(e);
		ll.add(e1);
		ll.add(e2);
		
			Comparator<Employee> c=new Comparator<Employee>() {
				
				public int compare(Employee emp1, Employee emp2) {
					
					if(emp1.i > emp2.i)
					{
						return 1;
					}
					else
						return -1;
				}
			};
			
			Collections.sort(ll, c);
			
			for(Employee ee:ll)
			{
				System.out.println(ee);
			}
	}


	

}

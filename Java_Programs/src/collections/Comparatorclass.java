package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Comparatorclass {	 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> ls=new ArrayList<Student>();


		Student s=new Student("naresh",5,"subhodaya");
		Student s1=new Student("manyam",2,"niveditha");
		Student s2=new Student("bala",3,"narayana");
		
		 ls.add(s);
		 ls.add(s1);
		 ls.add(s2);
		 
		 Comparator<Student> com=new Comparator<Student>() {

			public int compare(Student st1, Student st2) {
				// TODO Auto-generated method stub
				
				if(st1.sid > st2.sid)
					return 1;
				else
					return -1;
			}
			 
		};

		Collections.sort(ls,com);
		
		for(Student sss:ls)
		{
			System.out.println(sss);
		}

	}

}

package inheritance;

public class Child_Class extends Parent_Class
	{

	//super.sub();
	
	public Child_Class()
	{
		System.out.println("Child class constructor");
		super.sub();
		
	}
	
	public void add(int a)
	{
		System.out.println("Public in child class "+a);
		super.mul();
		//super.a=444;
		System.out.println(super.a);
		 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Child_Class cs=new Child_Class();
		
				//cs.add1();
				cs.add(90);
				//cs.sub();
				//cs.mul();
		

	}

}

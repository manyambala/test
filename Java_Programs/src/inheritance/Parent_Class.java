package inheritance;

public class Parent_Class {
	
	
	int a=787;
	public Parent_Class()
	{
		//this(8888);
		div();
		System.out.println("Constructor from parent class");
		int c=89;
		
		
	}
	
	static
	{
		System.out.println("Static Block ");
	}
	
	public Parent_Class(int x)
	{
		this();
		System.out.println("Constructor with parameters "+x);
	}
	
	static
	{
		int a=10;
		int b=29;
		System.out.println("2nd Static block"+(a+b));
	}
	public void add1()
	{
		int a=1;
		System.out.println("Public in parent "+this.a);
		
	}
	
	protected void sub()
	{
		this.add1();
		System.out.println("Protected in Parent ");
	}
	
	void mul()
	{
		System.out.println("Default in Parent");
	}
	
	private void div()
	{
		
		//a=10;
		System.out.println("Private in Parent "+a);
	}
	
	public static void main(String[] args)
	{
		/* Parent_Class ps=new Parent_Class(22);
		
		ps.a=11;
		ps.add1();
		ps.add1();
		ps.sub();
		ps.div();
		ps.mul(); */
		
	}

}

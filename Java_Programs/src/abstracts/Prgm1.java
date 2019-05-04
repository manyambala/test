package abstracts;

public abstract class Prgm1 {
	
	public abstract void add();
	
	static
	{
		System.out.println("Static block from abstract class");
	}
	public Prgm1()
	{
		System.out.println("Constructor from abstract class");
	}
	
	protected abstract void sub();
	 public int j;
	 private int g;
	 
	 public static void main(String[] args)
	 {
		 
		
	 }
	

}

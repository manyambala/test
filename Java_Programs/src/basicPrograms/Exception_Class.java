package basicPrograms;

public class Exception_Class extends Exception {
	
	int a=10;
	
	public Exception_Class()
	{
		System.out.println("Parent Class Constructor");
	}
	public void add()
	{
		int b=0;
		//int c=a/b;
		try
		{
			
		int d=a%b;
		
		
		//System.out.println("/ "+c);
		System.out.println("% "+d);
		}
		catch(ArithmeticException ec)
		{
			//ec.printStackTrace();
			//ec.getClass();
			ec.getStackTrace();
		}
		
		finally
		{
			System.out.println("Finally statement");
		}
	}

	public static void main(String[] args)
	{
		Exception_Class es=new Exception_Class();
		es.add();
	}
}

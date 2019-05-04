package Java8;

interface A
{
	void show();
}

class X implements A
{
	public void show()
	{
		System.out.println("show method in interface A");
	}
}
public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A a;
		/*a=new X();
		a.show();*/
		
	//	a = () -> System.out.println("mamamam");
		
		A x=()->System.out.println("vv");
		
		
		
		
		x.show();

	}

}

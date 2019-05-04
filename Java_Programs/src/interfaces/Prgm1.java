package interfaces;

public interface Prgm1 {
	
	public int i=0;
	public final int j=10;
	public static int g=9;
	public static final int u=88;
	
	public void add();
	public abstract void sub();
	public void mul();
	public  void div();
	
	public static void main(String[] args)
	{
		System.out.println(g);
	}
	

}

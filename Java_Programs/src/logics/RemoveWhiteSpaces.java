package logics;

public class RemoveWhiteSpaces {
	
	public void add()
	{
		String name="Bala Naresh Manyam";
		
		String[] st=name.split(" ");
		
		for(String s:st)
		{
		System.out.print(s);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveWhiteSpaces rw=new RemoveWhiteSpaces();
		rw.add();

	}

}

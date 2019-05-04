package StringConcepts;

public class StringIntoOtherString {

	public void add()
	{
		String s="Manyam Naresh";
		String s1="Bala ";
		int len=s.length();
		
		String n="";
		int a=0;
		
		char[] ch=s.toCharArray();
		
		for(int i=0;i<len;i++)
		{
			n=n+s.charAt(i);
			
			if(i==6)
			{
				n=n+s1;
			}
		}
		System.out.println(n);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringIntoOtherString si=new StringIntoOtherString();
		si.add();
		
	}

}

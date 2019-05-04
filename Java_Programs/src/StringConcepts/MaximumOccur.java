package StringConcepts;

public class MaximumOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="connection";
		
		char[] ch=s.toCharArray();
		char c1='a';
		int len=ch.length;
		int count=0;
		for(char c:ch)
		{
			for(int a=len-1;a>=0;a--)
			{
			if(c==ch[a])
			{
				count++;
				
			}
			}
			int i=count;
			int j=3;
			if(count>=2)
			{
				if(i>=j)
				{
					System.out.println(c+" i value is "+i+" j value is "+j);
				}
			}
			else
			{
				System.out.println(c+" it is unique value");
			}
			
			j=count;
			count=0;
			//System.out.println(j);
		}
	}

}

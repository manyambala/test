package logics;

public class DuplicateChars {
	
	public void removeDuplicateChar(String name)
	{
		char[] ch=name.toCharArray();
		int s=ch.length;
		System.out.println(s);
		//System.out.println(ch[0]);
		int count=0;
		for(int j=0;j<ch.length;j++)
		{
			for(int i=0;i<ch.length;i++)
			{
				if(ch[j] == ch[i])
				{
					count++;
					/*if(count == 2)
						
						System.out.println("count  = "+count);
					{
						System.out.println(ch[i]+" it is dup");
					}
				}
				else
				{
					//System.out.println(ch[i]+" unique");
				}*/
				}
			}
			
			if(count >= 2)
			{	
				System.out.println("count  = "+count);
			
				System.out.println(ch[j]+" it is dup");
			}
			else
			{
				System.out.print(ch[j]);
				//System.out.println();
				char c = 0;
				c=(char)(c+ch[j]);
				//System.out.print(c+"******");
				//System.out.println();
				
			}
			count =0;
			//System.out.println();
			
		}
		
		/*for(char chr:ch)
		{
			System.out.println(chr);
		}*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuplicateChars dup=new DuplicateChars();
		dup.removeDuplicateChar("narayana");
	}

}

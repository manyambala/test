package basicPrograms;

public class Prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int i=3;
		int j, l;
		
		if((i%2)==0  && (i%i)==0)
		{
			System.out.println(i+" is a Prime number");
		}
		
		else
		{
			System.out.println(i+" it is not a prime number");
		} */
		
		int i;
		int j=0;
		
		int k=0;
		for(i=1;i<100;i++)
		{
			
			if((i%2)==0  && (i%i)==0)
			{
				
				//System.out.println(i+" is a Prime number");	
				
				k=j+1;	
			//	System.out.println(k);
				j=k;
				//System.out.println(j);
			}
			
			//j=k;
			//System.out.println(j);
		}
		
		System.out.println(k);

	}

}

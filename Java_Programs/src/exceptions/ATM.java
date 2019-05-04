package exceptions;

public class ATM extends BankAccount{

	public ATM()
	{
		//super.details(100, 20);
	}
	
	public void details(int a, int b) throws BankAccount
	{
		this.creditAmount=a;
		this.withdrawAmount=b;
		
		if(a<b)
		{
			throw new BankAccount();
			//System.out.println("Your creditAmount is less than the withdrawnAmount ");
		}
		else
		{
			System.out.println("You have suffiecient balance to withdraw");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM a=new ATM();
		try
		{
		a.details(1, 2);
		}
		catch(Exception ec)
		{
			//String s=ec.getMessage();
			//System.out.println(s);
			ec.printStackTrace();
			//System.out.println(ec.getStackTrace());
			
		}
	}

}

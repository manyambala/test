package exceptions;

public class BankAccount extends Exception {

	int creditAmount;
	int withdrawAmount;
	
	public BankAccount() //throws BankAccount
	{
		//System.out.println("You don't have sufficient balance ");
		super("AAMMOO");
	}
	
}

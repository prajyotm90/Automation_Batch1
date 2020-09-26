package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {
		int a;
		RBI bank =null;
		
		BankUser bank1=new BankUser();
		bank1.bankFeatures(bank);

	}
	
	public void sum(int a) {
		
	}
	
	public void bankFeatures(RBI bank) {
		bank.creditCard();
		bank.debitCard();
		bank.currentAccount();
		bank.savingAccount();
	}

}


	//SUBCLASS of BankAccount

public class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
			// We added constructor that REQUIRES rate be set at the creation time of SavingsAccount object
	public SavingsAccount(double initialAmount, double rate) {
		super(initialAmount);// calling the "super constructor" (the constructor of Super Class BankAccount
		interestRate = rate;
	}
	
	public void setInterestRate(double rate) {
		interestRate = rate;
	}
	
	public void addInterest() {
		double interest  = getBalance() * interestRate;
		balance = balance + interest;
	}

}

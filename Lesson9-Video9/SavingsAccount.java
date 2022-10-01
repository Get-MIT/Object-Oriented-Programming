
	//SUBCLASS of BankAccount

public class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
			// We added constructor that REQUIRES rate be set at the creation time of SavingsAccount object
	public SavingsAccount(double initialAmount, double rate) {
		balance = initialAmount;
		interestRate = rate;
	}
	
	public void setInterestRate(double rate) {
		interestRate = rate;
	}
	
	public void addInterest() {
		double interest  = balance * interestRate;
		balance = balance + interest;
	}

}

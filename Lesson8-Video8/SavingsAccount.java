
	//SUBCLASS of BankAccount

public class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
	public void setInterestRate(double rate) {
		interestRate = rate;
	}
	
	public void addInterest() {
		double interest  = balance * interestRate;
		balance = balance + interest;
	}

}


	// SUPERCLASS

public class BankAccount {
	
		// this variable isn't "private" but "protected" so the subclasses of BankAccount can access the variable directly.
	protected double balance;
	
		// constructor of BankAccount
	public BankAccount() {
		balance = 0;
	}

		// makes a new deposit - adds amount to balance
	public void deposit (double amount) {
		balance += amount; // adding amount to balance
	}
	
		// returns balance
	public double getBalance() {
		return balance;
	}
	
}

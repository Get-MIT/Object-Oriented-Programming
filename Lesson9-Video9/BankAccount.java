
// SUPERCLASS

public class BankAccount {

		// this variable isn't "private" but "protected" so the subclasses of BankAccount can access the variable directly.
	protected double balance;

		// constructor of BankAccount
	public BankAccount() {
		balance = 0;
	}

		// constructor of BankAccount
	public BankAccount(double amount) {
		balance = amount;
	}

		// makes a new deposit - adds amount to balance
	public void deposit (double amount) {
		balance += amount; // adding amount to balance
	}

		// returns balance
	public double getBalance() {
		return balance;
	}
	
		// Overriding the inherited "toString()" method with ours
		// Επικάλυψη της μεθόδου toString()
	public String toString() {
		return ("Balance: " + balance);
	}

}

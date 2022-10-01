	
	//SUBCLASS of BankAccount

public class CheckingAccount extends BankAccount{
	
	private int transactionsCounter; 
	
	public CheckingAccount(double initialAmount) {
		super(initialAmount);
		transactionsCounter = 0;
	}
	
		// Επαναορισμός / Επικάλυψη μεθόδου - Overriding deposit method
	public void deposit(double amount) {
		transactionsCounter++;
		super.deposit(amount); // calling super deposit (the deposit() of superclass
		
		if (transactionsCounter > 3) {
			deductFees();
		}
	}
	
	public void deductFees() {
		balance -= 0.5;
	}
	
	public void printData() {
		System.out.println("Checking Bank Account");
		System.out.println("Balance: " + balance + " Free Limit: " + " 3 trans.");
	}

}

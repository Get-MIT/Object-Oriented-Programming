import java.util.ArrayList;

public class Bank {
	
	ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	
	
		// Adds an account to accounts ArrayList
	public void addAccount(BankAccount account) {
		accounts.add(account);
	}
	
	public void printAllData() {
			// Old Method:
		for (int i=0; i<accounts.size(); i++) {
			BankAccount account = accounts.get(i);
			account.printData(); // Πολυμορφική Κλήση - Polymorphic Call
		}
		
			// New Method (ArrayList supports a new way to iterate all Array objects
			// for BankAccount Objects, name them account, in accounts Array... Do printData() on account named object
		for (BankAccount account: accounts) {
			account.printData(); // Πολυμορφική Κλήση - Polymorphic Call
		}
	}
	

}

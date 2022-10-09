import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		BankAccount BA1 = new BankAccount("002", 1500, "Papadopoulos");
		BankAccount BA2 = new BankAccount("001", 2500, "Nikolaou");
		BankAccount BA3 = new BankAccount("003", 1000, "Petrou");
		
			// TreeSet() automatically shorts the objects (in this case alphabetically)
		Collection<BankAccount> treeSet1 = new TreeSet<BankAccount>();
		
		treeSet1.add(BA1);
		treeSet1.add(BA2);
		treeSet1.add(BA3);

		
		for(BankAccount account: treeSet1) {
			System.out.println(account.getCode() + ", "
								+ account.getBalance() + ", "
								+ account.getHolderName());
		}
		
		
	}
}


					// It has to be Comparable to be able to retrieved from the TreeSet() so
					// we have to implement Comparable interface that requires the method compareTo()
					// so the TreeSet can compare and perform shorting in BankAccount objects
class BankAccount implements Comparable {
	
	private String code;
	private double balance;
	private String holderName;
	
	public BankAccount(String code, double balance, String holderName) {
		this.code = code;
		this.balance = balance;
		this.holderName = holderName;
	}
	

	public String getCode() {
		return code;
	}

	public double getBalance() {
		return balance;
	}

	public String getHolderName() {
		return holderName;
	}


		@Override // We implement the method needed by the interface
		/* compareTo must compare the BankAccounts and return ("-1" if this BankAccount must go before the "other" BankAccount,
		 * "0" if it is equal to the "other" BankAccount and "1" if this BankAccount should go after the "other" BankAccount
		 */
	public int compareTo(Object other) {
		BankAccount otherAccount = (BankAccount)other; // Casting "other" from Object to BankAccount 
			// We decide to compare them by the balance of them
		if (balance < otherAccount.balance) { // if balance of this account is less than the other's, then this account will be shorted before the other account
			return -1;
		}
		else if ( balance > otherAccount.balance) { // if balance of this account is more than the other's, then this account will be shorted after the other account
			return 1;
		}
		else {	// else they are equal - Hint: For performance reasons try to avoid comparing the equality of loooong numbers like double
			return 0; // because they may be equal on first digits and the program has to spend resources to compare the last digits... 
		}
	}
	
	
	
}
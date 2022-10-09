import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		BankAccount BA1 = new BankAccount("002", 1500, "Papadopoulos");
		BankAccount BA2 = new BankAccount("001", 2500, "Nikolaou");
		BankAccount BA3 = new BankAccount("003", 1000, "Petrou");
		
	
		AccountCodeComparator codeComparator = new AccountCodeComparator();
																	// Passing our comparator in the collection as parameter
		Collection<BankAccount> treeSet1 = new TreeSet<BankAccount>(new AccountNameComparator());

		/* We could also do it like this:
		 * AccountCodeComparator codeComparator = new AccountCodeComparator();
		 * Collection<BankAccount> treeSet1 = new TreeSet<BankAccount>(codeComparator);
		 */
		
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


					
class BankAccount {
	
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
	
}

	// Compares accounts by account code
class AccountCodeComparator implements Comparator<BankAccount>{
	public int compare(BankAccount account1, BankAccount account2) {
		String code1 = account1.getCode();
		String code2 = account2.getCode();
		return code1.compareTo(code2);	// Delegation - String class has a method for comparing alphanumerics so we let String do the work
		// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)
	}
}

	// Compares accounts by account holder name
class AccountNameComparator implements Comparator<BankAccount>{
	public int compare(BankAccount account1, BankAccount account2) {
		String name1 = account1.getHolderName();
		String name2 = account2.getHolderName();
		return name1.compareTo(name2);	
	}
}


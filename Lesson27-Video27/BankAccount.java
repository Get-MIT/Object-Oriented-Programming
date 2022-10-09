
/* Java recommends that when you are adding your own types of elements in a HashSet you MUST Override the methods
 * hashCode() and equals(). Both Methods are inherited from Object Class.
 * 
 *	 hashCode() calculates the fragmentation method (returns the storage place of each object should be stored)
 *	 equals() compares if two items are the same or not by checking if the address of two objects in memory are the same.
 */

public class BankAccount {
	
	private String code;
	private double balance;
	
	public BankAccount(String aCode, double aBalance) {
		code=aCode;
		balance=aBalance;
	}

	public double getBalance() {
		return balance;
	}
	
	public String getCode() {
		return code;
	}

	@Override
	public int hashCode() {		// Delegation again.
		return code.hashCode(); // We wont write a difficult hash method, we will delegate again this job
								// to the hashCode method included in String. so we call hashCode() on String code of
								// BankAccount objects - So each code will produce a single hashcode of each account code.
	}
	
	@Override	// We want two accounts to be "equal" when the account code is the same
	public boolean equals(Object other) {
		BankAccount otherAccount = (BankAccount)other; // Casting - Converting Object "other" to a "BankAccount" Object
		
				// Delegation with String inherited equals which checks if the objects are the same sequence of characters in it...
		return (otherAccount.getCode().equals(this.getCode())); 
	}

}

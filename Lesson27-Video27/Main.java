import java.util.HashSet;


/* Java Strongly Recommends that when you are adding your own types of elements in a HashSet you MUST Override the methods
 * hashCode() and equals(). Both Methods are inherited from Object Class.
 * 
 *	 hashCode() calculates the fragmentation method (returns the storage place of each object should be stored)
 *	 equals() compares if two items are the same or not by checking if the address of two objects in memory are the same.
 */


public class Main {

	public static void main(String[] args) {
		
			// We know that these two accounts are the same account.
			// But Java thinks they are different because they are different memory objects.
		BankAccount BA1 = new BankAccount("001", 1500);
		BankAccount BA2 = new BankAccount("001", 1500);
		
		HashSet<BankAccount> set = new HashSet<BankAccount>();
		
		set.add(BA1);
		set.add(BA2);
		
		for (BankAccount account: set) {
			System.out.println(account.getCode() + ", "
								+ account.getBalance());
		}
		
		
		
	}

}



public class Main {

	public static void main(String[] args) {
							
												// added interest rate and balance at the construction of SavingsAccount object
		SavingsAccount SA1 = new SavingsAccount(0, 0.02);
		
		SA1.deposit(1500); // we also added 1500 on the construction above...
			
		System.out.println("SA1 Balance: " + SA1.getBalance());
		
		SA1.setInterestRate(0.02); // Not needed - we did this with constructor
		
		SA1.addInterest();
		
		System.out.println("SA1 Balance: " + SA1.getBalance());
		
		CheckingAccount CA1 = new CheckingAccount(1000);
		
		CA1.deposit(500);
		CA1.deposit(500);
		CA1.deposit(500);
		CA1.deposit(500);
		
		System.out.println("CA1 Balance: " + CA1.getBalance());
		
		System.out.println(SA1.toString());
		
	}

}

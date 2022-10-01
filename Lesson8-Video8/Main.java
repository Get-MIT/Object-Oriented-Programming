
public class Main {

	public static void main(String[] args) {
							
												// added interest rate at the construction of SavingsAccount object
		SavingsAccount SA1 = new SavingsAccount(0.02);
		
		SA1.deposit(1500);
			
		System.out.println("SA1 Balance: " + SA1.getBalance());
		
		SA1.setInterestRate(0.02);
		
		SA1.addInterest();
		
		System.out.println("SA1 Balance: " + SA1.getBalance());
;
		
	}

}

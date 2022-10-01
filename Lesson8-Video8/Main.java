
public class Main {

	public static void main(String[] args) {
		
		SavingsAccount SA1 = new SavingsAccount();
		
		SA1.deposit(1500);
			
		System.out.println("SA1 Balance: " + SA1.getBalance());
		
		SA1.setInterestRate(0.02);
		
		SA1.addInterest();
		
		System.out.println("SA1 Balance: " + SA1.getBalance());
;
		
	}

}

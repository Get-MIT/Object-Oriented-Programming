
public class Main {

	public static void main(String[] args) {
							
		BankAccount BA;
		
		BA = new BankAccount(1000);
		
		BA.printData();
		
		BA = new SavingsAccount(1000, 0.02);
		
		BA.printData();
		
		
		
	}

}

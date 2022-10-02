
						// Change "extends" to "implements" to use "Measurable Interface", or keep "extends" to use
						// "Measurable" as an abstract class
public class BankAccount extends Measurable {
	
	private double balance;
	
	public BankAccount (double balance) {
		this.balance = balance;
	}
	
	
	public double getMeasure() {
	return balance;
	}

}

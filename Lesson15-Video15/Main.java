
public class Main {

	public static void main(String[] args) {
		
		DataSet ds = new DataSet();
		
		BankAccount BA1 = new BankAccount(1500);
		BankAccount BA2 = new BankAccount(2000);
		BankAccount BA3 = new BankAccount(1000);
		
		ds.add(BA1);
		ds.add(BA2);
		ds.add(BA3);
		
		System.out.println("Acerage: " + ds.calcAverage());
		System.out.println("Max. Balance: " + ds.getMax().getBalance());
		System.out.println("Mins. Balance: " + ds.getMin().getBalance());
		
	}

}

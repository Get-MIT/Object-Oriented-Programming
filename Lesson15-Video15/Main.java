
public class Main {

	public static void main(String[] args) {
		
		DataSet ds = new DataSet();
		
		BankAccount BA1 = new BankAccount(1000);
		BankAccount BA2 = new BankAccount(2000);
		BankAccount BA3 = new BankAccount(2500);
		
		Student S1 = new Student(9.07);
		Student S2 = new Student(5.87);
		Student S3 = new Student(7.01);
		
		ds.add(S1);
		ds.add(S2);
		ds.add(S3);
		
							// Here the "right" measure would be Grades because we now have
							// students in our program, but the point is that with abstract classes
							// and interfaces we can have anything that has a measure.
							// So below is something like: 
		System.out.println("Average: " + ds.calcAverage()); // Average Measure: 
		System.out.println("Max. Balance: " + ds.getMax().getMeasure()); // Max. Measure: 
		System.out.println("Mins. Balance: " + ds.getMin().getMeasure()); // Min. Measure: 
		
	}

}

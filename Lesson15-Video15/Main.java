
public class Main {

	public static void main(String[] args) {
		
		DataSet ds = new DataSet();
		
		Student S1 = new Student(9.07);
		Student S2 = new Student(5.87);
		Student S3 = new Student(7.01);
		
		ds.add(S1);
		ds.add(S2);
		ds.add(S3);
		
		System.out.println("Acerage: " + ds.calcAverage());
		System.out.println("Max. Balance: " + ds.getMax().getGPA());
		System.out.println("Mins. Balance: " + ds.getMin().getGPA());
		
	}

}

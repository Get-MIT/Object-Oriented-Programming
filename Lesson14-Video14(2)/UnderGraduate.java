
		// classes that are not abstract so they can create objects are called concrete classes
		// οι κλάσεις που μπορούν να δημιουργήσουν αντικείμενα και άρα δεν είναι αφηρημένες ονομάζοντε συγκεκριμένες

public class UnderGraduate extends Student {
	
	private double GPA;
	
	public UnderGraduate(String name, double gPA) {
		super(name);
		GPA = gPA;
	}
	
		// prints student info
	public void printInfo() {
		System.out.println("Undergraduate Student");
		System.out.println("Name: " + getName());
		System.out.println("GPA: " + GPA);
	}
	

}

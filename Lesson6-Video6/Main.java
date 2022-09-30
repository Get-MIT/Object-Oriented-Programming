
public class Main {

	public static void main(String[] args) {
		
		Student S1, S2;

		S1 = new Student("George Mavroudis", "1001");
		
		S2 = new Student("Stelios Mavroudis", "1002");
		
		Course C1 = new Course("Java");
		
		Course C2 = new Course("Python");
		
		Course C3 = new Course("Ruby");
		
		S1.addCourse(C1);
		
		S2.addCourse(C1);
		
		C1.printInformation();

	}

}


public class Main {

	public static void main(String[] args) {
				
		Student S1 = new Student("George Mavroudis" , "101");
		
		Course C1 = new Course("Java", 5);
		Course C2 = new Course("Math", 6);
		
		S1.addCourse(C1);
		S1.addCourse(C2);

		
		S1.printInfo();
		
	}

}

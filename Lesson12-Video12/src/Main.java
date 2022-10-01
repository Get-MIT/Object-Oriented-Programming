
public class Main {

	public static void main(String[] args) {
				
		Student S1 = new Student("George Mavroudis" , "101");
		
		Course C1 = new Course("Java", 5);
		Course C2 = new Course("Math", 6);
		
		S1.addCourse(C1);
		S1.addCourse(C2);

		S1.printInfo();
		
		GraduateStudent GS1 = new GraduateStudent("Stelios Mavroudis", "112", "Palaiologos Mavroudis");
		GS1.addCourse(C1);
		GS1.addCourse(C2);
		
		GS1.printInfo();
		
	}

}

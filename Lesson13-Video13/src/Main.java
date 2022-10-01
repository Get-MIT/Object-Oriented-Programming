import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Course C1 = new Course ("Java", 5);
		Course C2 = new Course ("Math", 5);
				
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Course> courses = new ArrayList<Course>();
		
		
		courses.add(C1);
		courses.add(C2);
		
		/*
		 * If method readData() of class InputData is not static we need to create an instance - object of
		 * the class (InputData) to be able to run / call readData().
		 * We made "readData()" static so we commented out the old way of calling readData(). 
		 * Below is the new code, to call the static readData()
		nputData input = new InputData();
		input.readData(students);
		*/
		
		InputData.readData(students, courses); // We can call directly readData method of InputData class because this method is static.
		
		for(Student student: students) {
			student.printInfo();
		}

	}

}

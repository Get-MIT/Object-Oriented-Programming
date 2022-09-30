
public class Student {
	
	private String name;
	private String id;
	private Course[] courses = new Course[5]; //Array of courses so we can add many (5) courses.
	private int counter = 0; // Counts Courses to be able to control how many courses can be added to a student
	
		// When counter reaches 4 (because first place in array is 0 and not one) we won't be able to add more courses.
	public void addCourse(Course aCourse) {
		if (counter < 5) {
			courses[counter] = aCourse;
			counter++;
		}
		else {
			System.out.println("No more courses");
		}
	}
	
	// Constructor with 2 String parameters
	public Student(String aName, String anID) {
		name = aName;
		id = anID;
	}
	
	// Constructor with 1 String parameter
	public Student(String aName) {
		name = aName;
		id = "9999";
	}
	
	// Prints student data on screen (console)
	public void printData() {
		System.out.println("Student Data:");
		System.out.println("Student Name: " + name);
		System.out.println("Student ID: " + id);
		System.out.println("Enrolled in: ");
		for (int i=0; i<counter; i++) { // change "counter" to "5" to see the "java.lang.NullPointerException" error...
			System.out.println(courses[i].getName());
		}
		
	}
	
	
	
	// Setter for ID - Method that Sets the id Variable
	public void setID(String anID) {
		id = anID;
	}
	
	// Setter for name - Method that sets the name Variable
	public void setName(String aName) {
		name = aName;
	}
	
	// Getter for ID - Method that gets / returns the ID Variable
	public String getID() {
		return id;
	}

	// Getter for name - Method that gets / returns the name Variable
	public String getName() {
		return name;
	}
	
	
}

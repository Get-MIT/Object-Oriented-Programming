import java.util.ArrayList;
public class Student {
	
	private String name;
	private String id;
	private ArrayList<Course> courses = new ArrayList<Course>(); //ArrayList of courses so we can add many courses.
	
		// When counter reaches 4 (because first place in array is 0 and not one) we won't be able to add more courses.
	public void addCourse(Course aCourse) {
		courses.add(aCourse);
		aCourse.addStudent(this); // Notify course that this student has enrolled in it.
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
		
					// This is the old-school way to iterate between the array but ArrayList() has a new way
					// So i commented out this way...
					// We don't need counter anymore, ArrayList knows how many objects are stored in it.
	/*	for (int i=0; i<courses.size(); i++) {
			Course c = (Course) courses.get(i);
			System.out.println(c.getName());
		}
		*/
			// The new way to do what we commented out
		for (Course c: courses) {
			System.out.println(c.getName());
			
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

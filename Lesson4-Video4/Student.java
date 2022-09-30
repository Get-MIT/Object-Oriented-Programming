
public class Student {
	
	private String name;
	private String id;
	
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
	public void printInfo() {
		System.out.println("Student Name: " + name);
		System.out.println("Student ID: " + id);
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

import java.util.ArrayList;

public class Student {
	
	private String id;
	private String name;
	private ArrayList<Course> courses = new ArrayList<Course>();
	
		// Constructor of Student (requires String "name" and String "id"
	public Student(String aName, String anID) {
		id = anID;
		name = aName;
	}	
	
		// Adds a "Course" type object in the ArrayList() "courses"
	public void addCourse(Course aCourse) {
		courses.add(aCourse);
	}
	
		// Prints Student name, id, and courses enrolled in
	public void printInfo() {
		System.out.println("Student Name: " + name);
		System.out.println("Student ID: " + id);
		
		System.out.print("Enrolled in: ");
		for(Course course: courses) {
			System.out.print(course.getName() + " Credits " + course.getCredits() + ", ");
		}
		System.out.println(""); // BUG FIX - Next Student name was printed in the same line with previous student courses
	}
	

		// Auto Generated getters and setters (methods to access id and name
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Course> getCourses(){
		return courses;
	}


}

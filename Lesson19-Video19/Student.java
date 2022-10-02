
public class Student {
	
	private String name;
	
	private Course course;
	
	public Student (String name) {
		this.name = name;
	}


	public Course getMyCourse() {
		return course;
	}


	public void setCourse(Course aCourse) {
		this.course = aCourse;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Course: " + course.getName());
		System.out.println("--------------");
	}
	
	

}

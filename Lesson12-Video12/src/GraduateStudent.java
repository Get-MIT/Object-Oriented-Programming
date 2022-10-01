
public class GraduateStudent extends Student {

	private String supervisor;

	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	// Constructor of GraduateStudent calls "super constructor" and gives it hte variables aName and anID. Then sets supervisor.
	public GraduateStudent(String aName, String anID, String aSupervisor) {
		super(aName, anID);
		supervisor = aSupervisor;	

	}

	// Prints Graduate Student name, id, and courses enrolled in
	public void printInfo() {
		System.out.println("Student Name: " + this.getName());
		System.out.println("Student ID: " + this.getId());
		System.out.print("Enrolled in: ");
		for(Course course: this.getCourses()) {
			System.out.print(course.getName() + " Credits " + course.getCredits() + ", ");
		}
		System.out.println(""); // BUG FIX - Supervisor's name was printed in the same line with student courses, so i added one println()
		System.out.println("Supervisor " + this.getSupervisor());
	}

}

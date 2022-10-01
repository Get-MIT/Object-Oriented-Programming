
public class Course {
	
	private String name;
	private int credits;
	
		// Constructor of Course (requires String "name" and integer "credits"
	public Course(String aName, int someCredits) {
		name = aName;
		credits = someCredits;
		
	}

	
		// Auto Generated getters and setters (methods to access id and name
	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}



}

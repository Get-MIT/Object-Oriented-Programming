import java.io.Serializable;

public class Employee implements Serializable{
	

	private String name;
	private Company employer;
	
	public Employee(String text) {
		name = text;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCompany(Company c) {
		employer = c;
	}
	
	public String getInfo() {
		return name + " , " + employer.getTitle();
	}
	
}

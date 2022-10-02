

						// Change "extends" to "implements" to use "Measurable Interface", or keep "extends" to use
						// "Measurable" as an abstract class
public class Student extends Measurable{
	
	private double GPA;
	
			// Student doesn't have balance but has GPA
	public Student (double gPA) {
		this.GPA = gPA;
	}
	
	
	
	public double getMeasure() {
	return GPA;
	}

}

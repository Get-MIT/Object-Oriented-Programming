
/*
 *  Interface is like an abstract class but it can't have properties (eg. private int counter; String name; etc..)
 *  and it can ONLY have ABSTRACT methods (Without body)
 * 
 */

				// Change "abstract class" to "interface" to make "Measurable" an Interface, or keep
				// "abstract class" to keep "Measurable" as an abstract class.
public abstract class Measurable {
	
	
			// Abstract methods DON'T have body...
	public abstract double getMeasure() ;
	

}

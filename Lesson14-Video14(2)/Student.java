
		// abstract class cant create objects but can be inherited
		// Οι αφηρημένες κλάσεις δεν μπορούν να δημιουργήσουν αντικείμενα, μπορούν όμως να κληρονομηθούν.
public abstract class Student {
	
	private String name;
	
	
	public Student(String name) {
		this.name = name;

	}
	
	public String getName() {
		return name;
	}
	
		// This is an abstract method (without body) we just need it to be able to utilize
		// the printInfo methods we added in the subclasses.
	public abstract void printInfo();
	

}
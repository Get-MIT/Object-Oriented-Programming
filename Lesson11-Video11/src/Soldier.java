
public class Soldier {
	
	private String id;
			
			// Static means that the counter is the same on every instance of the class
			// So it won't be set to 1 for every soldier, but it will stay in class, and it will increased
			// every time "counter++" is called by the objects.
	private static int counter = 0;
	
	public Soldier(String anID) {
		id = anID;
		counter++;
	}
	
			// We can call "static" methods of a class even if we don't have an instance of this class (0 Soldiers)
	public static int getCounter() {
		return counter;
	}

}

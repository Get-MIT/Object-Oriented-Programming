import java.util.*;

public class Main {

	public static void main(String[] args) {
		
			// Linked list is slower on retrieving data (than ArrayList()) but are faster when adding elements (except the last object)
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("John");
		list.add("Nick");
		list.add("Mary");
		list.add("Helen");
		
			// we create an iterator object
		Iterator<String> iter = list.iterator();
		
			
		while(iter.hasNext()) {
				// iterator starts BEFORE the first element (like -1)
				// so we call next() immediately.
			String name = iter.next(); // iter.next() moves iterator to the next object and returns next object
			System.out.println(iter.hasNext()); // iterator also has a method to check if next object exists
			System.out.println(name);
				// in this way we can remove items easier
			if (name.equals("Mary")) {
				iter.remove();
		}
		
			//2nd way | What we already did with ArrayList()
		for (String name2: list) {
			System.out.println(name2);
		//	if (name.equals("Mary")) {
		//			name.remove();  // This doesn't work 
			}
			
		}
	
		for (String name2: list) {
			System.out.println(name2);
		}
		
	}
}

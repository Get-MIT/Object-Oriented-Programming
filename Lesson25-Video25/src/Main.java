import java.util.*;

public class Main {

	public static void main(String[] args) {
		
			// Doesn't extracts items in order
			// Also HashSet can't have same object second time - could be used to ensure that all items are singular
		Collection<String> list = new ArrayList<>();
		
		list.add("John");
		list.add("Nick");
		list.add("Mary");
		list.add("John");
		
		System.out.println("---ArrayList----");
		for (String name: list) {
			System.out.println(name);
		}
		
			//Adding the ArrayList list to the HashSet set
		Collection<String> set = new HashSet<>(list);  
		
		
			// Doesn't allow same object twice
		System.out.println("---TreeSet----");
		for (String name: set) {
			System.out.println(name);
		}
		
		
	}
}

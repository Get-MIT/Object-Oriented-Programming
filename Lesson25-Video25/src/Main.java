import java.util.*;

public class Main {

	public static void main(String[] args) {
		
				// Doesn't extracts items in order
				// Also HashSet can't have same object second time - could be used to ensure that all items are singular
			HashSet<String> set = new HashSet<String>();
		
		set.add("John");
		set.add("Nick");
		set.add("Mary");
		set.add("John");
		
		for (String name: set) {
			System.out.println(name);
		}

		
		
	}
}

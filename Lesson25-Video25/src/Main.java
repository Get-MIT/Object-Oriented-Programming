import java.util.*;

public class Main {

	public static void main(String[] args) {
		

		Collection<String> set1 = new HashSet<String>();
		
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		
		Collection<String> set2 = new HashSet<String>();
		
		set2.add("D");
		set2.add("E");
		set2.add("F");
		
			// returns true if set2 is a subset of set1
		if (set1.contains(set2)) {
			System.out.println("set2 is a subset of set1");
		}
		else {
			System.out.println("set2 is NOT a subset of set1");
		}
		
		
			// returns the union of set1 and set2
		set1.addAll(set2); // addAll() Adds everything from set2 in set1
		System.out.println("---Union----");
		for(String s: set1) {
			System.out.println(s);
		}
		
		
			// returns the intersection of set1 and set2
		set1.retainAll(set2); // retainAll() Discards everything from set1 except what is common with set2
		System.out.println("---Intersection----");
		for(String s: set1) {
			System.out.println(s);
		}
		
		
		// Transforms set1 into the difference of set1 and set2
		set1.add("X");
		System.out.println(set1);
		System.out.println(set2);
		set1.removeAll(set2); // removeAll() Discards everything from set1 that is common with set2
		System.out.println("---Difference----");
		for(String s: set1) {
			System.out.println(s);
		}
		
		
		
	}
}

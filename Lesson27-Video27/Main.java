import java.util.*;


/* Java Strongly Recommends that when you are adding your own types of elements in a HashSet you MUST Override the methods
 * hashCode() and equals(). Both Methods are inherited from Object Class.
 * 
 *	 hashCode() calculates the fragmentation method (returns the storage place of each object should be stored)
 *	 equals() compares if two items are the same or not by checking if the address of two objects in memory are the same.
 */


public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Helen");
		names.add("Bob");
		names.add("Nick");
		names.add("Mike");
		names.add("Mary");
				
		System.out.println("---Sorted---");
			// Sorts the specified list into ascending order, according to the natural ordering of its elements. 
		Collections.sort(names); // All elements in the list must implement the Comparable interface.
		System.out.println(names); // All collections override method "toString()" so i can call pass them in "println()" directly
		
		System.out.println("---Shuffle---");
		Collections.shuffle(names); 
		System.out.println(names);
		System.out.println("---Shuffle-Again--");
		Collections.shuffle(names); 
		System.out.println(names);
		
		System.out.println("---Reverse---");
		Collections.reverse(names); 
		System.out.println(names);
		
		System.out.println("---Swap---");
		Collections.swap(names, 2, 3); // Swaps 3rd with 4th (because counting starts with 0)
		System.out.println(names);
		
		names.add("Helen");
		names.add("Hellen");
		
		System.out.println("---Frequency---");	
		int frequency = Collections.frequency(names, "Helen");
		System.out.println(names);
		System.out.println("Frequency of Helen is: " + frequency);
		
		System.out.println("---Max & Min---");
		String max = Collections.max(names); // Returns the maximum (the last from a "short()" shorted state.
		String min = Collections.min(names); // Returns the minimum (the first from a "short()" shorted state.
		System.out.println("Max: " + max + " Min: " + min);
	}

}


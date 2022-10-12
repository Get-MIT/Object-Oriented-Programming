import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> johnsBooks = new ArrayList<String>();
		johnsBooks.add("The chacher in the Rye");
		johnsBooks.add("Steven Hawking");

		ArrayList<String> marysBooks = new ArrayList<String>();
		marysBooks.add("Nefelim");
		marysBooks.add("Giati mas psekazoun?");
		
			// This HashMap can take a String KEY (name) and an ArrayList of Strings (books)
		HashMap<String, ArrayList<String>> library = new HashMap<String, ArrayList<String>>();
		
		library.put("John", johnsBooks);
		library.put("Mary", marysBooks);
							
							// for all "name" in library:
		for (String name: library.keySet()) {
			System.out.println(name + " has borrowed: ");
							// for all KEYS "name"
			for (String bookTitle: library.get(name)) {
				System.out.println(bookTitle);
			}
		}	// it may first print Mary because HashMap is a SET not a LIST, and items are NOT SORTED
		
		
	}
}

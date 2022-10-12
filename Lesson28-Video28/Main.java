import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
			// HashMap has KEYS and VALUES, each KEY can exist only one time in it, but 2 KEYS can have reference to the same VALUE
		HashMap<String, String> phonebook = new HashMap<String, String>();
		phonebook.put("Mary", 	"2310-345778");	// it has "put()" method to add items
		phonebook.put("John", 	"2310-552737");
		phonebook.put("Helen", 	"2310-345778");
		phonebook.put("Nick", 	"2310-277145");
		
												// "Mary" is the key, it will search and return the VALUE of that KEY
		System.out.println("Mary's phone is: " + phonebook.get("Mary"));
		
									// keySet() returns the SET (NOT LIST) of all KEYS
		for (String name: phonebook.keySet()) {
			System.out.println(name +  " : " + phonebook.get("Mary"));
		}
	}

}

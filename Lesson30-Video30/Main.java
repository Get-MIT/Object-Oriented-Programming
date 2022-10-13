import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("Mary");
		names.add("George");
		names.add("John");
		names.add("Jim");
		
		File namesFile = new File("C:\\Users\\User1\\Downloads\\lesson30File.txt");
		
		try {
			FileWriter writer = new FileWriter(namesFile);
			for (String name: names) {
				writer.write(name);
				writer.write(System.lineSeparator()); // Asks system's line separator character
			}
			writer.close();
			System.out.println("File has been written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

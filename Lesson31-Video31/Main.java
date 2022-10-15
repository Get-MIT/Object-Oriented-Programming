import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
			
	public static void main(String[] args) {
		
		Employee e = null;
		
		File file = new File("C:\\Users\\user1\\Downloads\\emploee.ser");
		
		try {
				// FileInputStream is low level and reads byte by byte, so i will wrap it with an ObjectInputStream
			FileInputStream fInputStream = new FileInputStream(file);
			
			ObjectInputStream inputStream = new ObjectInputStream(fInputStream);
					
								// We can call readObject() many times and it will return the next object every time, but it's not a good practice to
								// store many objects separately in a file, it's better to store them as an arraylist and save and read the whole arraylist.
			e = (Employee) inputStream.readObject(); // We have to cast the returned object to Employee - because readObject returns a generic object.
			
			inputStream.close(); // closing ObjectInputStream
			fInputStream.close(); // closing FileInputStream
			
		} catch (ClassNotFoundException classNotFoundException) { // May the object returned is something unknown (doesn't exist in any of our classes)
			classNotFoundException.printStackTrace();
		}
		
		catch (FileNotFoundException fileNotFoundException) { // i changed the name of exception object
			
			fileNotFoundException.printStackTrace();
		} catch (IOException ioException) { // i changed the name of exception object

			ioException.printStackTrace();
		}
		System.out.println("Deserialization performed");
		System.out.println("Employee: " + e.getName());
		
	}
}

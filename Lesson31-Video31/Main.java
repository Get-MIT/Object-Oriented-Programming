import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
			
	public static void main(String[] args) {
		
		Employee e = new Employee("John");
		
		File file = new File("C:\\Users\\user1\\Downloads\\emploee.ser");
		
		try {
				// FileOutputStream is low level and writes byte to byte, so we will wrap it inside an ObjectOutputStream
			FileOutputStream fileOutStream = new FileOutputStream(file);
			
			ObjectOutputStream outStream = new ObjectOutputStream(fileOutStream);
			
					// we call writeObject() and passing the employee object "e" to it.
			outStream.writeObject(e); // It won't work until we make employee AND ALL IT'S PROPERIES Serializable (until it implements Serializable)
			
			outStream.close(); // Closing ObjectOutputStream
			fileOutStream.close(); // Closing FileOutputStream
			System.out.println("Employee has been written");
		} catch (FileNotFoundException fileNotFoundException) { // i changed the name of exception object
			
			fileNotFoundException.printStackTrace();
		} catch (IOException ioException) { // i changed the name of exception object

			ioException.printStackTrace();
		}
		
		
		
		
		
	}
}

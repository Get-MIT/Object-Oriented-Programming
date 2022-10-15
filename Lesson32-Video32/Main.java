/*
 *  This project shows serialization and deserialization - It writes an ArrayList() to a
 *  binary file and then reads it back.
 * 
 *  In order to be able to Serialize (store objects to a binary file), all the objects (
 *  ArrayList, Employee, and every property of Employee must implement Serializable interface
 *  in order to be able to store them.
 */

public class Main {
			
	public static void main(String[] args) {
		
		new SerializationDemo();
		
	}
}

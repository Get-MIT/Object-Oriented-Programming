import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDemo {
	
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public SerializationDemo() {
		
		Company C1 = new Company("CocaCola");
		Company C2 = new Company("IBM");
		
		Employee E1 = new Employee("John");
		Employee E2 = new Employee("Bob");
		Employee E3 = new Employee("Nick");

		E1.setCompany(C1);
		E2.setCompany(C2);
		E3.setCompany(C1);
		
		employees.add(E1);
		employees.add(E2);
		employees.add(E3);
		
		
		serializing();
		
		ArrayList<Employee> employeesFromFile = deserializing();
		
		for (Employee e: employeesFromFile) {
			System.out.println("Name: " + e.getInfo());
		}
	}

	public void serializing() {
		try {
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\user1\\Downloads\\employees.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(employees);
		out.close();
		fileOut.close();
		}
		catch (IOException ioExc) {
			ioExc.printStackTrace();
		}
		finally {
			System.out.println("Serialization Attempted...");
		}
	}
		
		public ArrayList<Employee> deserializing() {
			try {
				FileInputStream fileIn = new FileInputStream("C:\\Users\\user1\\Downloads\\employees.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				ArrayList<Employee> employees = (ArrayList<Employee>)in.readObject(); // Casting Object to ArrayList
				in.close();
				fileIn.close();
			}
			catch(InvalidClassException invClassExc) {
				invClassExc.printStackTrace();
			}
			catch(IOException ioExc) {
				ioExc.printStackTrace();
			}
			catch(ClassNotFoundException missingClassExc) {
				missingClassExc.printStackTrace();
			}
			finally {
				System.out.println("De-Serialization Attempted...");
				return employees;
			}		
	}
	
}

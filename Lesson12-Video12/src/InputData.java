import java.util.ArrayList;

import javax.swing.JOptionPane;

public class InputData {
	
	
		// reads student data from user input and adds it to the ArrayList "students" of Main Method in Main Class
	public void readData(ArrayList<Student> students) {
		
		boolean more = true;
		
		while (more) {
			String selection = JOptionPane.showInputDialog("1: Student, 2: Graduate Student");
			int choice = Integer.parseInt(selection); // Converting String "selection" to integer to use it in the if below
			
			String aName = JOptionPane.showInputDialog("Enter your name: ");
			String anID = JOptionPane.showInputDialog("Enter your ID: ");
			
			String aSupervisor = null;
			
			if (choice == 2) {
				aSupervisor = JOptionPane.showInputDialog("Supervisor name: ");
			}
			
			
			Student student;
			if (choice == 1) { // if student is common student
				student = new Student(aName, anID);
			}
			else { // if student is Graduate Student
				student = new GraduateStudent(aName, anID, aSupervisor);
			}
			students.add(student);
			
			String answer = JOptionPane.showInputDialog("More Students (Y/N): ");
			if (answer.equals("N") || (answer.equals("n"))) {	// Checking if answer to "more students?" is "N" or "n" . ( "||"  Means OR)
				more = false;
			}
		}
		

		
	}

}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
	
public class MyFrame extends JFrame{
	
	private JTextField studentNameField, courseNameField;
	private JButton button, button2;
	private JPanel panel;
	private ArrayList<Course> courses = new ArrayList<Course>(); 
	private ArrayList<Student> students = new ArrayList<Student>(); 
	
	
	public MyFrame() {
		
		Course c1 = new Course("Math");
		Course c2 = new Course("Java");
		Course c3 = new Course("Databases");
		
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		panel = new JPanel();
		
		studentNameField = new JTextField("Student Name");
		courseNameField = new JTextField("Course Title");
		button = new JButton("Create Student");
		button2 = new JButton("Print Students");
		
		
		panel.add(studentNameField);
		panel.add(button);
		panel.add(courseNameField);
		panel.add(button2);
		this.setContentPane(panel);
		
		
			// -STEP 3- Δημιουργία Αντικειμένου Ακροατή
		ButtonListener listener = new ButtonListener();
		
			// -STEP 4- Σύνδεση Ακροατή με Πηγή Συμβάντων
		button.addActionListener(listener);
		button2.addActionListener(listener);
		
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Ecent Handling Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	// -STEP 1- Δημιουργία Κλάσσης Ακροατή
public class ButtonListener implements ActionListener{ // ActionListener is an INTERFACE

						// ActionListener has an abstract method "actionPerformed()" which must be implemented
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button) {
		
			// -STEP 2- Συγγραφή Κώδικα για τη δημιουργία φοιτητών
		String studentName = studentNameField.getText();		
		
		Student newStudent = new Student(studentName);
		
		String courseName = courseNameField.getText();
		
		Course selectedCourse = null;
		for (Course course: courses) {
			if (course.getName().equals(courseName)) // BE CAREFUL this "IF" doesn't have Brackets - Είναι ξε-brackωτο.. :-)
				selectedCourse = course;			// Την πάτησα και έβαλα το student.add(newStudent) μέσα στην for loop..


		}
		
		newStudent.setCourse(selectedCourse);
		
		students.add(newStudent);
		
		}
		else {
			for (Student student: students) {
				student.printInfo();
			}
		}
		
	}
	
	
}

	
}

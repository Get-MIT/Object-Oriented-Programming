import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
	
public class MyFrame extends JFrame{
	
	private JTextField inputField, outputField;
	private JButton button, button2;
	private JPanel panel;
	
	
	public MyFrame() {
		
		panel = new JPanel();
		
		inputField = new JTextField("Enter Your Name");
		outputField = new JTextField(20);
		button = new JButton("Greeting");
		button2 = new JButton("Greeting2");
		
		
		panel.add(inputField);
		panel.add(button);
		panel.add(outputField);
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
		
			// -STEP 2- Συγγραφή Εκτελούμενου Κώδικα
		String name = inputField.getText();
		outputField.setText("Hello my fried " + name);
		}
		else {
			outputField.setText("What a funny name");
		}
		
	}
	
	
}

	
}

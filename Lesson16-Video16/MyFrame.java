import javax.swing.*;

public class MyFrame extends JFrame {
	
	
	// Αναφορά του υποδοχέα
	private JPanel panel;
	// Αναφορά του γραφικών συστατικών
	private JTextField textField;
	private JButton button;
	
	
	
	
	public MyFrame() {
		
		// -STEP 1- Δημιουργία  Υποδοχέα (JPanel)
		panel = new JPanel();
		
		
		// -STEP 2- Δημιουργία Γραφικών Συστατικών
		textField = new JTextField(10); // textField size will be 10
		button = new JButton("Press Me"); // button will have text "Press Me" on it
		
		
		// -STEP 3- Τοποθέτηση Γραφικών Συστατικών στον Υποδοχέα
		panel.add(textField); // Default Layout Manager is "Flow Layout"
		panel.add(button);
		
		
		// -STEP 4- Προσαρμογή Υποδοχέα στο Παράθυρο
		this.setContentPane(panel);
		
		
		
		this.setVisible(true);	// makes this frame visible
		this.setSize(400, 400);	// gives dimensions (400px x 400px) to the frame
		this.setTitle("My first impressive frame!");	// sets the title to "My first impressive frame!"
		
										// We need to declare "JFrame.")
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// makes the frame close when you click (X) icon on the window.
		
	
	}
	
	
	
	
	

	
	
	

	
	
}

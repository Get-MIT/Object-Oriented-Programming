import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class GUI extends JFrame{
	
	private JPanel panel = new JPanel();
	private JTextField nameField = new JTextField(10);
	private JButton addButton = new JButton("Add");
	private JButton shortButton = new JButton("Short");
	private JList<String> list = new JList<String>();
	private DefaultListModel<String> model = new DefaultListModel<String>();
	private JScrollPane scrollPane;
	
	public GUI() {
		
		this.setContentPane(panel);
		
		scrollPane = new JScrollPane(list);
		scrollPane.setSize(100, 400);
		
		panel.add(nameField);
		panel.add(addButton);
		panel.add(scrollPane);
		panel.add(shortButton);
		list.setModel(model);
		
		
			// We will create ActionListener class here, inside the addActionListener parameters - Here we create a "Nameless ActionListener Class"
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				model.addElement(name);
			}
		});// Here closes the parenthesis of addActionListener parameters
			
			
		shortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> names = Collections.list(model.elements()); // Calling Collections.list on all elements of model (.elements() enumerates all components of a list
				
				Collections.sort(names);	// ArrayList names now contains all the elements of model SHORTED
				model.clear();		// Clearing all items from the model (the data structure) of the list
				
				for (String name: names) {	// Adding all elements of names (sorted) to model 
					model.addElement(name);
				}
				
			//	model.addAll(names);	// i added them with addAll(), instead of using a for loop.
			}
		});

		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

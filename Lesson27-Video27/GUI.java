import javax.swing.*;
public class GUI extends JFrame{
	
	private JPanel panel = new JPanel();
	private JTextField nameField = new JTextField(10);
	private JButton addButton = new JButton("Add");
	private JButton shortButton = new JButton("Short");
	private JList<String> list = new JList<String>();
	
	public GUI() {
		
		this.setContentPane(panel);
		
		panel.add(nameField);
		panel.add(addButton);
		panel.add(list);
		panel.add(shortButton);
		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}

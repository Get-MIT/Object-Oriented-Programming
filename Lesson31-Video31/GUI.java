import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame{

	private JButton button = new JButton();
	private JPanel panel = new JPanel(); 
	private JFileChooser fileChooser;
	
	public GUI() {
			
		button = new JButton("Select File");
		panel = new JPanel();
		fileChooser = new JFileChooser();
		
		panel.add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					// fileChooser.showOpenDialog will return an integer that shows if the user selected a file or he closed the dialog etc..
				int returnVal = fileChooser.showOpenDialog(panel);// it is a good practice to add the parent panel as parameter to FileChoosers
				
					// If user has pressed the "Open" inside the dialog:
				if (returnVal == JFileChooser.OPEN_DIALOG) { // We don't need to remember which integer represents to that user pressed open and we equalize it to ".OPEN_DIALOG"
					File file = fileChooser.getSelectedFile(); // return the selected file
					try {	// FileReader reads char by char on low level and is slower, so we encapsulate it in BufferedReader
						FileReader fReader = new FileReader(file);
							// BufferedReader reads bigger chunks of data and accesses less times the file on disk, so it's safer to use it.
						BufferedReader reader = new BufferedReader(fReader);
							// Reading the first line
						String line = reader.readLine();
							// while line is not null...
						while (line != null) {
							System.out.println(line); // print the line
							line = reader.readLine(); // and read the next one
						}
						// It's a good practice to close the streams so the file doesn't stay open for long time, minimizing the chance another program
						reader.close(); // tries to read or write the same file at the same time and cause corruption. And we close first the last reader
						fReader.close(); // because the opposite would force-stop the fReader.
					}
					catch(FileNotFoundException exc) {
						exc.printStackTrace();
					}
					catch(IOException exc) {
						exc.printStackTrace();
					}
					
				}
			}
			
		});
		
		this.setContentPane(panel);
		
		this.setVisible(true);
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContainerFrame extends JFrame {
	
	private JTextField codeField;
	private JTextField destinationField;
	private JTextField weightField;
	private JTextField powerField;
	private JButton createBulkButton;
	private JButton createRefrigeratorButton;
	private JList shipList;
	private JPanel containerPanel;
	private JPanel centralPanel;
	
		// Created grid layout with 2 rows and 3 columns
	GridLayout grid = new GridLayout(3, 2);

	public ContainerFrame() {
		
		codeField = new JTextField("Code");
		destinationField = new JTextField("Code");
		weightField = new JTextField("Code");
		powerField = new JTextField("Code");
		createBulkButton = new JButton("Create Bulk");
		createRefrigeratorButton = new JButton("Create Refrigerator");
		shipList = new JList();
		containerPanel = new JPanel();
		centralPanel = new JPanel();
		
		
			// Added the grid layout on panel
		containerPanel.setLayout(grid);
		
			// Components in GridLayout get aligned from left to right as you add them on the panel
		containerPanel.add(codeField);
		containerPanel.add(destinationField);
		containerPanel.add(weightField);
		containerPanel.add(powerField);
		containerPanel.add(createBulkButton);
		containerPanel.add(createRefrigeratorButton);
		
			// BorderLayout aligns items to North, East, South, West, CENTER
		BorderLayout border = new BorderLayout();
		centralPanel.setLayout(border);
		
		centralPanel.add(shipList, BorderLayout.NORTH); // Setting the list to be aligned UP (North)
		centralPanel.add(containerPanel, BorderLayout.CENTER); // Setting the containerPanel to be aligned to Center
		
		this.setContentPane(centralPanel);	
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Container Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

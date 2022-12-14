import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
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
	private JList<String> shipList;
	private JPanel containerPanel;
	private JPanel centralPanel;
	private static DefaultListModel<String> model = new DefaultListModel<String>();
	
		// Created grid layout with 2 rows and 3 columns
	GridLayout grid = new GridLayout(3, 2);

	public ContainerFrame() {
		
		codeField = new JTextField("Code");
		destinationField = new JTextField("Destination");
		weightField = new JTextField("Weight");
		powerField = new JTextField("Power");
		createBulkButton = new JButton("Create Bulk");
		createRefrigeratorButton = new JButton("Create Refrigerator");
		shipList = new JList<String>();
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
				
		
			// Adding model items

		
			
			// connecting model with list
		shipList.setModel(model);
		
		this.setContentPane(centralPanel);	
		
		ButtonListener listener = new ButtonListener();
		createBulkButton.addActionListener(listener);
		createRefrigeratorButton.addActionListener(listener);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Container Frame");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
		// I could make an abstract class (that would extend JFrame)
		// to avoid rewriting this code an all 3 gui classes - but it's short code and just a copy paste
	public static void refreshShipList() {
		model.clear();
		for(Ship ship: DataHandler.getAllShips()) {
			model.addElement(ship.getName());
		}
	}
	
	class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String code = codeField.getText();
			String destination = destinationField.getText();
			String selectedShipName = shipList.getSelectedValue().toString();
			Ship selectedShip = null;
			for (Ship ship: DataHandler.getAllShips()) {
				if (ship.getName().equals(selectedShipName)) {
					selectedShip = ship;
				}
			}
			
			if (e.getSource().equals(createBulkButton)) {
				String weightText = weightField.getText();
				int weight = Integer.parseInt(weightText);
				Bulk newContainer = new Bulk(code, destination, weight);
				selectedShip.addContainer(newContainer);
			}
			else {
				String powerText = powerField.getText();
				double power = Double.parseDouble(powerText);
				Refrigerator newContainer = new Refrigerator(code, destination, power);
				selectedShip.addContainer(newContainer);
			}
			System.out.println("Selected Ship Charge: " + selectedShip.getTotalCharge());
		}
	}
	
}

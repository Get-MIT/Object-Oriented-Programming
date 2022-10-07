import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShipFrame extends JFrame {
	
	private JTextField shipNameTextField = new JTextField();
	private JTextField shipCapacityTextField = new JTextField();
	private JButton addShipButton = new JButton();
	private JButton deleteShipButton = new JButton();
	private JButton totalChargeButton = new JButton();
	private JList<String> shipsList = new JList<String>();
	private JPanel panel= new JPanel();
	private GridLayout gridLayout = new GridLayout(2, 1);
	private static DefaultListModel<String> listModel = new DefaultListModel<String>();
	
	public ShipFrame(){
		
		shipNameTextField.setText("Ship Name");
		shipCapacityTextField.setText("Ship Capacity");
		addShipButton.setText("Add Ship");
		deleteShipButton.setText("Delete Ship");
		totalChargeButton.setText("Get Total");
		
		DeleteShipButtonAction deleteButtonListener = new DeleteShipButtonAction();
		deleteShipButton.addActionListener(deleteButtonListener);
		
		GetChargesButtonAction totalChargeButtonListener = new GetChargesButtonAction();
		totalChargeButton.addActionListener(totalChargeButtonListener);
		
		AddShipButtonAction addButtonListener = new AddShipButtonAction();
		addShipButton.addActionListener(addButtonListener);
		
		
		
		shipsList.setModel(listModel);
		refreshShipList(); // This method adds ships to the list
			
		panel.setLayout(gridLayout);
		this.setContentPane(panel);
		
		
		panel.add(shipsList);
		panel.add(totalChargeButton);
		panel.add(deleteShipButton);
		panel.add(shipNameTextField);
		panel.add(shipCapacityTextField);
		panel.add(addShipButton);
		
		
		
		this.setVisible(true);
		this.setTitle("Ship Management Panel");
		this.setSize(500 , 200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		}
	
	public static void refreshShipList() {
		listModel.clear();
		for (Ship ship: DataHandler.getAllShips()) {
			listModel.addElement(ship.getName()); // Add all ships to the list
		}
	}
	
		// Action of Delete Ship button
class DeleteShipButtonAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String selectedShipName = shipsList.getSelectedValue().toString();
			DataHandler.deleteShip(selectedShipName);
			System.out.println("The ship: " + selectedShipName + " deleted");
			
			// Refresh ship list on all gui classes
		DataHandler.guiRefresh();
		}
	}
		// Action of get ship total Charge button
class GetChargesButtonAction implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String selectedShipName = shipsList.getSelectedValue().toString();
		Ship selectedShip = DataHandler.getSelectedShip(selectedShipName);
		System.out.println("Total Charge of ship: " + selectedShipName + " is: " + selectedShip.getTotalCharge());
	}
}
		// Action of Add Ship Button
class AddShipButtonAction implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String newShipName = shipNameTextField.getText();
		String newShipCapacity = shipCapacityTextField.getText();
		DataHandler.createShip(newShipName, Integer.parseInt(newShipCapacity));
		System.out.println("Added new ship with name: " + newShipName + " and capacity of: " + newShipCapacity + " containers");
			
			// Refresh ship list on all gui classes
		DataHandler.guiRefresh();
	}
}



}

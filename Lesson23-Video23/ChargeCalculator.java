import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;


public class ChargeCalculator extends JFrame{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -5410096227119520142L;
	private JButton calculateChargeButton;
	private JButton openContainerFrameButton;
	private JButton openShipFrameButton;
	private JPanel panel = new JPanel();
	private static JList<String> shipsList = new JList<String>();
	private static DefaultListModel<String> listModel = new DefaultListModel<String>();
	private BorderLayout borderLayout = new BorderLayout();
	
	public ChargeCalculator() {
		
		panel.setLayout(borderLayout);
				
		calculateChargeButton = new JButton("Calculate Charge");
		openContainerFrameButton = new JButton("Manage Containers");
		openShipFrameButton = new JButton("Manage Ships");	
		
		
		
		shipsList.setModel(listModel);
		refreshShipList();
		
		this.setContentPane(panel);	
		

		ButtonListener listener = new ButtonListener();
		calculateChargeButton.addActionListener(listener);
		openContainerFrameButton.addActionListener(listener);
		openShipFrameButton.addActionListener(listener);
		
		panel.add(shipsList);
		panel.add(calculateChargeButton, BorderLayout.SOUTH);
		panel.add(openContainerFrameButton, BorderLayout.WEST);
		panel.add(openShipFrameButton, BorderLayout.EAST);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Charge Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void refreshShipList() {
		listModel.clear();
		for (Ship ship: DataHandler.getAllShips()) {
			listModel.addElement(ship.getName()); // Add all ships to the list
		}	
	}
	
	
	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(calculateChargeButton)) {
				String selectedShipName = shipsList.getSelectedValue().toString();
				Ship selectedShip = DataHandler.getSelectedShip(selectedShipName);
				if (!selectedShip.equals(null)) {
				System.out.println("Total Charge of ship: " + selectedShipName + " is: " + selectedShip.getTotalCharge());
				}
				else {
					System.out.println("Ship with name: " + selectedShipName + " not found ");
				}
			}
			if (e.getSource().equals(openContainerFrameButton)) {
				ContainerFrame cf = new ContainerFrame();
				System.out.println("open container frame");
			}
			if (e.getSource().equals(openShipFrameButton)) {
				ShipFrame sf = new ShipFrame();
				System.out.println("open ship frame");
			}
		}
		
	}

	
}

import java.util.ArrayList;

public class DataHandler {

	private static ArrayList<Ship> ships = new ArrayList<Ship>();
	private static ArrayList<Container> containers = new ArrayList<Container>();
	
		// Refresh ship list on all gui classes
	public static void guiRefresh() {
		ChargeCalculator.refreshShipList();
		ContainerFrame.refreshShipList();
		ShipFrame.refreshShipList();
	}
	
		// create a ship
	public static boolean createShip(String name, int capacity) {
		Ship ship = new Ship(name, capacity);
		if (ships.add(ship)) {
			System.out.println("Created Ship: " + name + " with " + capacity + " containers capacity.");
			return true; // Return true if ship was created.
		}
		else {
			System.out.println("Error , could not create Ship: " + name + " with " + capacity + " containers capacity.");
			return false; // Else return false.
		}
	}
	
		// gets a ship name and returns the ship
	public static Ship getSelectedShip(String selectedShipName) {
		Ship selectedShip = null;
		for (Ship ship: ships) {
			if (ship.getName().equals(selectedShipName)) {
				selectedShip = ship;
			}
		}
		return  selectedShip;
	}
	
		// Delete a ship
	public static void deleteShip(String selectedShipName) {
		Ship selectedShip = null;
		for (Ship ship: ships) {
			if (ship.getName().equals(selectedShipName)) {
				selectedShip = ship;
				
			}
		}
		ships.remove(selectedShip);
	}
	
		// return a COPY of ships - this ArrayList ships can only be accessed through methods
	public static ArrayList<Ship> getAllShips() {
		ArrayList<Ship> shipsShadow = new ArrayList<Ship>();
		shipsShadow.addAll(ships);
		return shipsShadow;
	}
	
	
	
	
		// Create a bulk container
	public static boolean createBulk(String code, String destination, int weight) {
		Bulk bulk = new Bulk(code, destination, weight);
		if (containers.add(bulk)) {
			System.out.println("Created Bulk Container: " + code + " with destination " + destination + " and weight " + weight);
			return true; // Return true if bulk container was created.
		}
		else {
			System.out.println("Error , could not create Bulk Container: " + code + " with destination " + destination + " and weight " + weight);
			return false; // Else return false.
		}
	}
	
		// Create a refrigerator container
	public static boolean createRefrigerator(String code, String destination, double power) {
	Refrigerator refrigerator = new Refrigerator(code, destination, power);
	if (containers.add(refrigerator)) {
		System.out.println("Created Refrigerator Container: " + code + " with destination " + destination + " and wattage " + power);
		return true; // Return true if refrigerator container was created.
	}
	else {
		System.out.println("Error , could not create Refrigerator Container: " + code + " with destination " + destination + " and wattage " + power);
		return false; // Else return false.
	}
}

		// gets a code  and returns the container
	@SuppressWarnings("null")
	public static Container getSelectedContainer(String selectedContainerCode) {
		Container selectedContainer = null;
		for (Container container: containers) {
			if (container.getCode().equals(selectedContainerCode)) {
				selectedContainer = container;
			}
		}
		if (!selectedContainer.equals(null)){ // Check if ship with selectedShipName found
			return selectedContainer;
		}
		else {
			System.out.println("DataHandler couldn'd find a container with code: " + selectedContainerCode);
			return null;
		}
	}
	
		// Delete a container
	public static boolean deleteContainer(String selectedContainerCode) {
	Container selectedContainer = null;
	for (Container container: containers) {
		if (container.getCode().equals(selectedContainerCode)) {
			selectedContainer = container;
		}
	}
	if (containers.remove(selectedContainer)){ // Check if deletion was successful
		return true;
	}
	else {
		System.out.println("DataHandler couldn'd delete a container with code: " + selectedContainerCode);
		return false;	// else return false
		}
	}
	
	// return a COPY of containers - this ArrayList containers can only be accessed through methods
	public static ArrayList<Container> getAllContainers() {
		ArrayList<Container> containerShadow = new ArrayList<Container>();
		containerShadow.addAll(containers);
		return containerShadow;
	}


}

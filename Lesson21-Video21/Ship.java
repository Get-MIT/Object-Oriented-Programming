import java.util.ArrayList;

//ships: 			cont_capacity

public class Ship {
	
		// Container Capacity
	private int bulkCapacity;
	private int bulkLoad = 0;
	
		// Weight Load
	private double weightCapacity;
	private double weightLoad = 0;
	

		// Power Capacity
	private double powerCapacity = 0;
	private double powerLoad = 0;
	
	private String name;
	private static int shipCounter = 0; // count how many ships we have
	
		// ArrayList of loaded containers
	private ArrayList<Container> containers = new ArrayList<Container>();
	
		// Ship constructor
	public Ship ( String aName, int cont_capacity, double max_payload) {
		name = aName;
		bulkCapacity = cont_capacity;
		weightCapacity = max_payload;
		shipCounter++;
	}
	
	
		// Get capacity of the ship
	public int getCapacity() {
		return bulkCapacity;
	}	
		// Change ship's capacity
	public void setCapacity(int capacity) {
	this.bulkCapacity = capacity;
	}	
		// Get remaining container capacity
	public int getRemainingCapacity() {
		return (bulkCapacity - bulkLoad);
	}
	
	
		// Get capacity of the ship
	public double getPowerCapacity() {
		return powerCapacity;
	}
		// Change ship's capacity
	public void setPowerCapacity(double power) {
		this.powerCapacity = power;
	}
		// Get remaining power capacity
	public double getRemainingPowerCapacity() {
		return (powerCapacity-powerLoad);
	}


		// Add Bulk Container on ship
	public void addBulkContainer(Bulk container) {
			if (bulkLoad + 1 > bulkCapacity) { // if there is space for a container
				System.out.println("Ship: " + this.getName() + "| Message: " + "Cant load container with code: " + container.getCode() + " because of insufficient storage");	
				return;
			}
			if (container.getWeight() + weightLoad > weightCapacity) {
				System.out.println("Ship: " + this.getName() + "| Message: " + "Cant load container with code: " + container.getCode() + " because it exceeds weight limit");	
				return;
			}
			else {
				containers.add(container);
				bulkLoad++;
				weightLoad = weightLoad + container.getWeight();
				System.out.println("Ship: " + this.getName() + "| Message: " + container.getCode() + " loaded");
			}
	}
		// Add Refrigerator Container on ship
	public void addRefrigerator(Refrigerator container) {
			if (bulkLoad + 1 > bulkCapacity) { // if there is space for a container
				System.out.println("Ship: " + this.getName() + "| Message: " + "Cant load container with code: " + container.getCode() + " because of insufficient storage");
				return;
			}
			if (powerLoad + container.getWattage() > powerCapacity) { // if there is enough power
				System.out.println("Ship: " + this.getName() + "| Message: " + "Cant load container with code: " + container.getCode() + " because of insufficient power");
				return;
			}				
			else {
				containers.add(container);
				bulkLoad++;
				powerLoad = powerLoad + container.getWattage();
				System.out.println("Ship: " + this.getName() + "| Message: " + container.getCode() + " loaded");
			}
	}
	
	
		// Remove Container from ship
	public void removeContainer(Container container) {
		containers.remove(container);
	}

		// Rename ship
	public void rename(String aName) {
		name = aName;
	}
	
		// get ship's name
	public String getName() {
		return name;
	}
	
		// get ships number
	public int getCounter() {
		return shipCounter;
	}
	
		//remove ship from given ArrayList
	public void delete(ArrayList<Ship> array) {
		array.remove(this);
		shipCounter--;
	}
	
	public void printInfo() {
		System.out.println();
		System.out.println("Ship name: "+name +"| Storage Capacity: "+bulkCapacity+" Cont." +"| Power Capacity: " +powerCapacity+" KW" +"| Max Payload: " +weightCapacity+" T");
		System.out.println("Container Load: " +bulkLoad+" Cont." +"| Power Load: "+ powerLoad+" KW" +"| Payload Weight: " +weightLoad+" T");
		System.out.println("Available Capacity: " +getRemainingCapacity()+" Cont." +"| Available Power: " +getRemainingPowerCapacity()+" KW" +"| Weight to full: " +(weightCapacity-weightLoad)+" T");
		System.out.print("Loaded Containers: ");
		for (Container cont: containers) {
			System.out.print(cont.getCode() + ", ");
		}
	}
}

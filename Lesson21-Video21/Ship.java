import java.util.ArrayList;

public class Ship {
	

	private String name;
	private int capacity;
	
		// ArrayList of loaded containers
	private ArrayList<Container> containers = new ArrayList<Container>();
	
		// Ship constructor
	public Ship ( String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}
		
		// Add Container to the ship
	public void addContainer(Container aContainer) {
		if (containers.size() < capacity) { // if there is enough capacity
			containers.add(aContainer);
		}
		else {
			System.out.println("Sorry the ship is full...");
		}
	}
	
		// get total charge for loaded containers
	public double getTotalCharge() {
		double totalCharge = 0;
		for (Container container: containers) {
			totalCharge += container.getCharge();
		}
		return totalCharge;
	}
	
}

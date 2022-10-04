import java.util.ArrayList;

// bulk: 			weight


public class Bulk extends Container {

	private static int counter = 0; // count how many containers we have
	private static int bulkcounter = 0; // count how many bulk containers we have
	private double weight; 

	public Bulk(String anID, String aDestination, double someweight) {
		super(anID, aDestination);
		weight = someweight;
		bulkcounter++;
	}	
		
		// get the bulk container number
	public int getBulkCounter() {
		return bulkcounter;
	}

		// Get the Weight of Container
	public double getWeight() {
		return weight;
	}
	

		// Change the Weight of Container 
	public void setWeight(double newWeight) { 
		weight = newWeight;
	}
	
		// Delete this container from given ArrayList
	public void deleteContainer(ArrayList<Container> array) {
		super.deleteContainer(array);
		bulkcounter--;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.print("| Weight: " + weight);
	}


}

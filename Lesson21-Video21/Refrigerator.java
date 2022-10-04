import java.util.ArrayList;

//refrigerator:  	p_consumption (wattage)


public class Refrigerator extends Container {
	
	//private static int counter = 0; // count how many containers we have
	private static int refrigeratorcounter = 0; // count how many refrigerator containers we have
	
	private double wattage;	
	
		// Refrigerator Container Constructor
	public Refrigerator(String anID, String aDestination, double kwatts) {
		super(anID, aDestination);
		wattage = kwatts;
		refrigeratorcounter++;
	}
	
		// get the bulk container number
	public int getRefrigeratorCounter() {
		return refrigeratorcounter;
	}
	
		// get the power consumption of the refrigerator container
	public double getWattage() {
		return wattage;
	}
		// set the power consumption of the refrigerator container
	public void setWattage(int wattage) {
		this.wattage = wattage;
	}
	
		// Delete this container from given ArrayList
	public void deleteContainer(ArrayList<Container> array) {
		super.deleteContainer(array);
		refrigeratorcounter--;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.print("| Wattage: " + wattage + " KW");
	}


}

import java.util.ArrayList;

// Containers: 		id, destination

public abstract class Container {
	
	private static int counter = 0; // count how many containers we have
	private String code = null;
	private String destination = null;

		
			// Every Container must have Code
	public Container(String aCode, String aDestination) {
		code = aCode;
		destination = aDestination;
		counter++;
	}

	public int getCounter() {
		return counter;
	}
	
			// You can get Code - You can't Change Code
	public String getCode() {
		return code;
	}

			// Get the Destination of Container
	public String getDestination() {
		return destination;
	}

			// Change the Destination of Container 
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void deleteContainer(ArrayList<Container> array) {
		array.remove(this);
		counter--;
	}
	
	public void printInfo() {
		System.out.println();
		System.out.print("Container: " + code + "| Destination: " + destination);
	}


}

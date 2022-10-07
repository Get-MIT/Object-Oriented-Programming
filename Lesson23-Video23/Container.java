
public abstract class Container {

	private String code = null;
	private String destination = null;

		
			// Every Container must have Code
	public Container(String code, String destination) {
		this.code = code;
		this.destination = destination;
	}

	
		// adding abstract method to be able to use getCharge() on every container type
	public abstract double getCharge();
	
	public String getCode() {
		return this.code;
	}

}

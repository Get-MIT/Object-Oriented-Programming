
public class Refrigerator extends Container {
		
	private double power;	
	
		// Refrigerator Container Constructor
	public Refrigerator(String code, String destination, double power) {
		super(code, destination);
		this.power = power;
	}
	
	public double getCharge() {
		return (2000 * power);
	}

}

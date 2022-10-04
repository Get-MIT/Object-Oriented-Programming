
public class Main {

	public static void main(String[] args) {
		
		Ship ship1 = new Ship ("Hercules", 450);
		
		Bulk C1 = new Bulk("XYZ101", "Barcelona", 1500);
		Refrigerator C2 = new Refrigerator("YYZ350", "Genova", 2.7);
		Bulk C3 = new Bulk("XAA251", "Piraeus", 900);
		Refrigerator C4 = new Refrigerator("YYD157", "Thessaloniki", 5.6);
		
		ship1.addContainer(C1);
		ship1.addContainer(C2);
		ship1.addContainer(C3);
		ship1.addContainer(C4);
		
		System.out.println("Total Charge: " + ship1.getTotalCharge());
		
	}

}

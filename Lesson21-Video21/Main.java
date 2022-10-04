
public class Main {

	public static void main(String[] args) {
		
		Ship ship1 = new Ship("ship1", 50, 25);
		Ship ship2 = new Ship("ship2", 2, 10);
		
		Bulk cb1 = new Bulk("cb1", "Livadeia", 10);
		Bulk cb2 = new Bulk("cb2", "Trikala", 10);
		Bulk cb3 = new Bulk("cb3", "Larisa", 10);
		Bulk cb4 = new Bulk("cb4", "Larisa", 5);
		
		Refrigerator  cr1 = new Refrigerator("cr1", "Everest", 1.2);
		Refrigerator  cr2 = new Refrigerator("cr2", "Everest", 2.2);
		Refrigerator  cr3 = new Refrigerator("cr3", "Everest", 3.2);
		
		System.out.println("Bulk: " + cb4.getBulkCounter() + "| Refrigerators: " + cr3.getRefrigeratorCounter() + "| Total: " + cb4.getCounter());
		
		ship1.setPowerCapacity(5);
		
		ship1.addBulkContainer(cb1);
		ship1.addBulkContainer(cb2);
		ship1.addBulkContainer(cb3); // can't load it doe to weight limit
		ship1.addBulkContainer(cb4); // can't load it doe to weight limit
		
		ship1.addRefrigerator(cr1);
		ship1.addRefrigerator(cr2);
		ship1.addRefrigerator(cr3); // can't load it because it exceeds power limits
		
		
		ship2.addBulkContainer(cb3);	// We add the cb3 container to another ship
		ship2.addBulkContainer(cb4);	// We add the cb4 container to another ship
		ship2.addRefrigerator(cr3);		// Still we can't add this...
		

		ship2.setPowerCapacity(4); // Upgrading ship's power generator
		ship2.addRefrigerator(cr3);
		
		ship1.printInfo();
		ship2.printInfo();
		
		
		
	}

}

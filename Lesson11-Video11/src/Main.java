
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Number of Soliders: " + Soldier.getCounter());
		
		Soldier S1 = new Soldier("XY101");
		Soldier S2 = new Soldier("ZL202");
		
		System.out.println("Number of Soliders: " + Soldier.getCounter());
		System.out.println("Number of Soliders: " + S1.getCounter());
		
		System.out.println(Math.sqrt(5.4));
	}

}

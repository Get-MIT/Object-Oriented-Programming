
public class Main {

	public static void main(String[] args) {
		
			// Creating TimeStamp 23:15:40
		TimeStamp T1 = new TimeStamp(23, 15, 40);
		
			// Printing TimeStamp 23:15:40
		T1.printTime();
		
			// Adding one hour to TimeStamp
		T1.increaseHour(); // Now the TimeStamp is 0:15:40 - Acceptable hour
		
			// Adding one hour to TimeStamp
		T1.increaseHour(); // Now the TimeStamp is 1:15:40 - Acceptable hour
		
			// Prints time and it's correct (1:15:40)
		T1.printTime();
	}

}

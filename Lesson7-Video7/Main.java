
public class Main {

	public static void main(String[] args) {
		
			// Creating TimeStamp 23:15:40
		TimeStamp T1 = new TimeStamp(23, 15, 40);
		
			// Printing TimeStamp 23:15:40
		T1.printTime();
		
			// Adding one hour to TimeStamp
		T1.hour++; // Now the TimeStamp is 24:15:40 ! there is no such time in Earth
		
			// Adding one hour to TimeStamp
		T1.hour++; // Now the TimeStamp is 25:15:40 ! there is no such time in Earth
		
			// Prints time nut it's wrong (25:15:40)
		T1.printTime();
	}

}


public class TimeStamp {
	
		// Παραβίαση της αρχής τησ ενσωμάτωσης
	public int hour;
	public int minute;
	public int second;	
	
		// TimeStamp Constructor
	public TimeStamp(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	
		// Prints the TimeStamp Variables
	public void printTime() {
		System.out.println(hour + ":" + minute + ":" + second);
	}

}

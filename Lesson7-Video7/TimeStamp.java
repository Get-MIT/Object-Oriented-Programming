
public class TimeStamp {
	
		// Συμμόρφωση με την αρχής της ενσωμάτωσης
	private int hour;
	private  int minute;
	private  int second;	
	
		// TimeStamp Constructor
	public TimeStamp(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	
		// checks and corrects the hour if needed
	public void increaseHour() {
		hour++;
		if (hour == 24) {
			hour = 0;
		}
	}
	
		// Prints the TimeStamp Variables
	public void printTime() {
		System.out.println(hour + ":" + minute + ":" + second);
	}

}

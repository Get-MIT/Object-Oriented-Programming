
public class DataSet {

	private static int counter;
	private double sum;
	private Student max;
	private Student min;


	// it is nice to manually initialize variables so everyone who sees the code knows
	// the initial values of variables - even if Java automatically initializes them to zero and null
	public DataSet() {
		counter = 0;
		sum = 0;
		max  = null;
		min = null;
	}

				// adding a BankAccount
	public void add(Student item) {

		if (counter == 0 ) { // if this is the first BankAccount
			max = item;
			min = item;
		}
		else if (item.getGPA() > max.getGPA()) { // if this is the account with the higher balance until now
			max = item;
		}
		else if (item.getGPA() < min.getGPA()) { // if this is the account with the lower balance until now
			min = item;
		}
		counter++;	// increase counter by one (so we can know how many accounts we have
		sum += item.getGPA();  // add the account balance to the sum of all accounts
	}
	
			// calculate average balance in accounts
	public double calcAverage() {
		if (counter == 0) {
			return 0;
		}
		else {
			return (sum / counter);
		}
	}
		
	
			// Return the highest balance account
		public Student  getMax() {
			return max;
		}
		
			// Return the lowest balance account
		public Student getMin() {
			return min;
		}

}

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Product best = new Product();

		boolean more = true;
		while(more) {
			
			Product current = new Product();
			
			//Κλήση της μεθόδου read() επί του αντικειμένου current
			//αποστολή μυνήματος read() στο αντικείμενο current
			current.read();
			
			if (current.is_Better_Than(best)){
				best = current;
			}
			
			System.out.println( "More Products ? 1:Yes 2:No " ) ;
			int answer = in.nextInt () ;
			if (answer != 1 ) { 
				more = false ;		
				in.nextLine(); //Next line didn't solve the buffer issue that accepts "ENTER" key as next line so i used "in.close();".
				//in.close();
			}
			
		}
		
		best.printData();
		
		// Added this by myself to stop receiving the warning that scanner never closes.
		in.close();
	}

}

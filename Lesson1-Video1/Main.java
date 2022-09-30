import java.util.Scanner;

/*
 * Έκανα μια αλλαγή στον κώδικα που δείχνει ο καθηγητής γιαί είχα θέμα με το buffer εισόδου
 * όπως λέει και στο βίντεο. Πατώντας 1 και ENTER για να προσθέσω και άλλο προϊόν έπαιρνε
 * το ENTER (αλλαγή γραμμής ως απάντηση στο επόμενο όνομα προϊόντος, δεν λύθηκε το πρόβλημα
 * βάζοντας ένα ακόμα "in.nextLine()" όπως στο βίντεο. Αν'τ αυτού έβαλα το
 * "Scanner in = new Scanner(System.in);" μέσα στη while loop ώστε να τερματίζω με "in.close();"
 * το Scanner και να ξανα-ανοίγει στην αρχή του while loop.
 * 
 * The only change i did to the code is that i opened scanner inside the loop, so i can
 * be able to close it before the while loop ends, and reopen it at the beginning of the while loop.
 * Probably the professor didn't had this issue due to older java version by just adding an extra in.nextLine()
 * after the input to clear the input buffer.
 */


public class Main{

	public static void main(String[] args) {

		// Scanner in = new Scanner(System.in); commented out and added the scanner inside the while loop
		// because it was taking the "ENTER" key as next input even if the professor adds in.reset(); to avoid this issue.

		String bestName ="" ;
		double bestPrice = 1 ; 
		int bestScore = 0 ;

		boolean more = true ;
		while (more) {
				
			Scanner in = new Scanner(System.in);

			System.out.println("Product name: ") ;
			String name = in.nextLine( ) ;
			System.out.println("Price: ") ;
			double price = in.nextDouble( ) ;
			System.out.println("Score: ") ;
			int score = in.nextInt( ) ;

			if ((score / price) > (bestScore / bestPrice)) {
				bestName = name ;
				bestScore = score ;
				bestPrice = price ;
			}
			
			System.out.println( "More Products ? 1:Yes 2:No " ) ;
			int answer = in.nextInt () ;
			if (answer != 1 ) { 
				more = false ;		
				// in.nextLine(); Next line didn't solve the buffer issue that accepts "ENTER" key as next line so i used "in.close();".
				in.close();
			}
		}
		
		System.out.println("Best Name: " + bestName ) ;
		System.out.println("Best Price: " + bestPrice ) ;
		System.out.println("Best Score: " + bestScore ) ; 
	}
}
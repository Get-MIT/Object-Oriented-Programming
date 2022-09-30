import java.util.Scanner;

public class Product {
	Scanner in = new Scanner(System.in);
	
	private String name;
	private double price;
	private int score;
		
		// Initialize Variables and price to 1 to avoid division with zero.
	public Product() {
		name = "";
		price = 1;
		score = 0;
	}
	
	
		// Print product info variables
	public void printData() {
		System.out.println("Product Name: " + name);
		System.out.println("Product Price: " + price);
		System.out.println("Product Score: " + score);
	}
	
		// Read from user input and change Product variables.
	public void read() {
		

		System.out.println("Please enter the product name: ");
		name = in.nextLine();
		System.out.println("Please enter the product Price: ");
		price = in.nextDouble();
		System.out.println("Please enter the product Score: ");
		score = in.nextInt();
		in.nextLine();
	}
	
		// accepts another Product object and checks if this product is better than the other.
		// Returns true if this product is better than the other, else returns false.
	public boolean is_Better_Than(Product other) {
		if ((score / price) > (other.score / other.price)) {
			return true;
		}
		return false;
	}

}

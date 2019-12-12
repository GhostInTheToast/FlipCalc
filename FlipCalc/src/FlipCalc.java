import java.util.Scanner;

public class FlipCalc {

	public static void main(String[] args) {
		
		
		
		// scanner object
		Scanner input = new Scanner(System.in);
		
		int skee = 4;
		while(skee != 3) {
			System.out.println("Welcome to FlipCalc V1.0!\n\n1 = Flipping Calculator.\n2 = Past flips.\n3 = Quit.\n\nPlease enter the number corresponding to what you would like : ");

			skee = input.nextInt();
			switch(skee) {
			case 1 : 
				System.out.print("Please input the quantity of the item you are flipping and press enter : ");
				// get quantity
				int quantity = input.nextInt();
			
				// get low price
				System.out.print("\nPlease enter the buying (low) price : ");
				int low = input.nextInt();
			
				// get high price for selling
				System.out.print("\nPlease enter the selling (high) price : ");
				int high = input.nextInt();
			
				// calculate potential profit of the whole flip
				int potentialProfit = (high * quantity) - (low * quantity);
			
				// summary output
				System.out.print("\nThe potential profit here for this flip is " + potentialProfit + " gp.\nREMEMBER! Buy at " + low + " and sell at " + high + "!\n\n");
			
					break;
			case 2 : 
				break;
			case 3 : 
				System.exit(0);
			}
		}
		

		// add 5% margin estimate/goal per item
		// add in file save system and show recent flips
		
		input.close();
	}

}

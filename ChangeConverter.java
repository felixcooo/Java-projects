package Homeworks;


import java.util.Scanner;

public class ChangeConverter {

	public static void main(String[] args) {
		
		// INPUT
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of quarters: ");
		int quarters = input.nextInt();
		
		System.out.println("Enter the number of dimes: ");
		int dimes = input.nextInt();
		
		System.out.println("Enter the number of nickels: ");
		int nickels = input.nextInt();
		
		System.out.println("Enter the number of pennies: ");
		int pennies = input.nextInt();

		// PROCESS
		
		double totalIndollards = (quarters * 0.25) + (dimes * 0.10) + 
				(nickels * 0.05) + (pennies * 0.01);
		
		// OUTPUT
		
		System.out.printf("You entered:\n" + "%d quarters\n" + "%d dimes\n" 
		+ "%d nickels\n" + "%d pennies\n" + "The total in dollars is $%.2f\n", quarters,
		dimes,nickels,pennies,totalIndollards);		
		
		
		input.close();
		
	} //end main

} // end class

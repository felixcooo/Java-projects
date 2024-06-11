package Homeworks;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		// INPUT
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of Jamaican Dollars :");
		double jamaicanDollars = input.nextDouble();
		
		System.out.println("Enter number of Dominican Pesos :");
		double dominicanPesos = input.nextDouble();
		
		System.out.println("Enter number of Cuban Pesos :");
		double cubanPesos = input.nextDouble();
		
		// PROCESS
		
		double totalUSDollars = (jamaicanDollars / 154.60) + (dominicanPesos / 56.55) +
				(cubanPesos / 23.89);
		
		// OUTPUT
		
		System.out.printf("US Dollars = $%.2f\n", totalUSDollars);
		
		
		input.close();

	} // end class

} // end main


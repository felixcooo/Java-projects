package Homeworks;

/* This program converts seconds to hours and minutes.
 * 
 *@author: Felix Carrera 
 *@Date: 10/07/23
 *Version : 1.0
 * 
 */

import java.util.Scanner;

public class SecondsConverter {

	public static void main(String[] args) {

		// INPUT
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of seconds:");
		int seconds = input.nextInt();
		
		// PROCESS
		
		int hours = seconds / 3600;
		int minutes = (seconds - hours * 3600) / 60;
		int totalSeconds = seconds - hours * 3600 - minutes * 60;
		
		// OUTPUT
		
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n", seconds,
				hours, minutes, totalSeconds);
		
		System.out.printf("%d seconds = %02dh:%02dm:%02ds \n", seconds, hours, minutes,
				totalSeconds); // add a zero (0) after the % symbol and the numbers of zeros needed
		
		
		input.close();
						
		
	} // end class

} // end main
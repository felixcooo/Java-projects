package Homeworks;

/* This program converts Fahrenheit temperature to Celsius temperature.
 * 
 *@author: Felix Carrera 
 *@Date: 10/07/23
 *Version : 1.0
 * 
 */


import java.util.Scanner;


public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		// INPUT
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Fahrenheit Temperature as a decimal:");
		double fahrenheitTemperature = input.nextDouble();
		
		// PROCESS
		
		double celsiusTemperature = (fahrenheitTemperature - 32) * 5 / 9;
		
		// OUTPUT
		
		System.out.printf("%.1f F = %.1f C\n", fahrenheitTemperature
				, celsiusTemperature);
	
		
		input.close();
		
		
	} // end main

} // end class

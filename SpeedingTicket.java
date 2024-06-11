package labs;

import java.util.Scanner;

public class SpeedingTicket {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int speedLimit;
		int drivingSpeed;
		int speedTicket;
		
		System.out.println("enter");
		
		speedLimit = scnr.nextInt();
		drivingSpeed = scnr.nextInt();
		
		if(drivingSpeed < 10) {
			speedTicket = 50;
			
		}//end if
		
		else if(drivingSpeed >= 6 || drivingSpeed <= 20) {
			speedTicket = 75;
		}
		
		else if(drivingSpeed >= 21 || drivingSpeed <= 40) {
			speedTicket = 150;
		}
		
		else if(drivingSpeed > 40) {
			speedTicket = 300;
			
		}
		
		else
			speedTicket = 0;
		
		System.out.println(speedTicket);
		

	}//end main

}//end class

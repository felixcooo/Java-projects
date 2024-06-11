package homeworks;

import java.util.Scanner;

public class CopenhagenTransit {

	public static void main(String[] args) {
		
		// INPUT
		
		Scanner input = new Scanner(System.in);

		String adultOrChild;
		int zoneNumber;
		double fare = 0;
		
		System.out.println("Enter zone number :");
		zoneNumber = input.nextInt();
		
		System.out.println("Enter adult or child :");
		adultOrChild = input.next();
		
		// PROCESS
		
		if((zoneNumber <= 2) && (adultOrChild.equals("adult"))) {
			fare = 23.0;
			
			System.out.println("The fare for adult to zone number " + zoneNumber + " is " + fare + "."); // Output for $23 Adults.
			}//end if
		
		else {
			
			if((zoneNumber <= 2) && (adultOrChild.equals("child"))) {
		
			fare = 11.5;
			
			System.out.println("The fare for child to zone number " + zoneNumber + " is " + fare + "."); // Output for $11.5 Child.
			}// end if
			
			else {
				if ((zoneNumber == 3) && (adultOrChild.equals("adult"))) {
				fare = 34.5;
				System.out.println("The fare for adult to zone number " + zoneNumber + " is " + fare + "."); // Output for $34.5 Adults.
				
				}// end if
				
				else {
					if ((zoneNumber == 3) || (zoneNumber == 4) && (adultOrChild.equals("child"))) {
						fare = 23.0;
						System.out.println("The fare for child to zone number " + zoneNumber + " is " + fare + ".");	// Output for $23.0 Child.
						
					}//end if
					
					else {
						if ((zoneNumber == 4) && (adultOrChild.equals("adult"))) {
							fare = 46.0;
							System.out.println("The fare for adult to zone number " + zoneNumber + " is " + fare + "."); // Output for $46.0 Adults.
							
						}//end if
						
						else {
							if ((zoneNumber > 4)) {
								fare = -1;
								System.out.println("The fare for " + adultOrChild + " to zone number " + zoneNumber + " is " + fare + "."); // Output for a zone greater than 4.
								
							}//end if
							
						}//end else
						
					}//end else
					
				}//end else
				
			}//end else
			
		}//end else
		
		
	input.close();
				
		
	}

}

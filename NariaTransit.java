/**
 * @author Felix Carrera
 * @date 10/02/23
 * @version 1.0
 * 
 * This program computer the fair on the Naira Transit system.
 * 
 */


package homeworks;


import java.util.Scanner;


public class NariaTransit {

	public static void main(String[] args) {

		// INPUT
		
	    Scanner input = new Scanner(System.in); // Variable used for input
	
	    System.out.println("Enter the region: "); // Prompt for region number
	    int regionNumber = input.nextInt(); // Variable to represent the region
	    
	    System.out.println("Enter the customer type: "); // Prompt for customer type
	    String customerType = input.next(); // Variable to represent the customer
	    
	    double price = 0.0; // Variable used to represent the price
	    
	    
	    // PROCESS
	    
	    if( regionNumber <= 2 && customerType.equals("hunter")){
	    	
	    price = 13.0;

	    } //end if
	    
	    else
	    {
	    	
	    	if( regionNumber <= 2 && customerType.equals("magician")){
		    	
	    	    price = 16.5;

	    	    } //end if
	    	
	    	else {
	    		
	    	    if( regionNumber == 3 && customerType.equals("hunter")){
	    	    	
	    		    price = 31.5;

	    		    } //end if
	    	    
	    	    else {
		    		
		    	    if( (regionNumber == 3 || regionNumber == 4) && customerType.equals("magician")){
		    	    	
		    		    price = 22.0;

		    		    } //end if
		    		
		    		
		    	} // end else

	    		
	    	} // end else
	    	  
	   	    
	    } // end else
	    
	    	    
		// OUTPUT
	    
		System.out.println("The fare for " + customerType + " to region " + regionNumber 
				+ " is " + price);
		
	    
	    input.close();   
		
		
	} //end main

} // end main


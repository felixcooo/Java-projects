//package Homeworks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputTextToOutputFile {
    
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // prompt the user for the name of the output file
        System.out.println("What is the name of your output file?");
        String fileName = scanner.nextLine(); // read the file name from the console

        try (FileWriter writer = new FileWriter(fileName)) { // create a FileWriter object for the provided "fileName"
            
        	String inputLine; // variable to hold each line of input from the user
            
        	boolean stopFlag = false; // flag to control the loop, indicating when to stop reading input

            // loop until "STOP!" is encountered
            while (!stopFlag) {
            
            	inputLine = scanner.nextLine(); // read the next line of input from the user
                
            	writer.write(inputLine + System.lineSeparator()); // write the input line to the file, adding a newline at the end
                
                // check if the inputLine is exactly "STOP!"
                if ("STOP!".equals(inputLine)) {
                    stopFlag = true; // set the flag to true to exit the loop
                }
            }
        } catch (IOException e) {
        	
            // Catch and handle exceptions related to file writing
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            
        } finally {
        	
            scanner.close();
        }
        
    }//end main
    
}// end class

//package Homeworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAndPrintFile {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String fileName;
		
		while(true) {
			
			// prompt the user for the file name
			System.out.println("What is the name of your file?");
			fileName = scnr.nextLine();
			
			try {
				
                // create a File object for the provided "fileName"
				File file = new File(fileName);
				
                // check if the file exists, if not, throw "FileNotFoundException"
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }
                
                // reinitialize the scanner to read from the "file" instead of the console
				scnr = new Scanner(file);
				
				// read and print each line from the file
				while(scnr.hasNextLine()) {
					
					System.out.println(scnr.nextLine());
					
				}//end while
				
				// close input before exit
				scnr.close();
				
				// exit the loop after successfully reading and printing the "file"
				break;
				
			} catch (FileNotFoundException e) {
				
                // if the file was not found, inform the user and repeat the loop
                System.out.println("File Not Found " + fileName);
                
            }// end catch
			
		}//end while
	
	}//end main

}//end class

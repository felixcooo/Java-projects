//package Homeworks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndEditFile {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String fileName;
        File file;

        while (true) {
            System.out.println("What is the name of your file?");
            fileName = scnr.nextLine();
            file = new File(fileName);

            if (file.exists()) {
                break; // Exit loop if file exists
            } else {
                System.out.println("File Not Found " + fileName);
            }
        }

        // Process and edit the file after confirmation of its existence
        try (Scanner fileScanner = new Scanner(file);
             FileWriter fileWriter = new FileWriter("HomeworkOutput6-2.txt")) {
            boolean capitalizeNext = true; // Flag to indicate the next character should be capitalized

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                StringBuilder modifiedLine = new StringBuilder();

                for (int i = 0; i < line.length(); i++) {
                    char character = line.charAt(i);
                    if (capitalizeNext && Character.isLetter(character)) {
                        character = Character.toUpperCase(character);
                        capitalizeNext = false; // Reset flag after capitalization
                    } else if (character == '.') {
                        capitalizeNext = true; // Set flag at end of a sentence
                    }
                    modifiedLine.append(character);
                }

                // Write the processed line to the output file, replacing multiple whitespaces with a single space
                fileWriter.write(modifiedLine.toString().trim().replaceAll("\\s+", " ") + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while editing the file: " + e.getMessage());
        }

        scnr.close(); // Always close the scanner to prevent resource leak
        
    }//end main
    
}//end class
import java.util.Scanner;

public class FinalExamAnswers {

	public static void main(String[] args) {

		manipulateString(); //From main calling the method.
	}

	public static void manipulateString() {

		Scanner scnr = new Scanner(System.in); // Input from user.

		System.out.println("Enter a sentence");
		String sentence = scnr.nextLine(); // Sentence input from user(nextLine).

		String[] words = sentence.split("\\s+");//Creation of "words" array to split "sentence" in single words.
		String sentenceManipulated = ""; //To store in memory manipulated sentences.

		for (int i = words.length - 1; i >= 0; i--) { // Loop for each word in reverse.
			String oneWord = words[i];

			// Loop for even words.
			if (i % 2 == 0) {
				oneWord = oneWord.toUpperCase(); //oneWord to  upper case.
				
			}//end if

			else {
				oneWord = oneWord.toLowerCase(); //oneWord to lower case.
				
			}//end else

			sentenceManipulated += oneWord + " ";
			
		}//end for loop

		System.out.print(sentenceManipulated.trim()); //Print out sentenceManipulated

	  scnr.close();// Input closed

	}// end manipulateString

}// end class
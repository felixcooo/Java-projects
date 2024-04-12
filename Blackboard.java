
import java.util.Scanner;
public class Blackboard {

	public static void main(String[] args) {
		
		goblin(3,3);
		
	
	
		
	}//end main
	// Method named mystery with zero arguments
    public static void mystery() {
        System.out.println("I am the mystery method");
    }

    // Method named goblin with 2 int arguments a and b
    public static void goblin(int a, int b) {
        // Use a to determine how many times to call the mystery
        for (int i = 0; i < a; i++) {
            mystery();
        }

        // After all invocations of mystery are complete, print the product of a*b
        System.out.println((a * b));
    }
	
	
}//end class

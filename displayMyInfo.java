package Exercises;

public class displayMyInfo {

	public static void main(String[] args) {

		DisplayMyInfo();
		printMyInfo("Felix");
		printMoreInfo("Felix", 100);

	}// end main

	public static void DisplayMyInfo() {

		System.out.println("Hello Everyone!");
		System.out.println("My name is Awesome Student, and I am learning how to program in CMP 167 this semester.");
		System.out.println("The school I attend is Lehman College.");
		System.out.println("I will soon create many more methods of my own.");
		System.out.println();

	}// end method

	public static void printMyInfo(String name) {

		System.out.println("Hello Everyone!");
		System.out.println("My name is " + name + ", and I am learning how to program in CMP 167 this semester.");
		System.out.println("The school I attend is Lehman College.");
		System.out.println("I will soon create many more methods of my own.");
		System.out.println();

	}//end method

	public static void printMoreInfo(String name, int num) {

		System.out.println("Hello Everyone!");
		System.out.println("My name is " + name + ", and I am learning how to program in CMP 167 this semester.");
		System.out.println("The school I attend is Lehman College.");
		System.out.println("I will soon create " + num + " more methods of my own.");

	}//end method

}// end class
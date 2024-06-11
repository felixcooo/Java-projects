import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {

		// Input.

		Scanner input = new Scanner(System.in);

		String mode;
		String mathOperator = "";
		String userChoice = "";
		boolean startOverYN = true;
		double results = 0;
		double numbers = 0;

		// Everything inside of "do" statement for the calculator to start all over
		// again.

		do {

			results = 0;

			System.out.println("Enter the calculator mode: Standard/Scientific?");
			mode = input.next();

			// Validation for calculator mode.

			while (!mode.equals("Standard") && !mode.equals("Scientific") && !mode.equals("standard")
					&& !mode.equals("scientific")) {

				System.out.println("Invalid mode, please try again");
				System.out.println("Enter the calculator mode: Standard/Scientific?");

				mode = input.next(); // Update mode based on user input.

			} // end while

			// If standard mode is true.

			if (mode.equals("Standard") || mode.equals("standard")) {

				System.out.println("The calculator will operate in standard mode.");
				System.out.println(
						"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");

				mathOperator = input.next(); // Math operator input from user.

				// Validation for wrong mathOperator.

				while (!mathOperator.equals("+") && !mathOperator.equals("-") && !mathOperator.equals("*")
						&& !mathOperator.equals("/")) {

					System.out.println("Invalid operator " + mathOperator);
					System.out.println(
							"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");

					mathOperator = input.next(); // Update math operator based on user input.

				} // end while

			} // end if

			// If scientific is true.

			if (mode.equals("Scientific") || mode.equals("scientific")) {

				System.out.println("The calculator will operate in scientific mode.");
				System.out.println(
						"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");

				mathOperator = input.next(); // Math operator input from user.

				// Validation for wrong mathOperator.

				while (!mathOperator.equals("+") && !mathOperator.equals("-") && !mathOperator.equals("*")
						&& !mathOperator.equals("/") && !mathOperator.equals("sin") && !mathOperator.equals("cos")
						&& !mathOperator.equals("tan")) {

					System.out.println("Invalid operator " + mathOperator);
					System.out.println(
							"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");

					mathOperator = input.next(); // Update math operator based on user input.

				} // end while

			} // end if

			// Addition

			if (mathOperator.equals("+")) {

				System.out.println("How many numbers do you want to add?");

				numbers = input.nextDouble(); // Numbers from input to add

				System.out.printf("Enter %.0f numbers\n", numbers);

				for (int i = 1; i <= numbers; i++) { // Loop to enter as many numbers from input.

					double sum = input.nextDouble();

					results = results + sum; // Result (results) is equal to results + all the numbers from input(sum).

				} // end for

			} // end if

			// Subtraction

			else {
				if (mathOperator.equals("-")) {

					System.out.println("How many numbers do you want to subtract?");

					numbers = input.nextDouble(); // Numbers from input to subtract.

					System.out.printf("Enter %.0f numbers\n", numbers);

					for (int i = 1; i <= numbers; i++) { // Loop to enter as many numbers from input.

						double subtract = input.nextDouble();

						// The first number must be the biggest positive number to subtract.
						if (i == 1) {
							results = subtract; // assign the biggest positive number to subtract to make the
												// subtraction

						} // end if

						else {
							results = results - subtract; // Double results here is the biggest positive number to make
															// the subtraction.

						} // end else

					} // end for

				} // end if

				// Multiplication

				else {
					if (mathOperator.equals("*")) {

						System.out.println("How many numbers do you want to multiply?");

						numbers = input.nextDouble(); // Numbers from input to multiply.

						System.out.printf("Enter %.0f numbers\n", numbers);

						results = 1; // Must be change outside outside of the loop to a value of 1 because results
										// will be 0 if everything is multiplicative by 0.

						for (int i = 1; i <= numbers; i++) { // Loop to enter as many numbers from input.

							double product = input.nextDouble();

							results = results * product; // Result (results) is equal to the product of all the numbers
															// from input(product).

						} // end for

					} // end if

					// Division

					else {
						if (mathOperator.equals("/")) {

							System.out.println("How many numbers do you want to divide?");

							numbers = input.nextDouble(); // Numbers from input to divide.

							System.out.printf("Enter %.0f numbers\n", numbers);

							for (int i = 1; i <= numbers; i++) { // Loop to enter as many numbers from input.

								double division = input.nextDouble();

								// The first number must be the biggest positive number to subtract.
								if (i == 1) {
									results = division; // assign the biggest number to the denominator to make the
														// division.

								} // end if

								else {
									results = results / division; // Double results here is the biggest number in the
																	// denominator to make the division.

								} // end else

							} // end for

						} // end if

						// Sine of one number.

						else {
							if (mathOperator.equals("sin")) {

								System.out.println("Enter a number in radians to find the sine");

								numbers = input.nextDouble(); // One number input from user to calculate sine.

								results = Math.sin(numbers); // Calculation of sine.

							} // end if

							// Cosine of one number.

							else {
								if (mathOperator.equals("cos")) {

									System.out.println("Enter a number in radians to find the cosine");

									numbers = input.nextDouble(); // One number input from user to calculate cosine.

									results = Math.cos(numbers); // Calculation of cosine.

								} // end if

								// Tangent of one number.

								else {
									if (mathOperator.equals("tan")) {
										System.out.println("Enter a number in radians to find the tangent");

										numbers = input.nextDouble(); // One number input from user to calculate
																		// tangents.

										results = Math.tan(numbers); // Calculation of tangent.

									} // end if

								} // end else

							} // end else

						} // end else

					} // end else

				} // end else

			} // end else

			System.out.println("Result: " + results); // Output for results.

			// Output to continue or to exit.

			System.out.println("Do you want to start over? (Y/N)");

			userChoice = input.next(); // "Y" or "N" input.

			// True, the calculator starts again.

			if (userChoice.equals("Y") || userChoice.equals("y")) {
				startOverYN = true;

			} // end if

			// False, the calculator exits.

			else {

				if (userChoice.equals("N") || userChoice.equals("n")) {

					startOverYN = false;

				} // end if

			} // end else

		} while (startOverYN); // True.

		System.out.println("Goodbye"); // Output when the calculator exits.

		input.close();

	}// end main

}// end class
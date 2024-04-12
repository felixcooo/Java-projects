//package Homeworks;

abstract class  Passenger implements Eater {

	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	private int numCarryOn;
	private double height;
	private int caloriesConsumed;
	private int caloriesAccumulator;

	public Passenger() { // default constructor

		name = ""; // default name
		birthYear = 1900; // default birthYear
		weight = 0.0; // default weight
		gender = 'u'; // default gender
		numCarryOn = 0; // default numCarryOn
		caloriesConsumed = 0;
		caloriesAccumulator = 0;

	}// end default constructor

	// overloaded constructor
	public Passenger(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {

		// Passenger("Tiger", 2008, 123.45, 'f', 1).

		this.name = name;
		this.birthYear = birthYear;
		this.weight = weight;
		this.gender = gender;
		this.numCarryOn = numCarryOn;

		// overloaded constructor weight
		if (weight >= 0) {

			this.weight = weight;

		} // end if

		else {
			this.weight = -1;

		} // end else

		// overloaded constructor numCarryOn
		if (numCarryOn >= 0 && numCarryOn <= 2) {

			this.numCarryOn = numCarryOn;

		} else if (numCarryOn < 0) {

			this.numCarryOn = 0;

		} else {

			this.numCarryOn = 2;
		}

		// overloaded constructor gender
		if (gender == 'm' || gender == 'f') {

			this.gender = gender;

		} else {

			this.gender = 'u';
		}

		// overloaded constructor height
		if (height < 0) {

			this.height = -1;
		} else
			this.height = height;

	}// end overloaded constructor
	
	public int getCaloriesConsumed() {
		return caloriesConsumed;
	}

	public void setCaloriesConsumed(int caloriesConsumed) {
		this.caloriesConsumed = caloriesConsumed;
	}

	public int getCaloriesAccumulator() {
		return caloriesAccumulator;
	}

	public void setCaloriesAccumulator(int caloriesAccumulator) {
		this.caloriesAccumulator = caloriesAccumulator;
	}

	public double getHeight() {
		return height;
	}
	
	public abstract double metabolizeAccumulatedCalories();
	
	public void setHeight(double height) {

		if (height < 0) {

			this.height = -1;
		} else
			this.height = height;

	}

	public static double calculateBMI(double pounds, double inches) {

		double heightInSquareInches = Math.pow(pounds, 2);

		double bmi = (pounds * 703) / heightInSquareInches;

		return bmi;

	}//end method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {

		if (weight >= 0) {

			this.weight = weight;

		} // end if

		else {
			this.weight = -1;

		} // end else

	}// end

	public char getGender() {

		return gender;

	}// end

	public void setGender(char gender) {

		if (gender == 'm' || gender == 'f') {

			this.gender = gender;

		} else {

			this.gender = 'u';
		}

	}// end

	public int getNumCarryOn() {

		return numCarryOn;

	}// end

	public void setNumCarryOn(int numCarryOn) {

		if (numCarryOn >= 0 && numCarryOn <= 2) {

			this.numCarryOn = numCarryOn;

		} else if (numCarryOn < 0) {

			this.numCarryOn = 0;

		} else {

			this.numCarryOn = 2;
		}

	}// end

	public int calculateAge(int currentYear) {

		if (currentYear < birthYear) {

			return -1;
		}

		return currentYear - birthYear;

	}// end

	public void gainWeight() {

		this.weight = weight + 1;

	}

	public void gainWeight(double input) {

		if (input >= 0) {

			this.weight = weight + input;
		}

		if (this.weight < 0) {

			this.weight = 0.0;
		}

	}// end

	public boolean isFemale() {

		return gender == 'f';

	}// end

	public boolean isMale() {

		return gender == 'm';

	}// end

	public void loseWeight() {

		if (weight > 0) {

			weight = weight - 1;
		}

	}// end

	public void loseWeight(double input) {

		if (input >= 0 && weight >= input) {

			weight = weight - input; // Decrease weight when input is < than weight
		}

	}// end

	@Override
	public boolean equals(Object obj) {
		// Step 1: Check if both references point to the same object
		if (this == obj) {
			return true; // Both references are the same, so they are equal
		}
		// Step 2: Check if the passed object is null or not an instance of Passenger
		// class
		if (obj == null || getClass() != obj.getClass()) {
			return false; // If passed object is null or not of the same class, they are not equal
		}
		// Step 3: Cast the passed object to Passenger class for comparison
		Passenger otherPassenger = (Passenger) obj;

		// Step 4: Compare individual attributes for equality
		return birthYear == otherPassenger.birthYear && // Year of birth comparison
				gender == otherPassenger.gender && // Gender comparison
				(name == otherPassenger.name || // Name comparison (handling null)
						(name != null && name.equals(otherPassenger.name)))
				&& Math.abs(weight - otherPassenger.weight) <= 0.5 && // Weight comparison with tolerance
				Math.abs(height - otherPassenger.height) <= 0.5; // Height comparison with tolerance
	}// end method

	@Override
	public String toString() {

		return String.format(
				"Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\n",
				name, birthYear, weight, height, gender, numCarryOn);

	}// end method

	public void printDetails() {

		System.out.printf(
				"Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\n",
				name, birthYear, weight, height, gender, numCarryOn);
	}// end

}// end class
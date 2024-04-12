//package Homeworks;

abstract class Teen extends Person implements Mover {
	
	// Constructor for the Teen class
    public Teen(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
        super(name, birthYear, weight, height, gender, numCarryOn, numCarryOn); // Call the constructor of the superclass
    }

    // Implement the abstract method metabolizeAccumulatedCalories() from the Person class
    @Override
    public double metabolizeAccumulatedCalories() {
        // Calculate weight gain for teens (one pound for every 5000 accumulated calories)
        double weightGain = getCaloriesAccumulator() / 5000.0;
        // Reset calories accumulator to zero
        setCaloriesAccumulator(0);
        // Return the amount of weight gained
        return weightGain;
    }

    // Implement the move() method from the Mover interface
    @Override
    public String move() {
        // Return the movement of a teen
        return "run fast and jump";
    }

    // Implement the move(int count) method from the Mover interface
    @Override
    public String move(int count) {
        // If count is less than or equal to 0, return an empty string
        if (count <= 0) {
            return "";
        }
        // Otherwise, repeat the movement count times
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append("run fast and jump\n"); // Append the movement to the result
        }
        return result.toString(); // Return the result as a string
    }
	
	
	
	
	
	

}

//package Homeworks;

// Define the Infant class that extends the Person class and implements the Mover and Eater interfaces
public abstract class Infant extends Person implements Mover, Eater {

    // Nested class representing an infant toy
    public class InfantToy {

        // Instance variables for the infant toy
        private String infantToyName;
        private int infantToyRating;

        // Constructor for the InfantToy class
        public InfantToy(String name, int rating) {
            infantToyName = name;
            infantToyRating = rating;
        }

        // Method to return a string representation of the InfantToy object
        public String toString() {
            return String.format("InfantToy: Toy Name: %20s | Rating %4d\n", infantToyName, infantToyRating);
        }
    }

    // Instance variables for the Infant class
    private InfantToy[] toys;
    private int numInfantToys;

    // Constructors
    public Infant() {
        super(); // Call parent's default constructor
        toys = new InfantToy[10]; // Initialize toys array with a capacity of 10
        numInfantToys = 0;
    }

    public Infant(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
        super(name, birthYear, weight, height, gender, numCarryOn, 0); // Call parent's overloaded constructor with numOffspring as 0
        toys = new InfantToy[10]; // Initialize toys array with a capacity of 10
        numInfantToys = 0;
    }

    // Method to add an infant toy
    public void addInfantToy(String name, int rating) {
        if (numInfantToys < 10) {
            toys[numInfantToys++] = new InfantToy(name, rating);
        }
    }

    // Method to get a string representation of an infant toy at a specified index
    public String getInfantToyAsString(int index) {
        if (index < 0 || index >= numInfantToys) {
            return "invalid index " + index;
        }
        return toys[index].toString();
    }

    // Method to get the number of infant toys
    public int getNumInfantToys() {
        return numInfantToys;
    }

    // Method to get the name of an infant toy at a specified index
    public String getInfantToyName(int index) {
        if (index < 0 || index >= numInfantToys) {
            return "invalid index " + index;
        }
        return toys[index].infantToyName;
    }

    // Method to get the rating of an infant toy at a specified index
    public int getInfantToyRating(int index) {
        if (index < 0 || index >= numInfantToys) {
            return -1;
        }
        return toys[index].infantToyRating;
    }

    // Method to get the highest rating among infant toys
    public int getHighestInfantToyRating() {
        int highestRating = 0;
        for (InfantToy toy : toys) {
            if (toy != null && toy.infantToyRating > highestRating) {
                highestRating = toy.infantToyRating;
            }
        }
        return highestRating;
    }

    // Override toString method to return a string representation of the Infant object
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString()); // Call parent's toString method
        result.append(String.format("Infant: Number of Toys: %4d | Infant Toys:\n", numInfantToys));
        for (InfantToy toy : toys) {
            if (toy != null) {
                result.append(toy.toString());
            }
        }
        return result.toString();
    }

    // Override printDetails method to print details of the Infant object
    @Override
    public void printDetails() {
        super.printDetails(); // Call parent's printDetails method
        System.out.printf("Infant: Number of Toys: %4d | Infant Toys:\n", numInfantToys);
        for (InfantToy toy : toys) {
            if (toy != null) {
                System.out.print(toy.toString());
            }
        }
    }

    // Override metabolizeAccumulatedCalories method to calculate weight gain and reset calories accumulator
    @Override
    public double metabolizeAccumulatedCalories() {
        // Calculate weight gain
        double weightGain = getCaloriesAccumulator() / 1200.0;
        // Update the weight
        setWeight(getWeight() + weightGain);
        // Reset caloriesAccumulator to 0
        setCaloriesAccumulator(0);
        // Return the weight gain
        return weightGain;
    }

    // Implement move method from the Mover interface
    @Override
    public String move() {
        return "flail arms and legs";
    }

    // Implement move method with count parameter from the Mover interface
    @Override
    public String move(int count) {
        StringBuilder result = new StringBuilder();
        if (count <= 0) {
            return "";
        }
        for (int i = 0; i < count; i++) {
            result.append("flail arms and legs\n");
        }
        return result.toString();
    }
}
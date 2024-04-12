//package Homeworks;

abstract class Person extends Passenger {

	private int numOffspring;

	public Person() {

		super(); // Call master class's default constructor
		numOffspring = 0; // Default value for numOffspring

	}

	public Person(int numOffspring) {

		super();
		this.numOffspring = numOffspring;

		// overloaded constructor numOffspring
		if (numOffspring >= 0) {
			this.numOffspring = numOffspring;

		} else
			this.numOffspring = 0;

	}

	public Person(String name, int birthYear, double weight, double height, char gender, int numCarryOn,
			int numOffspring) {

		super(name, birthYear, weight, height, gender, numCarryOn);

		this.numOffspring = numOffspring;

		// overloaded constructor numOffspring
		if (numOffspring >= 0) {
			this.numOffspring = numOffspring;

		} else
			this.numOffspring = 0;

	}

	public int getNumOffspring() {
		return numOffspring;
	}

	public void setNumOffspring(int numOffspring) {

		if (numOffspring >= 0) {
			this.numOffspring = numOffspring;

		} else
			this.numOffspring = 0;

	}
	
	@Override
	public void printDetails() {
		
		super.printDetails();
		System.out.printf("Person: Number of Offspring: %4d\n", numOffspring);
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + String.format("Person: Number of Offspring: %4d\n", numOffspring);
		
	}
	
	public boolean equals(Object obj) {
		
		if(!super.equals(obj)) {
			
			return false; //If master class's equals method returns false, return false
        }
		
		if(obj instanceof Person) {
			
			Person diffPerson = (Person) obj;
			return numOffspring == diffPerson.numOffspring; // Compare numOffspring
		}
		
		return false; // If the object is not an instance of Person, return false
 }

}// end class

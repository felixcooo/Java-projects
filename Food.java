//package Homeworks;

abstract class Food extends Passenger{

	private String name;
	private int calories;

	public Food(String name, int calories) {

		this.name = name;
		this.calories = calories;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {

		return String.format(
				"Food - Name: %10s | calories: %4d\n",
				name, calories);

	}// end method
	
	public boolean equals(Object o) {
        // Check if the object being compared is the same object
        if (this == o) {
            return true;
        }

        // Check if the object is null or not an instance of Food
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        // Cast the object to Food for comparison
        Food otherFood = (Food) o;

        // Compare the names and calories of the two Food objects
        return name.equals(otherFood.name) && calories == otherFood.calories;
    }


}//end class

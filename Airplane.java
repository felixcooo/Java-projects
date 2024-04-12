//package Homeworks;

//import Model.Passenger;
import java.util.Arrays;

public class Airplane {

	private Passenger[] passengers;
	private String airplaneName;
	private int numPassengers;

	// default constructor
	public Airplane() {

		this.passengers = new Passenger[100];
		this.airplaneName = "";
		this.numPassengers = 0;

	} // end

	public Airplane(String airplaneName) {

		this.airplaneName = airplaneName;
		this.numPassengers = 0;
		this.passengers = new Passenger[100];

	}// end

	public Airplane(int maxPassengers) {

		if (maxPassengers < 0) {
			
            maxPassengers = 0;
            
        }//end if
		
        this.passengers = new Passenger[maxPassengers];
        
        this.numPassengers = 0;
        
        this.airplaneName = "";

	}// end

	public Airplane(String airplaneName, int maxPassengers) {

		   if (maxPassengers < 0) {
			   
	            maxPassengers = 0;
	        }//end if
		   
	        this.passengers = new Passenger[maxPassengers];
	        
	        this.numPassengers = 0;
	        
	        this.airplaneName = airplaneName;


	}// end
	
	

	public void addPassenger(Passenger passenger) {

		if (numPassengers < passengers.length) {
			
            passengers[numPassengers] = passenger;
            
            numPassengers++;
            
        }//end if

	}//end
	
	public Passenger getPassenger(int index) {
		
		if(index < 0 || index >= numPassengers) {
			
			return null;
			
		}//end if
		
		return passengers[index];
		
	}//end
	
	public int getNumPassengers() {
		
		
		return numPassengers;
		
	}//end

	public String getAirplaneName() {

		return airplaneName;

	}

	public Passenger getFirstPassenger() {

		if (numPassengers > 0) {

			return passengers[0];
		}

			return null;

	}// end

	public Passenger getLastPassenger() {

		if (numPassengers > 0) {

			return passengers[numPassengers - 1];
		}

			return null;

	}// end
	
	 public void setAirplaneName(String airplaneName) {
		 
	        this.airplaneName = airplaneName;
	        
	    }//end

	public Passenger[] getPassengers() {

		return Arrays.copyOf(passengers, numPassengers);

	}// end

	public Passenger removePassenger(int index) {

		if (index < 0 || index >= numPassengers) {
			return null; // Return null if the index is invalid
		}

		Passenger passengerRemoved = passengers[index];

		for (int i = index; i < numPassengers - 1; i++) {

			passengers[i] = passengers[i + 1];

		}

		numPassengers--; // Decrement the number of passengers

		return passengerRemoved; // Return the removed passenger

	}// end

	public void removeAllPassengers() {

		for (int i = 0; i < numPassengers; i++) {

			passengers[i] = null; // Set each element to null
		}

		numPassengers = 0; // Reset numPassengers to 0

	}// end

	public double getTotalWeightOfAllPassengers() {

		double totalWeight = 0.0;

		for (int i = 0; i < numPassengers; i++) {

			totalWeight = totalWeight + passengers[i].getWeight(); // Sum the weight of each passenger

		}

		return totalWeight;

	}// end

	public double getAverageWeightOfAllPassengers() {

		double totalWeight = getTotalWeightOfAllPassengers(); // Get the total weight of all passengers

		return totalWeight / numPassengers; // Calculate and return the average weight

	}// end

	public int getNumberOfPassengersAboveWeight(double weight) {

		int count = 0;

		for (int i = 0; i < numPassengers; i++) {

			if (passengers[i].getWeight() > weight) {

				count++; // Increment count if passenger weight is above the specified weight

			} // end if

		}

		return count; // return the increment

	}// end

	public int getNumberOfPassengersBelowWeight(double weight) {

		int count = 0;

		for (int i = 0; i < numPassengers; i++) {

			if (passengers[i].getWeight() < weight) {

				count++; // Increment count if passenger weight is below the specified weight

			}

		}

		return count++; // return the increment

	}// end

	public void increaseWeightOfAllPassengers() {

		for (int i = 0; i < numPassengers; i++) {

			passengers[i].gainWeight(); // Increase the weight of each passenger using the gainWeight() method

		}

	}// end

	public void increaseWeightOfAllPassengers(double weight) {

		for (int i = 0; i < numPassengers; i++) {

			passengers[i].gainWeight(weight); // Increase the weight of each passenger using the gainWeight(double)
												// method
		}

	}// end

	public void printAllDetails() {

		System.out.printf("AirplaneName: %20s | Number of Passengers: %4d | Airplane Size: %4d\n", airplaneName,
				numPassengers, passengers.length);

		for (int i = 0; i < numPassengers; i++) {

			passengers[i].printDetails(); // Call the printDetails method from the Passenger class on each Passenger
											// instance
		}

	}// end

}// end class

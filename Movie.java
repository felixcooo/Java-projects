import java.util.Arrays;

public class Movie {

	// Private member variables
	private String movieName;
	private int numMinutes;
	private boolean isKidFriendly;
	private int numCastMembers;
	private String[] castMembers;

	// Default constructor.
	public Movie() {
		
		this.movieName = "Flick";
		this.numMinutes = 0;
		this.isKidFriendly = false;
		this.numCastMembers = 0;
		this.castMembers = new String[10];
		
	}//end default constructor.

	// Overloaded constructor.
	public Movie(String movieName, int numMinutes, boolean isKidFriendly, String[] castMembers) {
		
		this.movieName = movieName;
		this.numMinutes = numMinutes;
		this.isKidFriendly = isKidFriendly;
		this.numCastMembers = castMembers.length;
        this.castMembers = Arrays.copyOf(castMembers, castMembers.length);
		
	}//end overloaded constructor.

	// Getter and setter methods.
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getNumMinutes() {
		return numMinutes;
	}

	public void setNumMinutes(int numMinutes) {
		this.numMinutes = numMinutes;
	}

	public int getNumCastMembers() {
		return numCastMembers;
	}

	public String[] getCastMembers() {
		return Arrays.copyOf(castMembers, castMembers.length);
	}

	// Method to set this.kid-friendly to kid-friendly.
	public void setIsKidFriendly(boolean isKidFriendly) {
		this.isKidFriendly = isKidFriendly;
	}
	
	public boolean isKidFriendly() {
        return isKidFriendly;
    }

	// Method to replace a cast member at a specific index.
	public boolean replaceCastMember(int index, String castMemberName) {
		
		//To check if the index is out of bounds.
		if (index >= 0 && index < numCastMembers) {
			
			castMembers[index] = castMemberName; //Update the castMember at the specified index.
			
			return true;//Return a true if the replacement was successful.
			
		}//end if
		
		else {
			
			return false; //Return false for an invalid index.
			
		}//end else
		
	}//end replaceCastMember

	
	// Method to check if two arrays are equal
	public boolean doArraysMatch(String[] array1, String[] array2) {
	    
	    // If both arrays are null, treat them as equivalent.
	    if (array1 == null && array2 == null) {
	        
	        return true;
	        
	    }//end if
	    
	    // If one array is null and the other is not, or if their lengths differ, they are not equal.
	    if (array1 == null || array2 == null || array1.length != array2.length) {
	        
	        return false;
	        
	    }//end if
	    
	    // Compare elements at every position, disregarding letter case.
	    for (int i = 0; i < array1.length; i++) {
	        
	        // If the elements at the current position are not equal.
	        if (!array1[i].equalsIgnoreCase(array2[i])) {
	            
	            return false; //Return false if the arrays are not equal.
	            
	        }//end if
	        
	    }//end for loop
	    
	    
	    return true;// return true if all elements match in the arrays.
	    
	}//end method doArraysMatch

	// Method to get cast member names as a formatted string
	public String getCastMemberNamesAsString() {
	    
	    // Check if there are no cast members in the array
	    if (numCastMembers == 0) {
	        
	        // If there are no cast members in the array, return “none”.
	        return "none";
	        
	    }//end if
	    
	    // Initialize a StringBuilder to build the comma-separated string
	    StringBuilder castMemberNames = new StringBuilder();
	    
	    // Append the cast members to the StringBuilder
	    for (int i = 0; i < numCastMembers; i++) {
	        
	        // Append the current cast member to the StringBuilder
	        castMemberNames.append(castMembers[i]);
	        
	        // Add a comma and space if there are more cast members to follow
	        if (i < numCastMembers - 1) {
	            
	            castMemberNames.append(", ");
	            
	        }//end if
	        
	    }//end for loop
	    
	    // Convert the StringBuilder to a string and return it
	    return castMemberNames.toString();
	    
	}//end method getCastMemberNamesAsString
	

	// Method to format the movie information as a string
	
	public String toString() {
	    
	    // Initialize a string to store the formatted movie name
	    String formattedMovieName = ""; // 20
	    
	    // Format the number of minutes as a 3-digit number with leading zeros
	    String formattedMinutes = String.format("%03d", numMinutes);
	    
	    // Determine the kid-friendly status and create a corresponding string
	    String kidFriendlyStatus = isKidFriendly ? "is kid friendly" : "not kid friendly";
	    
	    // Add leading spaces to the movie name to make it 20 characters wide
	    for (int i = 0; i < 20 - movieName.length(); i++) {
	    	
	        formattedMovieName += " ";
	        
	    }//end for loop
	    
	    // Concatenate the formatted movie name, minutes, and kid-friendly status
	    formattedMovieName += movieName;

	    // Construct and return the formatted movie information string
	    return "Movie: [ Minutes " + formattedMinutes + " | Movie Name: " 
	            + formattedMovieName + " | " + kidFriendlyStatus
	            + " | Number of Cast Members: " + numCastMembers 
	            + " | Cast Members: " + getCastMemberNamesAsString() + " ]"; //Output cast member as String

	}//end method toString.


	// Method to check if two Movie objects are equal.
	public boolean equals(Object o) {
		// Check if the references are the same.
		if (this == o) {
			
			return true;
			
		}//end if
		
	    // Check if the object being compared is null or of a different class.
		if (o == null || getClass() != o.getClass()) {
			
			return false;
			
		}//end if
		
	    // Store the object to a Movie to access its fields.
		Movie otherMovie = (Movie) o;
		
	    // Check equality of individual fields
		return numMinutes == otherMovie.numMinutes && isKidFriendly == otherMovie.isKidFriendly
				&& numCastMembers == otherMovie.numCastMembers && movieName.equalsIgnoreCase(otherMovie.movieName)
				&& doArraysMatch(castMembers, otherMovie.castMembers);
		
	}//end method equals.
	
	
}//end class Movie.

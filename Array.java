package Homeworks;

public class Array {

	public static void main(String[] args) {
		
	  // Example array
        int[] arr = {45, 22, 18, 89, 82, 79, 15, 69, 100, 55, 48, 72, 16, 98, 57, 75, 44, 32, 21, 14, 7, 16, 49, 58, 72};
        
      // Call the sum method and print the result
        int result = sum(arr);
        
        System.out.println("Sum of whole array = " + result);
        
     // Call the second sum method for elements 12-18 and print the result
        int firstIndex = 12;
        int lastIndex = 18;
        int resultPartialArray = sum(arr, firstIndex, lastIndex);
        System.out.println("Sum of elements " + firstIndex + "-" + lastIndex + " = " + resultPartialArray);
        
     // Call average method
        double arrAverage = average(arr, firstIndex, lastIndex);
        System.out.println("Average of whole array = " + arrAverage);
        
     // Call the maxValue method
        int max = maxValue(arr);
        System.out.println("Max of whole array = " + max);
    
}// end main


	
	// method to compute the sum of elements in an array
    public static int sum(int[] arr) {
    	
    	 // Initialize sum to store the cumulative sum
        int sum = 0;

        // Iterate through each element in the array using a traditional for loop
        for (int i = 0; i < arr.length; i++) {
        	
            // Add the current element to the sum
            sum = sum + arr[i];
            
        }//end for loop

        return sum; // return the sum of whole array
        
    }//end method
    
    
    public static int sum(int[] arr, int firstIndex, int lastIndex) {
    	
        // Check if the indices are valid
    	if((firstIndex < 0) || (lastIndex >= arr.length) || (firstIndex > lastIndex)) {
    		
    		return -666; // Invalid indices, return error value
    		
    	}//end if
    	
    	int sum = 0; // Initialize sum to store the cumulative sum

        // Iterate through each element in the specified range
    	for(int i = firstIndex; i <= lastIndex; i++) {
    		
    		sum = sum + arr[i];
    	}
    	
    	return sum; // return sum of elements
    	
    }//end method
    
    
    public static double average(int[] arr) {
    	
    	double sum = 0; //  to store the cumulative sum
    	
        // iterate through each element in the array using a traditional for loop
    	for(int i = 0; i < arr.length; i++) {
    		
    		sum = sum + arr[i];
    		
    	}
    	
    	double average = sum / arr.length; // average calculation
    	
    	return average; // return average after division
    	
    	
    }//end method
    
    
    public static double average(int[] arr,int firstIndex,int lastIndex) {
    	
    	// Check if the indices are valid
    	if((firstIndex < 0) || (lastIndex >= arr.length) || (firstIndex > lastIndex)) {
    		
    		return -666.0; // Invalid indices, return error value
    		
    	}//end if
    	
    	// to store sum of whole array
    	double sum = 0;
    	
    	// to store number of whole elements
    	double count = 0;

        // Iterate through each element in the specified range
        for (int i = firstIndex; i <= lastIndex; i++) {
        	
        	sum = sum + arr[i];// Add the current element to the sum
        	
        	count++; // Increment the count of elements
            
        }//end for loop

        double average = sum / count;
        
        return average; // Return the computed average
    	
    	
    }//end method
    
    
    public static int maxValue(int[] arr) {
    	
        // initialize max to the first element of the array
    	int maxNum = arr[0];
    	
    	
    	// iterate through each element in the array
    	for(int i = 1; i < arr.length; i++) {
    		
            // update maxNum if the current element is greater
    		if(arr[i] > maxNum) {
    			
    			maxNum = arr[i];
    			
    		}//end if
    		
    	}//end for loop
    	
    	return maxNum; // return the maximum value
    	
    }//end method
    
    public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
    	
        // Check if the indices are valid
        if (firstIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex) {
            return -666; // Invalid indices, return error value
        }

        // Initialize max to the value at firstIndex
        int max = arr[firstIndex];

        // Iterate through each element in the specified range
        for (int i = firstIndex + 1; i <= lastIndex; i++) {
        	
            // Update max if the current element is greater
            if (arr[i] > max) {
                max = arr[i];
                
            }//end if
            
        }// end loop

        // Return the maximum value found in the specified range
        return max;
        
    }//end method
    
    
    public static int indexOfFirstMaxValue(int[] arr) {

        // initialize max to the first element of the array
        int max = arr[0];
        int maxIndex = 0;

        // iterate through each element in the array
        for (int i = 1; i < arr.length; i++) {
        	
            // if the current element is greater than max, update max and maxIndex
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }//end if
            
        }//end loop

        return maxIndex; // return the index of the first occurrence of maximum value
        
    }//end method
    
    
    public static int indexOfFirstMaxValue(int[] arr, int firstIndex, int lastIndex) {
    	
        // check if the indices are valid
        if (firstIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex) {
            return -1; // return -1 for invalid indices
            
          }//end if

        // initialize maxIndex to the index of the first element in the range
        int maxIndex = firstIndex;
        int maxValue = arr[firstIndex];

        // iterate through each element in the specified range
        for (int i = firstIndex + 1; i <= lastIndex; i++) {
        	
            // Update maxIndex if a greater value is found
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }//end if
            
        }//end loop

        return maxIndex; // return the index of the first occurrence of maximum value in the range
        
    }//end method
    
    
    public static int numberOfBelowAverageElements(int[] arr) {

        // Calculate the average of all elements in the array
        double sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
        	
            sum = sum + arr[i];
            
        }//end loop
        
        double average = sum / arr.length; // division of average

        // count the elements below average
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
        	
            if (arr[i] < average) {
            	
                count++;
            }//end if
            
        }//end loop

        return count; // return the count of elements below average

        
    }//end  method
    
    
    public static int numberOfBelowAverageElements(int[] arr, int firstIndex, int lastIndex) {
    	
        // check if the indices are valid
        if (firstIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex) {
            return -666; // return invalid indices
        }//end if

        double sum = 0;
        
        // calculate the average of elements in the specified range
        for (int i = firstIndex; i <= lastIndex; i++) {
        	
            sum = sum + arr[i];
            
        }//end loop
        
        double average = sum / (lastIndex - firstIndex + 1);

        int count = 0;
        
        // count the elements below average
        for (int i = firstIndex; i <= lastIndex; i++) {
        	
            if (arr[i] < average) {
            	
                count++;
                
            }//end if
            
        }//end loop

        return count; // return elements below average
        
    }//end method


     public static void rotateElements(int[] arr) {

        // Store the last element of the array
        int lastElement = arr[arr.length - 1];

        // Shift each element to the right by one position
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Move the last element to the first position
        arr[0] = lastElement;

    }// end method


    public static void rotateElements(int[] arr, int rotationCount) {

        // Calculate the actual rotation count considering array length
        rotationCount %= arr.length;

        // Create a temporary array to store rotated elements
        int[] temp = new int[rotationCount];

        // Copy the last rotationCount elements to temp array
        System.arraycopy(arr, arr.length - rotationCount, temp, 0, rotationCount);

        // Shift elements to the right by rotationCount positions
        for (int i = arr.length - 1; i >= rotationCount; i--) {
            arr[i] = arr[i - rotationCount];
        }

        // Move elements from temp array to the beginning of arr
        System.arraycopy(temp, 0, arr, 0, rotationCount);

    }//end method

     public static void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        // Swap elements from left to right until left < right
        while (left < right) {

            // Swap arr[left] with arr[right]
            int temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            // Move to the next pair of elements
            left++;
            
            right--;

        }//end while

    }//end method

}//end class
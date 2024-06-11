package homework;

public class Homework6Methods {
	
	public static int getMaxOf2Ints(int a, int b) {
		return Math.max(a, b);
		
	}// end getMaxOf2Ints
	
	
	public static int getMinOf2Ints(int a, int b) {
		return Math.min(a, b);
		
	}// end getMaxOf2Ints
	
	
	public static int getMaxOf3Ints(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
		
	}// end getMaxOf3Ints
	
	
	public static int getMedianOf3Ints(int a, int b, int c) {
		
		int minNumber = Math.min(Math.min(a, b), c);
		int maxNumber = Math.max(Math.max(a, b), c);
		int medianNumber = a + b + c - minNumber - maxNumber;
		
		return medianNumber;
		
	}// end getMedianOf3Ints
	
	
	public static void printMinOf3Ints(int a, int b, int c) {
		System.out.println("The min is " + Math.min(Math.min(a, b), c));
		
	}// end printMinOf3Ints
	
	
	public static int getProdOfAllPositiveInts(int num) {
		
		
		if (num <= 0) {
			
            return 0;
            
        }//end if
		
		int results = 1;
		
			for (int i = 1; i <= num; i++) {
				results = results * i;
				
			}//end for
		
		return results;
		
	}// end getProdOfAllPositiveInts
	
	
	public static int getProdOfAllNegativeInts (int num) {
		
		
		 if (num >= 0) {
			 
		        return 0;
		        
		    }//end if
		 
		 
		int results = 1;
	
			for (int i = num; i <= -1; i++) {
				results = results * i;
				
			}//end for
			
		
		return results;
		
	}// end getProdOfAllNegativeInts
	
	
	public static boolean isProdOfAllNegativeIntsNegative(int num) {
		
		return(getProdOfAllNegativeInts(num) < 0)?true:false;
		
		
	}//end isProdOfAllNegativeIntsNegative
	
	public static char getCharAtIndex(String s, int index) {
		
		char results;
		
		
		if (index < 0 || index > s.length()) {
			
			results = '?';
			
			return results;
			
		}//end if
		
		else {
			
			results = s.charAt(index);
			
		}//end else
		
		return results;
		
		
            
    }//end getCharAtIndex
		
		

	public static int getCountOfCharInString(String s, char c) {
		
		int count = 0;

        for (int i = 0; i < s.length(); i++) {
        	
            if (s.charAt(i) == c) {
            	
                count++;
                
                
            }//end if
            
            
        }//end for

       return count;
		
		
		
	}//end getCountOfCharInString
	
	
	public static String getStringReversed(String reverseWord) {
		
		return new StringBuilder(reverseWord).reverse().toString();
		
		
	}//end getStringReversed
	
	
	public static String getStringTitleCased (String s) {
		
	   
	   
	   if(s == null) {
		   return s = "";
		   
	   }//end if
	   
	   else {
		   
		   if(s == "") {
			   
			   return s = "";
			   
		   }//end if
		   
		   else {
			   
			   if(s.length() == 0) {
				   return s = "";
				   
				   
			   }//end if
			   
		   }//end else
		   
		   
	   }//end else
		
		
		return s.substring(0,1).toUpperCase() + s.substring(1);
	

		
	}//end getStringTitleCased
	
	

}//end class

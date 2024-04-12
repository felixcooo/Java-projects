//package Project1;

public class Course {

	// Attributes
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;

	// Overloaded constructor
	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {

		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;

	}// end overloaded constructor

	// Setters and getters
	public boolean isGraduateCourse() {

		return isGraduateCourse;

	}

	public int getCourseNum() {
		return courseNum;
	}

	public String getCourseDept() {
		return courseDept;
	}

	public int getNumCredits() {
		return numCredits;
	}

	// Methods and behaviors

	public String getCourseName() {

		if (isGraduateCourse) {

			return "G" + courseDept + courseNum;
		}

		else {

			return "U" + courseDept + courseNum;
		}

	}

	public String toString() {
		
		// to print out Graduate or Undergraduate on the toString();
		String courseType;
		
	    if (isGraduateCourse) {
	    	
	        courseType = "Graduate";
	        
	    } else {
	    	
	        courseType = "Undergraduate";
	    }

		return String.format("Course: %3s-%3d | Number of Credits: %02d | %s", courseDept, courseNum,
				numCredits, courseType);

	}

	public boolean equals(Object obj) {

		// if "obj" is not an instance of Course then return false
		if (!(obj instanceof Course)) {

			return false;
		}

		Course courseObj = (Course) obj;

		if ((this.courseNum == courseObj.courseNum) && (this.courseDept == courseObj.courseDept)
				&& (this.isGraduateCourse == courseObj.isGraduateCourse) && (this.numCredits == courseObj.numCredits)) {

			return true;
		}

		else
			return false;
	}

	public int compareTo(Course c) {

		// Keyword: Comparable interface, -1 less than , 1 greater than and 0 equal.
		if (this.courseNum < c.courseNum) {

			return -1;

		} else if (this.courseNum > c.courseNum) {

			return 1;

		} else
			return 0;

	}

}// end class

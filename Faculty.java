//package Project1;

import java.util.Arrays;

public class Faculty extends Employee {

	// attributes
	private Course[] coursesTaught = new Course[100]; //
	private int numCoursesTaught;
	private boolean isTenured;

	// default constructor
	public Faculty() {

		coursesTaught = null;
		numCoursesTaught = 0;
		isTenured = false;

	}

	// overloaded constructor
	public Faculty(boolean isTenured) {

		coursesTaught = null;
		numCoursesTaught = 0;
		this.isTenured = isTenured;

	}

	// overloaded constructor
	public Faculty(String deptName, boolean isTenured) {

		super(deptName); // call to the superclass "Employee" constructor
		this.isTenured = isTenured;

	}

	// overloaded constructor
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {

		super(name, birthYear, deptName); // call to the superclass "Employee" and "Person"constructor
		this.isTenured = isTenured;

	}

	// setters and getters
	public int getNumCoursesTaught() {
		return numCoursesTaught;
	}

	public boolean isTenured() {
		return isTenured;
	}

	public void setIsTenured(boolean isTenured) {

		this.isTenured = isTenured;
	}

	// methods
	public void addCourseTaught(Course course) {

		if (numCoursesTaught < 100) { // to ensure there is space in the array

			coursesTaught[numCoursesTaught++] = course; // increment course if there is space
		}

	}

	public void addCoursesTaughtt(Course[] courses) {

		for (int i = 0; i < courses.length; i++) {

			if (numCoursesTaught >= 100) {

				break; // stop if the array is full

			} // end if

			addCourseTaught(courses[i]); // add each course to the array
		}

	}

	public Course getCourseTaught(int index) {

		// to verify index
		if (index >= 0 && index < numCoursesTaught) {

			return coursesTaught[index];

		} else {

			return null; // return null for invalid index

		}

	}

	public String getCourseTaughtAsString(int index) {

		/*
		 * using method getCourseTaught() to retrieve the course at the given index from
		 * the coursesTaught array
		 */
		Course course = getCourseTaught(index); // getCourseTaught()

		if (course != null) {

			return course.toString(); // if the course is not null, return its string representation

		} else {

			return ""; // return "" if invalid
		}
	}

	public String getAllCoursesTaughtAsString() {

		String coursesListAsString = ""; // String to store

		// loop goes through each course taught based on the number of courses recorded
		// from "numCoursesTaught"
		for (int i = 0; i < numCoursesTaught; i++) {

			coursesListAsString = coursesListAsString + getCourseTaughtAsString(i); // Append the course string
																					// representation

			if (i < numCoursesTaught - 1) { // to check that this is not the last course in the list

				coursesListAsString = coursesListAsString + ", "; // add a comma separator between course names, except
																	// after the last course
			}
		}
		
		return coursesListAsString;
	}

	@Override
	public boolean equals(Object obj) {
		
	    // check if the current object is the same as the object passed in
		if (this == obj) {
			return true;
		}
		
	    // call the superclass's equals method to check for equality based on superclass fields
		if (!super.equals(obj)) {
			return false;
		}
		
	    // check if the passed object is an instance of the Faculty class
		if (!(obj instanceof Faculty)) {
			
			return false;
		}

		// cast the "obj" to a "Faculty object" so that Faculty fields can be compared
		Faculty faculObj = (Faculty) obj;
		
		
		// compare Faculty-specific fields for equality.
	    // check if both objects have the same 'isTenured' status.
	    // check if both objects teach the same number of courses (numCoursesTaught).
	    // use Arrays.equals to compare the 'coursesTaught' arrays for equality.
	    // arrays.equals checks that both arrays contain the same elements in the same order.
		return this.isTenured == faculObj.isTenured && this.numCoursesTaught == faculObj.numCoursesTaught
				&& Arrays.equals(this.coursesTaught, faculObj.coursesTaught);
	}

	@Override
	public String toString() {

		// determine the tenure status as a string.
		String tenuredToString;

		if (isTenured) {

			tenuredToString = "Is Tenured";

		} else {

			tenuredToString = "Not Tenured";
		}

		String resultOfString = super.toString() + " Faculty: " + tenuredToString + " | Number of Courses Taught: "
				+ numCoursesTaught + " | Courses Taught: " + getAllCoursesTaughtAsString();

		return resultOfString;
	}

	@Override
	public int compareTo(Person p) {

		if (!(p instanceof Faculty)) {
			return -1;
		}

		// cast the Person object (p) to Faculty for comparison
		Faculty facul = (Faculty) p;

		if (this.numCoursesTaught < facul.numCoursesTaught) {

			return -1;

		} else if (this.numCoursesTaught > facul.numCoursesTaught) {

			return 1;

		} else {

			return 0;
		}
	}

}

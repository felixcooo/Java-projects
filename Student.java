//package Project1;

public class Student extends Person{

	// attributes
	private static int numStudents;
	private int studentID;
	private Course[] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major = "undeclared";

	// default constructor
	public Student() {

		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		isGraduate = false;
		major = "undeclared";
		this.studentID = ++numStudents; // generated

	}

	// overloaded constructors
	public Student(boolean isGraduate) {

		this(); // call default constructor
		this.isGraduate = isGraduate;
	}

	public Student(String major, boolean isGraduate) {
		this(); // call default constructor
		this.major = major;
		this.isGraduate = isGraduate;

	}

	public Student(String name, int birthYear, String major, boolean isGraduate) {

		super(name, birthYear); // call default constructor
		this.studentID = ++numStudents; // ensure studentID is assigned (generated)
		this.major = major;
		this.isGraduate = isGraduate;

	}

	// setters and getters
	public boolean isGraduate() {

		return isGraduate;

	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public static int getNumStudents() {
		return numStudents;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getNumCoursesTaken() {
		return numCoursesTaken;
	}

	public void setGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}

	// methods
	public void addCourseTaken(Course course) {

		// increment numCoursesTaken inside of coursesTaken
		if (numCoursesTaken < coursesTaken.length) {
			
			coursesTaken[numCoursesTaken] = course;
			
			numCoursesTaken++;

		} /*
			 * else {
			 * 
			 * // handle the case where there's no more space to add new courses break; }
			 */

	}

	public void addCoursesTaken(Course[] courses) {

		// go through each course in the provided array of courses
		for (int i = 0; i < courses.length; i++) {
			
			if (numCoursesTaken >= coursesTaken.length) {
				break; // stop adding courses if there's no more space in the coursesTaken array
			}
			
			coursesTaken[numCoursesTaken] = courses[i]; // add the course at index i to coursesTaken

			numCoursesTaken++; // increment the number of courses taken
		}

	}

	public Course getCourseTaken(int index) {

		// index must be verified. Return “null” if invalid
		if (index >= 0 && index < numCoursesTaken) {
			
			return coursesTaken[index];
		}
		
		return null;

	}

	public String getCourseTakenAsString(int index) {

		// check if the index is valid(out of bounds)
		if (index < 0 || index >= numCoursesTaken) {
			// if the index is out of range, return ""(empty String)
			return "";
		}

		// if the index is valid, retrieve the course from the coursesTaken array
		Course course = coursesTaken[index];

		// to avoid any exception if the index is null
		if (course != null) {

			// return the course's courseDept and courseNum as a string
			return course.getCourseDept() + "-" + course.getCourseNum();

		} else {

			// if for any reason the course at the valid index is null, also return an empty
			// string
			return "";
		}

	}

	public String getAllCoursesTakenAsString() {

		// initialize an empty StringBuilder to build the resulting string
		StringBuilder coursesCoursesAsString = new StringBuilder();

		// iterate over the number of courses the student has actually taken
		for (int i = 0; i < numCoursesTaken; i++) {

			// use getCourseTakenAsString to get the string representation of each course
			String courseString = getCourseTakenAsString(i);

			// append (add) the course string representation to the StringBuilder
			coursesCoursesAsString.append(courseString);

			// if this is not the last course, also append (add) a comma and space for
			// separation
			if (i < numCoursesTaken - 1) {
				coursesCoursesAsString.append(", ");
			}
		}

		// convert the StringBuilder to a String and return it
		return coursesCoursesAsString.toString();

	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (!(obj instanceof Student)) {

			return false;
		}

		// check if all inherited attributes are equal using the superclass's equals
		// method
		if (!super.equals(obj)) {
			return false;
		}

		Student stuObj = (Student) obj;

		// check if the local attributes (numCoursesTaken, isGraduate, major) are equal
		if (this.numCoursesTaken != stuObj.numCoursesTaken || this.isGraduate != stuObj.isGraduate) {

			return false;

		}

		// check if the local attributes (major) are equal
		if (this.major == null) {

			if (stuObj.major != null)

				return false;

		} else {

			if (!this.major.equals(stuObj.major))

				return false;
		}

		// compare each course in coursesTaken
		for (int i = 0; i < this.coursesTaken.length; i++) {
			
			// check if one is null and the other isn't
			if ((this.coursesTaken[i] == null) != (stuObj.coursesTaken[i] == null)) {
				
				return false;
				
			}
			
			// if neither is null, compare the courses
			if (this.coursesTaken[i] != null && !this.coursesTaken[i].equals(stuObj.coursesTaken[i])) {

				return false;
			}
		}

		// if the method hasn't returned false by this point, all checks have passed,

		// meaning the two Student objects are considered equal.
		return true;
	}

	@Override
	public String toString() {

		// to print out Graduate or Undergraduate on the toString();
		String graduateStatus;

		if (isGraduate) {

			graduateStatus = "Graduate";

		} else {

			graduateStatus = "Undergraduate";
		}

		// <content of Person> GeneralStaff: Duty: %10s”, duty
		return String.format(
				"%s Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
				super.toString(), studentID, major, graduateStatus, numCoursesTaken, getAllCoursesTakenAsString());
	}

	@Override
	public int compareTo(Person p) {

		// check if 'p' is not a Student, throw IllegalArgumentException if not
		if (!(p instanceof Student)) {
			throw new IllegalArgumentException("Comparison with non-student object");
		}

		// cast the Person object (p) to Student for comparison
		Student student = (Student) p;

		// Integer.compare is used to compare the number of courses taken between this
		// student and 'student'
		return Integer.compare(this.numCoursesTaken, student.getNumCoursesTaken());
		
	}

	/*
	 * @Override public int compareTo(Person p) {
	 * 
	 * // check if 'p' is a Student, return -1 if not if (!(p instanceof Student)) {
	 * return -1; }
	 * 
	 * // cast the Person object (p) to Student for comparison Student stud =
	 * (Student) p;
	 * 
	 * // Integer.compare is to compare the number of courses taken between this //
	 * student and 'stud' return Integer.compare(this.numCoursesTaken,
	 * stud.numCoursesTaken); // numCredits = numCoursesTaken }
	 * 
	 */

}

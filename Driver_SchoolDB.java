//package Project1;

/*
 * Here is my video:
 * https://www.youtube.com/watch?v=n6kdKaDLTjo
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Here is my video: https://www.youtube.com/watch?v=n6kdKaDLTjo

public class Driver_SchoolDB {

	public static void main(String[] args) {

		String filePath = "SchoolDB_Initial.txt";

		List<Course> courses = new ArrayList<>();
		List<Person> persons = new ArrayList<>();
		List<GeneralStaff> generalStaff = new ArrayList<>();
		List<Student> students = new ArrayList<>();
		List<Faculty> faculties = new ArrayList<>();
		List<Employee> employees = new ArrayList<>();

		readFile(filePath, courses, faculties, generalStaff, students);
		
		displayEntities(courses, persons, generalStaff, students, faculties, employees);
		
		showMenu(courses, persons, generalStaff, students, faculties, employees);

	}// end main

	private static void readFile(String filename, List<Course> courses, List<Faculty> faculties,
			List<GeneralStaff> generalStaff, List<Student> students) {

		// Simplified file reading and object creation based on assumed input format.
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

			String line;

			while ((line = reader.readLine()) != null) {

				System.out.println(line); // output line
			}
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}// end method

	public static void displayEntities(List<Course> courses, List<Person> persons, List<GeneralStaff> generalstaff,
			List<Student> students, List<Faculty> faculties, List<Employee> employees) {

		System.out.println();
		System.out.println("**************************************************************");
		System.out.println("SCHOOL DATABASE INFO:");
		System.out.println();
		System.out.println("************************************************");

		System.out.println("COURSES:");

		for (int i = 0; i < courses.size(); i++) {

			System.out.println(courses.get(i).toString());
		}

		for (int i = 0; i < 96; i++) {
			System.out.print("*");
		}

		System.out.println("PERSONS:");

		for (int i = 0; i < persons.size(); i++) {

			System.out.println(persons.get(i).toString());

		}

		for (int i = 0; i < 96; i++) {
			System.out.print("*");
		}
		
		System.out.println();

		System.out.println("EMPLOYEES:");

		for (int i = 0; i < employees.size(); i++) {

			System.out.println(employees.get(i).toString());

		}

		for (int i = 0; i < 96; i++) {
			System.out.print("*");
		}

		System.out.println();

		System.out.println("GENERAL STAFF:");

		for (int i = 0; i < generalstaff.size(); i++) {

			System.out.println(generalstaff.get(i).toString());
		}

		for (int i = 0; i < 96; i++) {
			System.out.print("*");
		}

		System.out.println();

		System.out.println("FACULTY:");

		for (int i = 0; i < faculties.size(); i++) {

			System.out.println(faculties.get(i).toString());

		}

		for (int i = 0; i < 96; i++) {
			System.out.print("*");
		}

		System.out.println();

		System.out.print("STUDENTS:");

		for (int i = 0; i < students.size(); i++) {

			System.out.print(students.get(i).toString());

		}

		for (int i = 0; i < 96; i++) {
			System.out.print("*");
		}

		System.out.println();

	}// end method

	public static void showMenu(List<Course> courses, List<Person> persons, List<GeneralStaff> generalStaff,
			List<Student> students, List<Faculty> faculties, List<Employee> employees) {

		Scanner scnr = new Scanner(System.in);
		
		int choice;
		
		do {
			
			System.out.println("1: Add course");
			System.out.println("2: Add faculty");
			System.out.println("3: Add general staff");
			System.out.println("4: Add student");
			System.out.println("7: Exit");
			
			System.out.println();
			System.out.print("Enter your choice: ");

			while (!scnr.hasNextInt()) {

				System.out.println("Please enter a number.");
				scnr.next(); // consume the invalid input
			}

			choice = scnr.nextInt();

			switch (choice) {

			case 1:
				addNewCourse(courses, scnr);
				break;

			case 2:
				addNewFaculty(faculties, scnr);
				break;

			case 3:
				addNewGeneralStaff(generalStaff, scnr);
				break;

			case 4:
				addNewStudent(students, scnr);
				break;

			case 7:
				System.out.println("Goodbye!");
				break;

			default:
				System.out.println("Invalid option, please try again.");
				scnr.next();
			}

		} while (choice != 7);

		displayEntities(courses, persons, generalStaff, students, faculties, employees);
		
		scnr.close();

	}// end method

	public static void addNewCourse(List<Course> courses, Scanner scnr) {

		System.out.print("Enter course department: ");
		String courseDept = scnr.next();

		System.out.print("Enter course number: ");
		int courseNum = scnr.nextInt();

		System.out.print("Is it a graduate course? (true/false): ");
		boolean isGraduateCourse = scnr.nextBoolean();

		System.out.print("Enter number of credits: ");
		int numCredits = scnr.nextInt();

		Course newCourse = new Course(isGraduateCourse, courseNum, courseDept, numCredits);

		courses.add(newCourse);

		System.out.println(newCourse.toString());
	}

	public static void addNewFaculty(List<Faculty> faculties, Scanner scnr) {

		System.out.print("Enter faculty name: ");
		String name = scnr.next();

		System.out.print("Enter birth year: ");
		int birthYear = scnr.nextInt();

		System.out.print("Enter department: ");
		String department = scnr.next();

		System.out.print("Is tenured? (true/false): ");
		boolean isTenured = scnr.nextBoolean();

		Faculty newFaculty = new Faculty(name, birthYear, department, isTenured);
		faculties.add(newFaculty);

		System.out.println(newFaculty.toString());
	}

	public static void addNewGeneralStaff(List<GeneralStaff> generalStaff, Scanner scnr) {

		System.out.print("Enter staff name: ");
		String name = scnr.next();

		System.out.print("Enter duty: ");
		String duty = scnr.next();

		GeneralStaff newStaff = new GeneralStaff(name, duty);
		generalStaff.add(newStaff);

		System.out.println(newStaff.toString());
	}

	public static void addNewStudent(List<Student> students, Scanner scnr) {

		System.out.print("Enter major: ");
		String major = scnr.next();

		System.out.print("Is graduate? (true/false): ");
		boolean isGraduate = scnr.nextBoolean();

		Student newStudent = new Student(major, isGraduate);
		students.add(newStudent);

		System.out.println(newStudent.toString());
	}

}// end class
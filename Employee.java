//package Project1;

public class Employee extends Person {

	// Attributes
	private String deptName;
	private static int numEmployees;
	private int employeeID;

	// default constructor
	public Employee() {

		deptName = "";
		
		this.employeeID = ++numEmployees;

	}

	// overloaded constructor
	public Employee(String deptName) {

		this.deptName = deptName;
		
		this.employeeID = ++numEmployees;
		// or employeeID++; (generated)

	}

	// overloaded constructor

	public Employee(String name, int birthYear, String deptName) {

		super(name, birthYear); // Assuming the Person class has a constructor that takes name and birthYear
		this.deptName = deptName;
		this.employeeID = ++numEmployees;
		// or employeeID++; (generated)
	}

	public String getDeptName() {
		return deptName;
	}

	public static int getNumEmployees() {
		return numEmployees;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setDeptName(String deptName) {

		this.deptName = deptName;

	}

	// methods

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Employee)) {

			return false;
		}

		Employee empObj = (Employee) obj;

		if (this.deptName.equals(empObj.deptName) && this.employeeID == empObj.employeeID) {

			return true;
			
		} else
			return false;

	}// end method

	@Override
	public String toString() {

		String contentOfPerson = super.toString(); // calling method toString from Person super class

	    String contentOfEmployee = String.format(" Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);

	    return contentOfPerson + contentOfEmployee; // adding both toString from Person and Employee
	    //append

	}// end method

	@Override
	public int compareTo(Person p) {
		
		// cast p from Person to Employee
		Employee emp = (Employee) p;

		// Now comparing by employeeID
		if (this.employeeID < emp.employeeID) {

			return -1;

		} else if (this.employeeID > emp.employeeID) {

			return 1;

		} else {

			return 0;
		}

	}// end method

}// end class

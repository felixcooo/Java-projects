//package Project1;

public class GeneralStaff extends Employee{
	
	// attributes
	private String duty = "";
	

	// default constructor
	public GeneralStaff() {

		duty = "";

	}
	
	// overloaded constructors
	public GeneralStaff(String duty) {

		this.duty = duty;

	}
	
	public GeneralStaff(String deptName, String duty) {
		
		super(deptName);
		this.duty = duty;
		
	}
	
	public GeneralStaff(String name, int birthYear, String deptName, String duty) {
		
		super(name, birthYear, deptName);
		this.duty = duty;
		
	}
	
	// methods
	
	// this method returns the duty as a string
	public String getDuty(){
		
		return duty;
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof GeneralStaff)) {
			
			return false;
		}
		
		GeneralStaff staffObj = (GeneralStaff) obj;
		
	    // check if all inherited attributes are equal using the superclass's equals method
		if (!super.equals(obj)) {
	        return false;
	    }
		
		// check if the local attribute "duty" is equal
	    return this.duty.equals(staffObj.duty);
		
		
	}
	
	@Override
	public String toString(){
		
		// <content of Employee> GeneralStaff: Duty: %10s”, duty
		return super.toString() + String.format(" GeneralStaff: Duty: %10s", duty);
		
		
	}

}//end class

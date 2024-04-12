//package midterm;

import java.time.LocalDate;

public class Pediatrician extends Doctor {

	// attributes
	private boolean hasPrivatePractice = false;
	private String hospitalName = "";

	// overloaded constructor
	public Pediatrician(String name) {

		super(name); // pass the name of the Doctor to the parent constructor
	}

	// overloaded constructor
	public Pediatrician(String name, boolean hasPrivatePractice, String hospitalName) {

		super(name);
		this.hasPrivatePractice = hasPrivatePractice;
		this.hospitalName = hospitalName;

	}

	// method
	public boolean hasPrivatePractice() {

		return hasPrivatePractice;
	}

	// setters and getters
	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	@Override
	public void addPatient(Patient pt) throws PatientException {

		// we need to convert birthYear to years old first
		int currentYear = LocalDate.now().getYear(); // today's date and current year
		int yearsOld = currentYear - pt.getBirthYear(); // difference between currentYear and getBirthYear() from
														// patient class

		if (yearsOld < 18) {

			super.addPatient(pt); // adding patient less than 18 years old

		} else {

			throw new PatientException("Patients older than 18 years can't be added to a Pediatrician.");

		}

	}

	@Override
	public String toString() {

		/*
		 * <Doctor toString()> + "\nPediatrician: %s | hospital name=%15s",
		 * (hasPrivatePractice ? "has private practice" :
		 * "does not have private practice"), hospitalName
		 */

		return super.toString() + String.format("\nPediatrician: %s | hospital name=%15s",
				(hasPrivatePractice ? "has private practice" : "does not have private practice"), hospitalName);

	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {

			return true;
		}

		if (!(obj instanceof Pediatrician)) {

			return false;
		}

		Pediatrician ped = (Pediatrician) obj;

		return this.hasPrivatePractice == ped.hasPrivatePractice && this.hospitalName.equals(ped.hospitalName);

	}

}

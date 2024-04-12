//package midterm;

import java.util.Arrays;

public class Doctor implements SeesPatients, Comparable<Doctor> {

	// attributes
	private static int numDoctors = 0;
	private String name;
	private int licenseNumber;
	private Patient[] patients;
	private int numberOfPatients;

	// overloaded constructor
	public Doctor(String name) {

		this.name = name;
		this.licenseNumber = ++numDoctors; // use numDoctors to generate the licenseNumber
		this.patients = new Patient[MAX_PATIENTS];

	}

	// getters and setters
	public static int getNumDoctors() {
		return numDoctors;
	}

	public String getName() {
		return name;
	}

	public int getLicenseNumber() {
		return licenseNumber;
	}

	public int getNumberOfPatients() {
		return numberOfPatients;
	}

	// methods
	public String getPatientsAsString() {

		StringBuilder sb = new StringBuilder("patients= ");

		for (int i = 0; i < numberOfPatients; i++) {
			
            if (i > 0) sb.append(", ");
            
            sb.append(patients[i].toString());
        }

		return sb.toString();

	}

	public void addPatient(Patient p) throws PatientException {
		
		if (p == null) {
			
	        throw new IllegalArgumentException("Patient cannot be null");
	    }

		if (numberOfPatients >= patients.length) {

			throw new PatientException("Capacity reached, cannot add more patients.");
		}

		patients[numberOfPatients++] = p;

	}

	@Override
	public String toString() {

		return String.format("Doctor: name= %20s | license number= %06d | %s", name, licenseNumber,
				getPatientsAsString());

	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {

			return true;
		}

		if (!(obj instanceof Doctor)) {

			return false;
		}

		Doctor md = (Doctor) obj;

		return this.name.equals(md.name) && this.numberOfPatients == md.numberOfPatients;

	}

	// implemented method from Comparable<Doctor>
	@Override
	public int compareTo(Doctor md) {

		return Integer.compare(this.numberOfPatients, md.numberOfPatients);

	}

	
	@Override
	public Patient[] getPatients() {

		// return only the non-null part of the patients array
        return Arrays.copyOf(patients, numberOfPatients); // trim the array to size
	}

	@Override
	public boolean isPatient(Patient patient) {
		
		if (patient == null) {
			
	        return false; // return false if patient is null
	    }

		// iterate through all patients currently assigned to the doctor
		for (int i = 0; i < numberOfPatients; i++) {

			if (patients[i].equals(patient)) {

				return true; // if a matching patient is found, return true
			}
		}

		return false; // if no matching patient is found in the entire array, return false
	}
	
	

}// end class

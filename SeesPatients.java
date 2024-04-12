//package midterm;

public interface SeesPatients {
	
	// maximum number of patients a Doctor can see
    static final int MAX_PATIENTS = 100;

    // adds a patient to the doctor's list. Throws a PatientException if adding the patient is not possible
    void addPatient(Patient p) throws PatientException;

    // returns an array of the doctor's patients
    Patient[] getPatients();

    // returns a String representation of the doctor's patients
    String getPatientsAsString();

    // checks if a specific patient is under the doctor's care
    boolean isPatient(Patient patient);

}


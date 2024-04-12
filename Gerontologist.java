//package midterm;

import java.time.LocalDate;

public class Gerontologist extends Doctor {

	// attributes
	private boolean performsHouseCalls = true; // true default value
	private double visitFee = 0.0; // 0.0 default value

	// overload constructor
	public Gerontologist(String name) {

		super(name);

	}

	// overload constructor
	public Gerontologist(String name, boolean performsHouseCalls, double visitFee) {

		super(name);
		this.performsHouseCalls = performsHouseCalls;
		this.visitFee = visitFee;

			

		/*
		 * 
		 * if (visitFee >= 0.0) {
		 * 
		 * this.visitFee = visitFee;
		 * 
		 * } else {
		 * 
		 * throw new IllegalArgumentException("Visit fee can't be below 0");
		 * 
		 * }
		 */

	}

	// setters and getters
	public double getVisitFee() {

		return visitFee;
	}

	public void setVisitFee(double visitFee) {

		/*
		 * try {
		 * 
		 * if (visitFee >= 0.0) {
		 * 
		 * this.visitFee = visitFee;
		 * 
		 * } else {
		 * 
		 * // throw an exception if visitFee is negative throw new
		 * IllegalArgumentException("Visit fee can't be below 0"); }
		 * 
		 * } catch (IllegalArgumentException e) {
		 * 
		 * System.out.println(e.getMessage()); }
		 * 
		 */
		
		if (visitFee >= 0.0) {

			this.visitFee = visitFee;
		}else
			
			this.visitFee = 0.0;

		/* if (visitFee >= 0.0) {

			this.visitFee = visitFee;

		} else {

			throw new IllegalArgumentException("Visit fee can't be below 0");

		}
		
		*/

	}

	public void setPerformsHouseCalls(boolean performsHouseCalls) {
		this.performsHouseCalls = performsHouseCalls;
	}

	// methods
	public boolean performsHouseCalls() {

		return performsHouseCalls;
	}

	@Override
	public void addPatient(Patient pt) throws PatientException {

		// we need to convert birthYear from "Patient" to years old first
		int currentYear = LocalDate.now().getYear(); // today's date and current year

		int yearsOld = currentYear - pt.getBirthYear(); // difference between currentYear and getBirthYear() from
														// Patient class

		if (yearsOld > 65) {

			super.addPatient(pt); // adding patient greater than 65 years old

		} else {

			throw new PatientException();

		}

	}

	@Override
	public String toString() {

		// <Doctor toString()> + "\nGerontologist: %s | visit fee=%02.2f",
		// (performsHouseCalls ? "performs house calls" : "no house calls"), visitFee
		return super.toString() + String.format("\nGerontologist: %s | visit fee=%02.2f",
				(performsHouseCalls ? "performs house calls" : "no house calls"), visitFee);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {

			return true;

		}

		if (!(obj instanceof Gerontologist)) {

			return false;
		}

		if (!super.equals(obj)) {

			return false;
		}

		Gerontologist gero = (Gerontologist) obj;

		if (this.performsHouseCalls != gero.performsHouseCalls) {

			return false;
		}

		// check if visitFee is approximately equal, considering a precision of 0.05
		boolean visitFeeEqual = Math.abs(this.visitFee - gero.visitFee) <= 0.05;

		// return true if both performsHouseCalls and visitFee are considered equal
		return this.performsHouseCalls == gero.performsHouseCalls && visitFeeEqual;

	}

}// end class

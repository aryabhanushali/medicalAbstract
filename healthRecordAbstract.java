package bhanushali.two;

//import date library to use object
import java.util.Date;

public abstract class healthRecord {
	
	//fields
	private String firstName;
	private String lastName;
	private double[] unpaidBills; 

	
	
	//default constructor
	public healthRecord() {
		super();
		this.firstName = "No name assigned";
		this.lastName = "No name assigned";
		this.unpaidBills = new double[]{0,0};
		

	}
	//partial constructor
	public healthRecord(String middleName) {
		super();
		this.firstName = "No name Assigned";
		this.lastName = "No name Assigned";
		this.unpaidBills = new double[]{0,0};
	
	
	}
	
	//full constructor
	public healthRecord(String firstName, String lastName, double[] unpaidBills) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.unpaidBills = unpaidBills;
		
	}
	
	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double[] getUnpaidBills() {
		return unpaidBills;
	}
	public void setUnpaidBills(double[] unpaidBills) {
		this.unpaidBills = unpaidBills;
	}

	//abstract method section
	public abstract int calculateAge(Date birthDate, Date currentDate);
	public abstract boolean isDeceased();
	public abstract double returnPatientBalance(double[] unpaidBills);
	public abstract void displayRecord();
	
	
	
	
}

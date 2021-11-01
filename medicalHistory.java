/*Arya Bhanushali
 * History Record
 * October 21, 2021
 */


package bhanushali.two;

import java.time.Period;
import java.util.Date;

//medical history record extends the healthRecord abstract class
public class medicalHistoryRecord extends healthRecord {

	//fields
	private String birthPlace;
	private String diagnosis;
	private double weight; //kg
	private double height; //m
	
	//default constructor
	public medicalHistoryRecord() {
		this("No first name assigned",  "No last name assigned",  "Unkown location", "Unknown diagnosis", 0, 0, new double[]{0,0});
				
	}
	
	//partial constructor
	public medicalHistoryRecord(String diagnosis) {
		this("No first name assigned",  "no last name assigned", "unkown location", diagnosis, 0, 0, new double[]{0,0});
	}
	
    //full constructor
	public medicalHistoryRecord(String firstName,  String lastName, String birthPlace, String diagnosis, double weight, double height, double[] unpaidBills) {
		super(firstName,  lastName, unpaidBills);
		this.birthPlace = birthPlace;
		this.diagnosis = diagnosis;
		this.height = height;
		this.weight = weight;	
	}
	
	
	//getters and setters	
	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getdiagnosis() {
		return diagnosis;
	}

	public void setdiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//override replacement of abstract functions

	@Override
	public int calculateAge(Date birthDate, Date currentDate) {

		
		int years = 0;
		
		
		if (birthDate.getMonth() == currentDate.getMonth() && currentDate.getDay() < birthDate.getDay()) {
			years = birthDate.getYear() - currentDate.getYear() - 1;
		}
			
			else if (currentDate.getMonth() < birthDate.getMonth()) { //check if current month is less than birth month
				years = birthDate.getYear() - currentDate.getYear() -1;	 //if so to find accurate years, you have to subtract 1
			} else {
				years = birthDate.getYear() - currentDate.getYear();
			}
			  int month = years * 12; //find years in months
			  System.out.println("Age in months: " + month);
			  return month;
		
			
			
	
	
	}

	
	//depending on the diagnosis, the patient could or could not be dead
	@Override
	public boolean isDeceased() {
		
		if (diagnosis=="Corona Virus") {
			System.out.println("Patient died of corona virus.");
			return true;
		}
		
		else if (diagnosis=="deadly") {
			System.out.println("Patient is deceased.");
		}
		else {
			System.out.println("Patient is alive. Run more tests.");
			return false;
	}
		return false;
	}
	
	
	
	@Override
	public double returnPatientBalance(double[] unpaidBills) {
		double totalBill = 0;
		double checkUpCost= 624;
		
		//iterate through array and add all unpaid bills
		for(double x: unpaidBills) {
			 totalBill = totalBill + x;
		}
		
		//add checkup cost to the total bill
		totalBill = checkUpCost + totalBill;
		
		
	return totalBill;
	
		
	}

	
	//display method
	@Override
	public void displayRecord() {
		System.out.println("                  ");
		System.out.println( this.getFirstName() + " " + this.getLastName()  +  "'s Medical History");
		System.out.println("====================================================");
		System.out.println("Born in: " + this.birthPlace);
		System.out.println("Weight: " + this.weight +" kg");	
		System.out.println("Height: " + this.height+ " m");
		
	    //calculate BMI
		double BMI = (this.weight / (this.height * this.height));
		System.out.println("BMI: " + BMI);			
		System.out.println("Diagnosis: " + this.diagnosis);
		System.out.println("     ");
		
	}
	
	

}

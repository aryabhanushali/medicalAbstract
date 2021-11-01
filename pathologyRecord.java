/*Arya Bhanushali
 * Pathology Record
 * October 21, 2021
 */



package bhanushali.two;


import java.util.Date;

//pathology record is the class extending the abstract class
public class pathologyRecord extends healthRecord{
	
	//fields
	private String bloodType;
	private int bloodCount;
	private String bloodAbnormality;
	private boolean prescribeMedication;
	
	
	//default constructor
	public pathologyRecord() {
		this( "No first name assigned", "No last name assigned", "No blood type assigned", 0, "No abnormality found",false, new double[]{0,0});
	}
	
	//partial constructor
	public pathologyRecord(String firstName, String lastName) {
		this("No blood type assigned", firstName,  lastName, 0, "No abnormality found", false, new double[]{0,0});
	}
	
	//full constructor
	public pathologyRecord(String firstName,  String lastName, String bloodType, int bloodCount, String bloodAbnormality, boolean prescribeMedication, double[] unpaidBills) {
		super(firstName, lastName, unpaidBills);
		this.bloodType = bloodType;
		this.bloodCount = bloodCount;
		this.bloodAbnormality = bloodAbnormality;
		this.prescribeMedication = prescribeMedication;
		
		
	}
	
	
	//getters and setters
		
	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public int getBloodCount() {
		return bloodCount;
	}

	public void setBloodCount(int bloodCount) {
		this.bloodCount = bloodCount;
	}

	public String getBloodAbnormality() {
		return bloodAbnormality;
	}

	public void setBloodAbnormality(String bloodAbnormality) {
		this.bloodAbnormality = bloodAbnormality;
	}

	public boolean isPrescribeMedication() {
		return prescribeMedication;
	}

	public void setPrescribeMedication(boolean prescribeMedication) {
		this.prescribeMedication = prescribeMedication;
	}

	
	
	//override replacement of abstract functions
	
	@Override
	public int calculateAge(Date birthDate, Date currentDate) {
	
		//use date library to get current year and set to variable Date currentDate
		int currentYear = currentDate.getYear();
		
		//use date library to get birth year and set to variable Date birthDate
		int birthYear = birthDate.getYear();
		
		//set year=0
		int years = 0;
		//subtract years to find APPROX AGE(not including months)
		years = birthYear - currentYear;
		System.out.println("Approximate Age in years: " + years);
		return years;

	}
	
	//use patients blood count to check if deceased
	@Override
	public boolean isDeceased() {
		
		//blood count is in billions	
		if (bloodCount>10) {
			System.out.println("The patient is healthy and alive.");
			return false; //false=alive

		}
		else {
			System.out.println("The patient's blood count is too low. Patient is deceased.");
			return true; //true=deceased
			
		}
	
	}

	//add costs of pathology visit to unpaid bills to return the patient balance
	@Override
    public double returnPatientBalance(double[] unpaidBills) {
		 double totalBill=0;
		 
		//if the patient is prescribed a medicine, the cost is added
		if (this.prescribeMedication == true) {
			
			double anticoagulantCost = 78.72;
			double biopsyCost = 1209.28;
			
			double currentBill = anticoagulantCost + biopsyCost; //add unpaid bills to this
		
			
			//iterate through unpaid bills array to add 
			for(double x: unpaidBills) {
				 totalBill = totalBill + x;
			}
			
			//total bill is the value being returned
			totalBill = totalBill + currentBill;
			
		}
			
		return totalBill;
		
	
	}

	//display class method
	@Override
	public void displayRecord() {
		System.out.println("   ");
		System.out.println( this.getFirstName() + " " + this.getLastName()  +  "'s Pathology Report");
		System.out.println("====================================================");
		System.out.println("Blood Count(billions): " + this.bloodCount);
		System.out.println("Blood Type: " + this.bloodType );	
		System.out.println("Blood Abnornalities: " + this.bloodAbnormality );
	
		if (this.prescribeMedication == true) {
			System.out.println("Prescribed Anticoagulant? " + "Yes");
			System.out.println("Anticoagulant type? Warfarin");
		}
		
		else {
			System.out.println("No anticoagulant prescribed.");
		}
		
	}
}

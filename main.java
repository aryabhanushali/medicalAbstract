package bhanushali.two;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		//give values for date
		Date currentDateRobert = new Date(2021, 10, 19);
		Date birthDateRobert = new Date (2005, 9, 1);
		
		//give array values
		double[] robertUnpaidBills = {100, 75};
		
	
		pathologyRecord Robert = new pathologyRecord("Robert", "Downey", "AB", 23, "Hemophilia", true, robertUnpaidBills);
		//call methods
		double robertTotal = Robert.returnPatientBalance(robertUnpaidBills);
		Robert.displayRecord();
		Robert.isDeceased();
		Robert.calculateAge(currentDateRobert, birthDateRobert);
		System.out.println("Total Bill: " + robertTotal); 
		
	
		Date currentDateSimon = new Date(2021, 9, 7);
		Date birthDateSimon = new Date(2001, 2, 3);
		double [] simonUnpaidBills = {92, 10, 23, 8, 1};
		
		pathologyRecord Simon = new pathologyRecord("Simon", "Cho", "B-", 12, "None", false, simonUnpaidBills);
		double simonTotal = Robert.returnPatientBalance(simonUnpaidBills);
		Simon.displayRecord();
		Simon.isDeceased();
		Simon.calculateAge(currentDateSimon, birthDateSimon);
		System.out.println("Total Bill: " + simonTotal); 
		
		
		
		
		
		
	  
		
		
		Date currentDateA = new Date(2020, 11, 9);
		Date birthDateA = new Date (2004, 9, 1);
		
		double[] amyUnpaidBills = {900, 700, 5, 8};
		medicalHistoryRecord Amy = new medicalHistoryRecord("Amy",  "Johnson", "New Jersey", "Corona Virus", 90, 1.5, amyUnpaidBills);
		double amyTotal = Amy.returnPatientBalance(amyUnpaidBills);
		Amy.displayRecord();
		Amy.calculateAge(currentDateA, birthDateA);
	    Amy.isDeceased();
		System.out.println("Total Bill: " + amyTotal); 
		
		;
	}

}

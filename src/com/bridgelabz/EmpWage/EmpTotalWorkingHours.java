package com.bridgelabz.EmpWage;

public class EmpTotalWorkingHours {

	public static final int isPartTime=1;
	public static final int isFullTime=2;
	public static final int empRatePerHour=20;
	public static final int numWorkingDays=20;
	public static final int maxHrsInMonth=100;
	public static void main(String[] args) {
		calculateWages();
}
	public static void calculateWages() {
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<=maxHrsInMonth && totalWorkingDays<numWorkingDays) {
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			switch(empCheck) {
			case isPartTime:
				empHrs=4;
			break;
			case isFullTime:
				empHrs=8;
			break;
			default:
				empHrs=0;
			break;
			}
			System.out.println("Total Working Hours"+totalEmpHrs);
			totalEmpHrs+=empHrs;
			totalWorkingDays+=1;		
		}
		int totalEmpWage=totalEmpHrs*empRatePerHour;
		System.out.println("Total Employee Wage="+totalEmpWage);		
	}


		

	}



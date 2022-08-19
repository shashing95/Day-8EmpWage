package com.bridgelabz.EmpWage;

public class EmpWagePerMonth {

	public static final int isPartTime=1;
	public static final int isFullTime=2;
	public static final int empRatePerHour=20;
	public static final int numOfWorkingDays=20;
	public static void main(String[] args) {
		findWagesForMonth();
	}
	public static void calculateWageUsingSwitchCase() {
		int empHrs;
		double dailyEmpWage;
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
		}
		dailyEmpWage=(empHrs*empRatePerHour);
		System.out.println("Daily Employee Wage="+dailyEmpWage);
	}
	public static void findWagesForMonth() {
		int empHrs=0,dailyempWage=0,totalEmpWage=0;
		for(int day=0;day<numOfWorkingDays;day++) {
			calculateWageUsingSwitchCase();
			totalEmpWage+=dailyempWage;
		}
		System.out.println("Total Employee Wage="+totalEmpWage);
	}

		

	}



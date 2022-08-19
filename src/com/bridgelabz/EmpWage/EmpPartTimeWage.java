package com.bridgelabz.EmpWage;

public class EmpPartTimeWage {

	public static void main(String[] args) {
		calculatePartTimeWage();
	}
	public static void calculatePartTimeWage() {
		int isPartTime=1;
		int isFullTime=2;
		int empRatePerHour=20;
		int empHrs;
		double dailyEmpWage;
		double empCheck = Math.floor(Math.random()*10)%3;
		if (isFullTime == empCheck) {
			empHrs=8;
		} else if(isPartTime==empCheck){
			empHrs=4;
		} else {
			empHrs=0;
		}
		dailyEmpWage=(empHrs*empRatePerHour);
		System.out.println("Daily Employee Wage="+dailyEmpWage);
	}

	 

	}



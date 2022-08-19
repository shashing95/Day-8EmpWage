package com.bridgelabz.EmpWage;

public class EmpUsingCaseStatement {

	public static final int isPartTime=1;
	public static final int isFullTime=2;
	public static final int empRatePerHour=20;
	public static void main(String[] args) {
		calculateWageUsingSwitchCase();
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

	

	}



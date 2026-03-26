package com.javaintro;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		String employeeName = "srikanth";
		int empid=9989;
		int salary = 5000;
		float DA = .05f;
		float GST= .07f ;
		float PF = .03f;
		double totalsalary =  salary + salary*DA - salary*GST - salary*PF ;
		System.out.println("Net montly salary of employee is : " + totalsalary);
		System.out.println("Net Annual salary of employee is : " + totalsalary*12 );
		
		
		
	}

}

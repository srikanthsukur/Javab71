package com.javaintro;

public class Bank {

	// instance variables
	int accountNumber;
	String accountHolderName;
	int balance;

	// Static variables
	static String branch;
	static String bankName;

	public static void main(String[] args) {
		// Object creation to access instance variables
		Bank b1 = new Bank();

		b1.accountNumber = 10678;

		b1.accountHolderName = "srikanth";
		b1.balance = 2345;

		System.out.println("User 1 bank details : ");
		System.out.println("Account holder name is : " + b1.accountHolderName);
		System.out.println("Account number is :" + b1.accountNumber);
		System.out.println("Balance : " + b1.balance);

		branch = "Karimnagar";
		bankName = "Hdfc Bank";

		System.out.println(bankName);
		System.out.println(branch + "\n\n");

		Bank b2 = new Bank();

		b2.accountNumber = 22678;
		b2.accountHolderName = "Ravi";
		b2.balance = 12345;

		System.out.println("User 2 bank details : ");
		System.out.println("Account holder name is : " + b2.accountHolderName);
		System.out.println("Account number is :" + b2.accountNumber);
		System.out.println("Balance : " + b2.balance);

		System.out.println(bankName);
		System.out.println(branch + "\n\n");

		Bank b3 = new Bank();

		b3.accountNumber = 56678;
		b3.accountHolderName = "vinay";
		b3.balance = 9345;

		System.out.println("User 3 bank details : ");
		System.out.println("Account holder name is : " + b3.accountHolderName);
		System.out.println("Account number is :" + b3.accountNumber);
		System.out.println("Balance : " + b3.balance);

		System.out.println(bankName);
		System.out.println(branch);

	}

}

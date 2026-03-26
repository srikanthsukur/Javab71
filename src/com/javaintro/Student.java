package com.javaintro;

public class Student {
	int rollno;
	String name;
	String emailid;
	String address;
	
	static { int a = 567;
	System.out.println(a);}
	
	
	
		public static void main(String[] args) {
		Student s1= new Student();
		s1.rollno=9091;
		s1.name="Srikanth" ;
		s1.emailid="srikanthss@gmail.com";
		s1.address="3-8-112/9, srd";
		System.out.println(" Student name : " + s1.name +"\n roll no : "+ s1.rollno + "\n Email id :" + s1.emailid + "\n Address : " + s1.address + "\n");
		
		Student s2= new Student();
		s2.rollno=9092;
		s2.name="vinay" ;
		s2.emailid="vinaysss@gmail.com";
		s2.address="3 112/9, srd";
		System.out.println(" Student name : " +s2.name +"\n roll no : "+ s2.rollno + "\n Email id :" + s2.emailid + "\n Address : " + s2.address+ "\n");
		
		Student s3= new Student();
		s3.rollno=9093;
		s3.name="yash" ;
		s3.emailid="yashhhs@gmail.com";
		s3.address="8-112/9, srd";
		System.out.println(" Student name : " +s3.name +"\n roll no : "+ s3.rollno + "\n Email id :" + s3.emailid + "\n Address : " + s3.address+ "\n");
		
		Student s4= new Student();
		s4.rollno=9094;
		s4.name="vishwa" ;
		s4.emailid="vishwass@gmail.com";
		s4.address="3-8, srd";
		System.out.println(" Student name : " +s4.name +"\n roll no : "+ s4.rollno + "\n Email id :" + s4.emailid + "\n Address : " + s4.address+ "\n");
		
		Student s5= new Student();
		s5.rollno=9095;
		s5.name="sanju" ;
		s5.emailid="sanjudrs@gmail.com";
		s5.address="3-8, hyd";
		System.out.println(" Student name : " +s5.name +"\n roll no : "+ s5.rollno + "\n Email id :" + s5.emailid + "\n Address : " + s5.address+ "\n");
		
	}

}

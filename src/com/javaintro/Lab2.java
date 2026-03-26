package com.javaintro;

public class Lab2 {
	static int count = 0;
	{
		count = count+1;
		System.out.println(count);
		
	}
	
	public static void main(String [] args) { 
		
		Lab2 obj1 = new Lab2();
		
		Lab2 obj2 = new Lab2();
		
		Lab2 obj3 = new Lab2();
		
		Lab2 obj4 = new Lab2();

		

		
		
		
     
	} 
	
	/*
	static Lab2 t = new Lab2();
	
	void method1() {
		System.out.println("this is instance method");
		method2();
	}
	static void method2() {
		System.out.println("This is static method");
	}
	public static void main(String[]args) {
		
		System.out.println("Main method started");
		
		t.method1();
		
		System.out.println("Main method ended");
	}  */
	
	
/*	static  {
		 Lab2 s1 = new Lab2();
		 s1.method3();
		 s1.method4();	
	}
	static void method1(){
		System.out.println("Method 1 called!!");
		method2();
	}
	static void method2() {
		System.out.println("method 2 called!!");
	}
	void method3(){
		System.out.println("Method 3 called!!");	
	}
	void method4() {
		System.out.println("method 4 called!!");
		method1();
	}

	public static void main (String[]args) {
		System.out.println("Main method started");
		System.out.println("Main method ended");
	}
	    */
	

}

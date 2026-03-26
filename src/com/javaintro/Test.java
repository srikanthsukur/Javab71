package com.javaintro;

	

class test1 {
	//Types of Garbage collection
	
	//3. objects inside methods
	static void meth1() {
		System.out.println("Static method called");
		Test t = new Test();
	}
}
	class A{
		B b;
	}
	class B{
		A a;
	}


	public class Test {
		
		public static void main (String[]args) {
			System.out.println("Main method started");
			Test t1=new Test();
			Test t2=new Test();
			
			System.out.println("This is t1 address : "+t1 );
			System.out.println("This is t2 address : "+ t2);
			t1=null;//1. nullifying 
			System.gc();
			System.out.println("This is t1 address : "+t1);
			System.out.println("This is t2 address : "+ t2);
			
			
			t2=t1; //2. re-assigning
			System.out.println("This is t1 address : "+t1);
			System.out.println("This is t2 address : "+ t2);
			
			test1.meth1();
			new Test(); //4. anonymous objects i.e creating objects without assigning variables 
			System.out.println("Main method ended");
		   
			//5. island of isolation
		   A obj1=new A();
		   B obj2= new B();
		   obj1.b=obj2;
		   obj2.a=obj1;
		   			
			obj1=null;
			obj2=null;
		   System.out.println(obj1);
		   System.out.println(obj2);
		}
		
	
	
	
	

}

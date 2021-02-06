package com.java.oops;

import java.util.Scanner;

class Employee {// access specifier DEFAULT

	public String empId;
	public String empName;
	public long empNumber;//INSTANCE VARIABLES
	public String empAddress;

	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + empId);
		System.out.println("Customer Name : " + empName);
		System.out.println("Contact Number : " + empNumber);
		System.out.println("Address : " + empAddress);
		System.out.println();
//		Customer demo = new Customer();//case 3
	}

}

class Arithmetic{
	int add (int a,int b){
		int result;// the scope of the result is in this method only
		result = a+b;
		
		return result;
	}
	
	int add (int a,int b, int c){
		int result;// the scope of the result is in this method only
		result = a+b+c;
		
		return result;//when return is encountered , the control is reverted to 
		// the point of call
//		System.out.println("end");
	}
	
	void product(int x,float y) {
		System.out.println(x*y);
	}
	
	void product(int x,float y,int z) {
		System.out.println(x*y*z);
	}
	

}

class Score{
	void mathMarks(int marks, String name){
		System.out.println("The marks of "+name+" is :"+marks);
		
		
	}
	
	void mathMarks(String fullName ,int score){
		System.out.println("The marks of "+fullName+" is :"+score);
	}
	
	void defect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you emp ID");
		int empId = sc.nextInt();// byte short int long
		
		System.out.println("Enter you gender");
		String gender = sc.next();// input w/o spaces
		
//		the solution for below problem is 
//		we have to flush 
		sc.nextLine();//FLUSHING
		
		
		System.out.println("Enter you full Name");
		String fullName = sc.nextLine();//input having spaces
		// The problem here is the above statement is getting skipped
//		int -> String   nextLine()   this gets skipped
//		byte short int long may give this same prolem
		
		
		

		
		
		System.out.println("Your EmpID is :"+empId);
		System.out.println("Your full name is :"+fullName);
		System.out.println("Your gender is :"+gender);
	}
}



public class DAy2Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Arithmetic a=new Arithmetic();
		System.out.println(new Arithmetic().add(5, 4));// ANONYMOUS OBJECT
		System.out.println(new Arithmetic().add(5, 4,5));
		// METHOD OVERLOADING
//		method name
//		no of parameters
//		type of parameters
//		order sequence
		
		
		Score score = new Score();
//		score.mathMarks(55, "Suman");
//		score.mathMarks("Kartikey", 90);
		score.defect();
		Arithmetic art = new Arithmetic();
		art.product(10, 20);// numeric type promotion
		
		
		
	}

	
	void main(){
		System.out.println("Hi main method");
	}
}

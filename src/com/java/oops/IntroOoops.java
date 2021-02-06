package com.java.oops;
//import java.lang.*;

class Customer {// its like a blueprint

	public String customerId;
	public String customerName;//
	public long contactNumber;//INSTANCE VARIABLES
	public String address;

	public void displayCustomerDetails() {
		int dummy = 0;// local variable
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
//		Customer demo = new Customer();//case 3
	}	
}





class IntroOoops {

	public static void main(String[] args) {

		// Object creation
		Customer person1 = new Customer();
		person1.displayCustomerDetails();

		// Assigning values to the instance variables
		person1.customerId = "C101";
		person1.customerName = "Stephen Abram";
		person1.contactNumber = 7856341287L;
		person1.address = "D089, St. Louis Street, Springfield, 62729";

		// Displaying the customer details
		person1.displayCustomerDetails();
		// Move the above statement immediately after the object creation
		// statement and observe the output
		
		Customer Robert = new Customer();//Referring / instace ref/ object refernce (ROBERT
		
		Robert.customerId = "C102";
		Robert.customerName = "Robert Frost";
		Robert.contactNumber = 7856342557L;
		Robert.address = "Whitefiled , Bangalore";

		// Displaying the customer details
		Robert.displayCustomerDetails();
		// Move the above statement immediately after the object creation
		// statement and observe the output
		
		Customer demo = new Customer();// 3rd object
		demo.displayCustomerDetails();
		
		new Customer().displayCustomerDetails();// Anonymous Object//4th object
		// An object w/o a reference is called a garbage object
		Robert = null;//case 1
		
		
		person1 = new Customer();//case 2
		
		person1.customerName="VIRAT KOHLI";
		Customer ref;
		ref=person1;
		person1=null;
		ref.displayCustomerDetails();
		
//		Robert.displayCustomerDetails();
//		Garbage Collector- Automatically runs and cleans the Garbage OBJECT
//		IntroOoops introOops = new IntroOoops();
//		introOops.main(args);// RECURSIVE CALL
	}

}
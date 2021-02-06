package com.java.oops;

class BankAccount{
	String name;
	String branchName;
	String ifsc="747hg";
	long acNo;
	int balance;
	boolean loanAcquired;
	
	void info() {
		System.out.println("name : "+this.name+"\n"+"branch : "+this.branchName+"\n"+"AC no : "+this.acNo);
	}
	
	
	BankAccount(){//PARAMETERLESS default Constructor
		System.out.println("Constructor call ");
	}// it returns the reference of OBJECT
	
	
	BankAccount(String name,String branchName,String ifsc, int balance){//Parameterized Constructor defined EXPLICITLY
//		name=name;//shadowing
//		constructor has no return type written
		
//		public int a=5;
		this.name = "sumu ";
		this.branchName = branchName;
		this.ifsc = ifsc;
		this.balance=balance;
		System.out.println("Account created SUCCESS");
		
		
	}
	
	void showBalance() {
		System.out.println("Your BALANCE is : ₹"+this.balance);
	}
	
}


public class Day2Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount kartikey = new BankAccount("Kartikey","RANCHI","RN758",100);
//		kartikey.name="kartikey"; // its not a good idea 
		
		BankAccount dummy = new BankAccount();
		kartikey.info();
		kartikey.showBalance();
		
		
	}
}

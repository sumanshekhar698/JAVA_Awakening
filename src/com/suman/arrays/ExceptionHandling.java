package com.suman.arrays;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");

		int size=sc.nextInt();
		int num[]= new int[size];
		
		int start=0;
		for (int i = 0; i < num.length; i++) {
			num[i]= start++;
			
		}
		
		
		System.out.println("Array is being printed");
		try {
		for (int i = 0; i <= num.length; i++) {
			System.out.println(num[i]);// Logical error is called exception

		}
		
		}
		
		catch (Exception e){// Exception is parent of all the Exception classes
			System.out.println(e.getMessage());
			System.out.println("Risky lines in control");
		}
//		try -catch-finally
//		try-finally
//		only try block - invalid
		
		
		finally {
			System.out.println("This will be executed at any cost");
			sc.close();
			//We can include resource shutting codes here
		}
		
		
	}

}

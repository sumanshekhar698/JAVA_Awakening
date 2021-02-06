package com.suman.assignments;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows for MATRIX 1");
		int rows1=sc.nextInt();

		System.out.println("Enter number of cols for MATRIX 1");
		int col1=sc.nextInt();
		
		System.out.println("Enter number of rows for MATRIX 2");
		int rows3=sc.nextInt();

		System.out.println("Enter number of cols for MATRIX 2");
		int col2=sc.nextInt();

		
		int [][] a = new int[rows1][col1];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter "+i+"th "+" and"+j+" th element");
				a[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] +" ");
				
			}
			System.out.println();
		}	
	}

}

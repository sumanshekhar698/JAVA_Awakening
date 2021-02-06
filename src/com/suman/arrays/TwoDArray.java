package com.suman.arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 27 50 62 41 35
		// 55 88 25 45 12
		// 12 52 14 55 44
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();

		System.out.println("Enter number of cols");
		int col=sc.nextInt();
//		REGULAR 2D ARRAY
		
		int [][] a = new int[rows][col];
		
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

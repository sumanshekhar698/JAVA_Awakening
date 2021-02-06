package com.suman.arrays;

import java.util.Scanner;

public class TwoDJaggeredArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 27 50 62 41 35
		// 55 88 25 45 12
		// 12 52 14 55 44 //rectangular symmetry
		
		// 27 50 62 41 35 45
		// 55 88 25 45
		// 12 52 14 55 44//no symmetry 2D array- 2D jaggered array
		//JAGGERED ARRAY 2D
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number of rows :");
		int rows=3;

		
		
		int a [][]=new int[rows][];
		a[0]=new int[6];
		a[1]=new int[4];
		a[2]=new int[5];
		
		
		int desiredRows=sc.nextInt();
		
		int b [][]=new int[desiredRows][];
		for (int i = 0; i < b.length; i++) {
		int element =sc.nextInt();
			b[i]=new int[element];
		}
		
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter "+i+"th "+" and"+j+" th element");
				a[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("The "+i+"th "+" and"+j+" th element is"+a[i][j]);	
			}
		}
//		2D MATRIX
//		2 MATRIX ADDITION
//		MULTIPLICATION
//		INVERSE
//		ROTATE 90 degree
	
		
	}
}

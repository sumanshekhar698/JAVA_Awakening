package com.suman.assignments;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [][] mat1=new int[3][];
		
//		 1 2 3     7 8
//		 4 5 6     9 10
//   |2*3|         11 12  |3*2|    -> MATRIX multiplication possible 
//		 
//		 
//		 RESULTANT ->  2*2 matrix
//		 58  64
//		 139 154
		 
		 
//		int [][] mat1=new int [3][];
		int [][] mat1 = {{1,2,3},{4,5,6}};
		int [][] mat2 = {{7,8},{9,10},{11,12}};
		
		boolean verify = check(mat1[0].length,mat2.length);
		//VERIFICATION FOR MATRIX MULTIPLICATON
			if (verify) {
			int [][] resultMatrix = new int [mat1.length][mat2[0].length];//*
			multiply(resultMatrix,mat1,mat2);
			
			

			
		}
		
		else {
		System.out.println("MATRIX multiplication not possible");
		System.exit(0);
		}
				
		
	}

	private static void multiply(int[][] resultMatrix, int[][] mat1, int[][] mat2) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[i].length; j++) {
				
				for (int k = 0; k < mat2.length; k++) {//Summing and multiplying the elements
					
					sum = sum + mat1[i][k]*mat2[k][j];

				}
				resultMatrix[i][j]=sum;
				sum = 0;
			}
		}
		
		//printing the resultant matrix
		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[i].length; j++) {
				System.out.print(" "+resultMatrix[i][j]);
			}
			System.out.println();
		}
		
		
	}

	private static boolean check(int length1, int length2) {
		// TODO Auto-generated method stub
		if (length1 == length2)
		return true;
		return false;
	}

}

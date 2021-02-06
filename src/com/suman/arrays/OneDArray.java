package com.suman.arrays;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,5,22,66,45,85};
	//arays are object
//		System.out.println(args.length);
		int i=0;
		int j=a.length-1;
		//double pointer technique
		while(i<j){
			int temp;
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			if(i<j) {
				i++;
				j--;
			}	
		}
		
		//printing
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k]+" ");
		}
		System.out.println(a);
		int []b=a.clone();//makes an independent 2nd arrays
		
		
//		MATRIX 2D
		//addition 
		//multiplication i,j    j,k
		//transpose  
		//rotate 90degree either  left right
	
		
	}

}

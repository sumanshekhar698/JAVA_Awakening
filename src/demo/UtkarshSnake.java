package demo;

import java.util.Scanner;
class UtkarshSnake{
    public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   System.out.print("Enter number of rows");
   int n= sc.nextInt();

   // Q snake number
   //1) 1
   //2) 3,2         firstElement =i+count
   //3) 4,5,6
   //4) 10,9,8,7
   //5) 11,12,13,14,15

   int count =1;
   int backup =0;


   for (int i=1 ;i<=n ; i++)
   {//outer loop

  for (int j=0;j<=i ; j++){  //inner 1st// for odd rows
	  if(i%2==0) {
	      
	       backup = count;
	       backup = i+count-1;
	       for (int k = backup; k > count; k--) {
	    	  System.out.print(" "+k);
		}
	  }backup =count;
	  
	      if(i%2==1)  {
	    	   for (int l=backup+1;l<=i ; l++){
	    		System.out.println(l+" ");   
	       }
	           //Fira code , Souce code pro   - Fong Lignatures
	          }
  }
      
    count =backup;
     System.out.print("\n");//Fira code , Souce code pro   - Fong Lignatures
   }

 }
}



package demo;

public class NumberSwap {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		swap(a,b);//a,b actual parameters
	}
	
	
	private static void swap(int c, int d) {//signature of method
		//c,d formal parameters
		// TODO Auto-generated method stub
//		System.out.println();
		
		System.out.println("Before Swapping"+c+" "+d);
//		c=c+d;
//		d=c-d;
//		c=c-d;
				
//		c=c*d;
//		d=c/d;
//		c=c/d;
		
		//XOR ^
		// 
//		0 ^ 1  - 1 
//		1 ^ 0  - 1
//		0 ^ 0  - 0
//		1 ^ 1  - 0
//	>> left shift 
		
		c=c^d;  // ^ carat  power ^ XOR gate  different 1 same 0
		d=c^d;
		c=c^d;
		System.out.println("After Swapping"+c+" "+d);}

	

	}



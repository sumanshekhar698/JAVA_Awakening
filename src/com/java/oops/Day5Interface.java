package com.java.oops;




interface Brand {
	String processor ="TEXAS";
	
}


interface Color{
	String color = "Grey";
}

interface Calculator extends Brand,Color {// Multiple implementation is allowed
	// interface cannot contaion concrete method
	// but it can contain static methods
	// multple iplmentaion  is possible
	
	float pi=3.141f;// variables an interface are final,public,static by itself
	
	
	abstract int add(int a, int b);
	abstract int mul(int a, int c);
	
	static int display(){//it can contain static methods
		System.out.println("The result is :");// this keyword cannot be used here
		return 0;
		
	}
	
 //	void showBrand(){  not static concrete methods arent allowed in an interface
//		System.out.println("The brand is:");
//	}
	
	default float power(int a, int b) {// default methods are also permissible
		int result =(int)Math.pow(a, b);// pow method throws double
		System.out.println("The power is :"+result);
		return 0;
	}
		
	
	
}


class BuisnessCalcy  implements Calculator{

//class BuisnessCalcy extends Zomato implements Calculator{
//	BuisnessCalcy(String food, String restraunt) {
//		super(food, restraunt);
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public int add(int a , int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}






public class Day5Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator c = new Calculator();
//*		interface cannot be instantiated by normal procedure but it can be created by some different means
		
		BuisnessCalcy orpat = new BuisnessCalcy();
		orpat.power(5,2 );
		System.out.println(orpat.color);
		
		
		
	}

}

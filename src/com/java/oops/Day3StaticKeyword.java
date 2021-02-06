package com.java.oops;

class Zomato{
//	static  method,block,variables
//	 static element gets loaded first
	
	String restaurant;
	static private int counter = 1015;
	int billNumber;
	String food;
	
	Zomato(String food, String restraunt){
	this.food=food;
	this.restaurant=restaurant;
	this.billNumber= ++ counter;
}
	
	void orderDetails() {
		System.out.println("***********************\n"+"ORDER DETAILS\n");
		System.out.println("FOOD -> "+this.food);
		System.out.println("BILL NUMBER -> " + this.billNumber);
		
	}
	
	static int noOfOrders(){
		return counter;
	}
	// inside it you cannot use nonstatic stuff(object attributes)
	
}


 class Day3StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zomato motu = new Zomato("CBM","Santa Delivers");
		Zomato kartikey = new Zomato("Black Dog","Avishar");
		Zomato sumu = new Zomato(" Green Salad", "Shimla Biryani");
		
		
		motu.orderDetails();
		kartikey.orderDetails();
		sumu.orderDetails();
		
		
		System.out.println("ORDERS TODAY :"+Zomato.noOfOrders());
		
		Day3StaticKeyword.main(args);
		
//3 	sorting tech
//		bubble sort
//		merge sort
//		quick sort
//		insertion sort	
// 		binary search , linear search
		
		
		
	}

}

package com.java.oops;

import java.util.Iterator;

class Book{
	String nameOfBook;
	private float priceOfBook;
	int pagesOfBook;
	int edition;
	
	
public float getPriceOfBook() {
		return priceOfBook;
	}

	public void setPriceOfBook(float priceOfBook) {
		this.priceOfBook = priceOfBook;
	}

	
	
		//	void details(int... query) {
		void details(int... query) {
		
		System.out.println("BOOK name : "+this.nameOfBook+"\n Price = ₹"+this.priceOfBook);
	
	for (int i : query) {//for each loop/ enhanced for loop
	System.out.println(i);	
	}
	}
	
	Book(String nameOfBook,int edition){//1st constructor
		this();// always constructor chaining will be first
		System.out.println("1st constructor call");
		this.nameOfBook=nameOfBook;
		this.edition=edition;
		
	}

	Book() {//2nd constructor
		// TODO Auto-generated constructor stub
		System.out.println("2nd constructor call");
		
	}
	
	
}

public class Day3Encapsulation {

	static public  void main(String... kartike) {// dynamic array
		// TODO Auto-generated method stub
//		System.out.println("HELLO");
		
		Book buk = new Book("RS Agarwaal",2021);
//		buk.priceOfBook=600;
//		encapsulation
//		* it enhances security
		buk.setPriceOfBook(666);
		buk.getPriceOfBook();
		buk.details();
	
	
	
	}


}

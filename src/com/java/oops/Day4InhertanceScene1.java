package com.java.oops;

class IPL{
	String pName;
	final String team = "RajasthanRoyals";// read only , declaration necessary
	static int counter = 10;
	String jersey;
	private int price;
	int weight;
	int height;
	float strikeRate;
	int wickets;
	int runs;
	
	
	IPL(String pName)
	{
		this.pName=pName;
		this.jersey= "RR"+ ++counter ;
	}
	
	void display() {
		String pName="null";
		String demo=null;
		System.out.println(this.pName + "\n"+this.jersey+"\n****************\n");//this.varName talks about instance variables
	}
	
	int getPrice(){//accesor
		return this.price;
	}
	
	
	void setPrice(int price){//mutator
		this.price=price;
	}
	
}

public class Day4InhertanceScene1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPL p1 = new IPL("Steve Smith");
		IPL p2 = new IPL("Jofra Archr");
		IPL p3 = new IPL("Ben Stokes");
		
		p1.setPrice(13434343);
		p2.setPrice(54448573);
		p3.setPrice(545464);
		
		
		p1.display();
		p2.display();
		p3.display();
		
//		0.5 million $
//		time = 1 month
		
//		0.5 miilion $
//		time 1 month
		
		
		
	}

}

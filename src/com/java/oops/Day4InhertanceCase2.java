package com.java.oops;


final class Investors{ // final class cannot be extended
//	Parent Object clas
	//Business logic
	String iName;
	float worth;
	
	final void display(){// final methods cannot be overridden
		System.out.println(this.iName+"\n****************\n");//this.varName talks about instance variables

	}
	
}

class Dev{// Parent Object class
	int perfoamance;
	Dev(){
		System.out.println("Grand Parent class called");
	}
}

class Basic extends Dev{//parent class  //multi-level inheritance is possible
	String pName;
	String jersey;
	private int price;
	private int demo;
	int eye=2;
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	int weight;
	int height;
	
	Basic(){
		System.out.println("Basic called after child caled");
	}
//	*Can constructor be private ?   YES , its used for limiting the object creation to a finite number of time
	public Basic(String game) {
		// TODO Auto-generated constructor stub
		System.out.println("I LOVE "+game);
	}


	void display(){
		System.out.println(this.pName + "\n"+this.jersey+"\n****************\n");//this.varName talks about instance variables

	}
	
}


class IPLTeam extends Basic//child class
{
	float strikeRate;
	int wickets;
	static int counter=15;
	int runs;
	IPLTeam(String pName)
	{
//		super(); // write or dont write super() will be there and it will call the default ie 0 parameter constructor
System.out.println(this.eye);
		this.pName=pName;
		this.jersey= "RR"+ ++counter ;
//		super();// similar to this keyword it should be first statement
//		System.out.println(this.demo);//private variables are not inherited
	}
	// inherited methods here
}

class EPL extends Basic{// CODE REUSABILITY
//	1 class cannot extend multiple class so multiple inheritance is not possible
//	neither cyclic inheritance ie A extends B   &  B extends A
//	but multilevel inheritance is possible
//	but it can implement multiple classes
	int goals;
	static int counter=45;
	int asist;
	boolean playing;
	
	EPL(String pName)
	{
		super("Football");// parameterized super("Football") to call parent class parameterized constructor
		// Object class is an inbuilt class which is the parent of all the top classes
		System.out.println(super.eye);// immediate parent
		this.pName=pName;
		this.jersey= "MU"+ ++counter ;
	}
	
	void isPlaying(){//specialized method
		System.out.println("PLAYING STATUS : "+this.playing);
	}
	
	@Override    //annotations
	void display() {// Overridden method
		System.out.println(this.pName + "\n"+this.jersey+"\n"+this.playing+"\n****************\n");//this.varName talks about instance variables
		return;
	}
	
	
}


public class Day4InhertanceCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPLTeam p1 = new IPLTeam("Steve Smith");
		IPLTeam p2 = new IPLTeam("Jofra Archr");
		
		
		IPLTeam p3;
		p3= new IPLTeam("Ben Stokes");
		
		
		p1.setPrice(13434343);
		p2.setPrice(54448573);
		p3.setPrice(545464);
		System.out.println("PRICE :"+p1.getPrice());
		
		
		p1.display();
		p2.display();
		p3.display();
		
		
		System.out.println("\n********FOOT-BALLERS********\n");
		
//		
//		
		EPL f1 = new EPL("MESSI");
		EPL f2 = new EPL("RONALDO");
		
		
		Basic f3;
		f3= new EPL("NEYMAR");//upcasting
//		 upcasting is telling a child to behave like parent
//		f3.isPlaying(); // Specialized method cannot be caled via upcasting
		
//		POLYMORPHISM true
		
		((EPL)(f3)).isPlaying();// downcasting
//		Stop behaving like parent and start behaving like yourself
		
		
//		METHOD OVERLOADING is called pseudo Polymorphism
		Basic b1 = new Basic();
		Basic b2 = new Basic();
		Basic b3 = new Basic();
		Basic b4 = new Basic();
		
		
		
		
		f1.playing=true;
		f1.isPlaying();
		f2.isPlaying();//boolean default value -> false

		
		f1.display();
		f2.display();
		f3.display();
		
	}

}

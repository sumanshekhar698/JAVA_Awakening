package com.java.oops;


abstract class Car{// abstract class can hold var, normal as well as abstract methods
	int fuel;
	abstract void servicing();// abstract method
	abstract void purpous(String type);
	void checkPrice(){
		System.out.println("Your price of vehicle is");
	}
}



abstract class Demo{// its out duty to declare a class as abstract even if one method is abstract
	void demostration(){
		return;
	}//concrete method
}





class RacingCars extends Car{

	@Override
	void servicing() {
		// TODO Auto-generated method stub
		System.out.println("Servicing very frequent");
	}

	@Override
	void purpous(String type) {
		// TODO Auto-generated method stub
		System.out.println("Used to RACE");
	}
	
}



class Sedan extends Car{

	@Override
	void servicing() {
		// TODO Auto-generated method stub
		System.out.println("Servicing not very frequent");
	}

	@Override
	void purpous(String type) {
		// TODO Auto-generated method stub
		System.out.println("Used to commute");

	}
	
}


abstract class Truck extends Car{
	void journey() {
		System.out.println("They travel at night");
	}
	
	abstract void fuelConsumption();
}


class Lorry extends Truck{

	@Override
	void servicing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void purpous(String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void fuelConsumption() {
		// TODO Auto-generated method stub
		
			System.out.println("Depends on truck");
		
	}
	
}




public class Day5Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Truck truck = new Truck();// we cannot instatiate an abstract class
		RacingCars lambo = new RacingCars();
		lambo.fuel=80;
	}

}

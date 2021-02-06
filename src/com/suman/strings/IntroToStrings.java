package com.suman.strings;

public class IntroToStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Strings are sequence of characters
//		Strings are object is JAVA
		int a = 400;
//		a is PRIMITIVE type variable and is not an OBJECT 
//		So JAVA is not a PURE OBJECT ORIENTED Language
//		BUT we can mould our program to a pure OBJECT Oriented APPROACH

//		For This we us WRAPPPER Class
		Integer integerObject = new Integer(5);
//		Deprecation means a new or enhanced technique for the deprecated thing has 
//		been added and the old technique may be removed completely 
//		in near future , So avoid using this
		Integer b = 5000;//new tech
		
		System.out.println(a+b);
		
		String Sb= b.toString();//""+b;
		Sb+="MONKEY";
		
		System.out.println(b+" "+Sb);
		System.out.println(""+545+42+52+"hello"+"99"+1+45);
		
		String fruit = "Tomato";
		String vegetable = "Tomato";//Stored in CP
		
		if (fruit==vegetable) {// == in Strings compare their address
			System.out.println(" References are Equal");
		}
		else
			System.out.println("Refernces arent equal");
		
		vegetable+=" are RED";
		System.out.println(fruit);
		
		String kartikeyVehicle = new String("Beetle");
		String sumuVehicle = new String("beetle");//Stored in NCP
		
		
		if (kartikeyVehicle==sumuVehicle) {// == in Strings compare their address
			System.out.println(" References are Equal");
		}
		else
			System.out.println("Refernces arent equal");
		
		boolean result=sumuVehicle.equals(kartikeyVehicle);//case sensitive check
		
		System.out.println(result);
		boolean vehCheck=sumuVehicle.equals(kartikeyVehicle);
		result=sumuVehicle.equalsIgnoreCase(kartikeyVehicle);//case insensitive check
		System.out.println(result);
		
		//String Concatenation
		String sample = 9 + " "+ "MILES";
		System.out.println(sample);
		sample = 9 + 77+4+10+" "+9+1+2+ "MILES"+"s";//left to  right execte
		System.out.println(sample);
		String name = "Suman Shekhar";
		name=name.toLowerCase();
		System.out.println(name);
		
		String king = "ASHOKA THE GREAT₹";
		result = king.startsWith("a");//case sensitive
		result = king.endsWith("T");
		System.out.println(king.length());
		System.out.println(king.contains("A THE"));
		System.out.println(king.indexOf("RE"));//1st occurence
		System.out.println(king.lastIndexOf("AE"));
		System.out.println(result);
		
		//SUBSTRING
		String reat = king.substring(12,13);//end index is not inclusive
		System.out.println(reat);
		
		
		char[] charArray = king.toCharArray();
		String string = charArray.toString();
		System.out.println((int)'₹');
		int [] ab = {4,525,3};
		
		
		String emailID= "sumu698@gmail.com";
		//REGEX
		emailID.matches("[a-zA-Z0-9]+@[a-zA-Z]{3,}+\\\\.(com|in)");
		
		
	}

}

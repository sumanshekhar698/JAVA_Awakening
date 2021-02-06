package com.suman.assignments;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String king = "AShoka ₹ ₹thE Great$$$";
		String reverseKing="";
		char temp;
		for (int i = king.length()-1; i >=0; i--) {
			
			temp=king.charAt(i);
			reverseKing+=temp;
		}
		
		System.out.println(reverseKing);
		
	}
}

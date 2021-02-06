package com.suman.assignments;

import java.util.Scanner;

public class ConditionalReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		
		
		String input = "today is a great day to go out";
	//HW
		char[] charArray = input.toCharArray();
		
		int i=0;
		int j=input.length()-1;
		char temp;
		//double pointer technique
		int count=1;
		while(i<j){
			
			if (!"aeiouAEIOU".contains(""+charArray[i]) && !"aeiouAEIOU".contains(""+charArray[j])) {
				temp=charArray[i];
				System.out.println(count++);
				charArray[i]=charArray[j];
				charArray[j]=temp;
				i++;
				j--;

			}
			
			else if("aeiouAEIOU".contains(""+input.charAt(i))) {
				System.out.println(count++);

			i++;}
			
			else if("aeiouAEIOU".contains(""+input.charAt(j))) {
				System.out.println(count++);

			j--;}
		}
		
		String output ="";
		for (int k = 0; k < charArray.length; k++) {
			output+=charArray[k];
		}
		
		System.out.println(output);
		
		//APPROACH 1
//			String output1=reverse1(input);
//			System.out.println(output1);
				
		//APPROACH 2
		String output2=reverse2(input);
		System.out.println(output2);
		
	}

	private static String reverse2(String input) {
		// TODO Auto-generated method stub
		String vowels ="";
		String output="";
		for (int i = 0; i < input.length(); i++) {
			if ("aeiouAEIOU".contains(""+input.charAt(i))) {
				vowels += input.charAt(i);
			}
		}
		
		for (int i = 0; i < input.length(); i++) {
			if ("aeiouAEIOU".contains(""+input.charAt(i))) {
				output += vowels.charAt(vowels.length()-1);
				vowels = vowels.substring(0,vowels.length()-1);
			} 
			else {
				output +=input.charAt(i);
			}
			
		}
		
		return output;
		
	}

}

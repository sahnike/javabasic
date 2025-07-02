/*
 * Program to demonstrate the palindrome String
 * */
package MT55_batch;

import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		// first take input from user
		System.out.println("Please Enter the input");
		String input="";
		String output="";
		Scanner sc= new Scanner(System.in);
		input=sc.next();
		System.out.println("The user input is "+input);
		//now reverse the input value
		for(int i=input.length()-1;i>=0;i--) {
			output=output+input.charAt(i);
		}
		System.out.println("the reverse of a string is "+output);
		
		if(input.equals(output))	{
			System.out.println("It is Palindrome");
		}	
		else 
			System.out.println("It is not a Palindrome");
	}

}

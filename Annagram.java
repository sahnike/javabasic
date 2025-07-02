/*
 * Program to check whether the given string 
 * is anagram String or not eg. string "heart" and "earth" 
 * are anagram because both strings having the same alphabet
 */

/* logic
 * 1. First check the length of string is same or not
 * 
 */

package MT55_batch;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First string");
		String string1 = sc.next();
		System.out.println("You have entered the first String as: "+string1);
		System.out.println("Enter the Second string");
		String string2 = sc.next();
		System.out.println("You have entered the second String as: "+string2);
		// First check if both string length are not same.
		if(string1.length()!=string2.length()) {
			System.out.println("Since the size of string is not same so it is not Anagram string");
		}
		else // if both strings lenth is same then 
		{
			// convert string into arrayofchar
			char ch1[] = string1.toCharArray();// converting String into an arrayofchar
			char ch2[] = string2.toCharArray();// converting String into an arrayofchar
		Arrays.sort(ch1);// sorting the array
		Arrays.sort(ch2);// sorting the array
	System.out.println(Arrays.toString(ch1));
	System.out.println(Arrays.toString(ch2));
		if(Arrays.equals(ch1, ch2)==true) 
		{
		System.out.println("Both are Anagram");	
		}
		else
			System.out.println("both are not Anagram");
		}

	}

}

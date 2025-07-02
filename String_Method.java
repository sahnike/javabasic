/*program to demonstrate the  class String and its method 
*/
package MT55_batch;

import java.util.Scanner;

public class String_Method {

	public static void main(String[] args) {
		String val = "Auto";

		int size = val.length(); // this method return the length of the string
		System.out.println("The size of string is : " + size);

		String upper = val.toUpperCase(); // This method convert string into upper from lower
		System.out.println("the upper case of " + val + " is " + upper);

		String lower = upper.toLowerCase(); // This method convert string into Lower from upper
		System.out.println("The lower case of " + upper + " is " + lower);

		String S1, S2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Frist String");
		S1 = sc.next();
		System.out.println("You have entered the First string as " + S1);
		System.out.println("Please enter the Second String");
		S2 = sc.next();
		System.out.println("You have entered the Second string as " + S2);

		
		 boolean v= S1.equals(S2); // equals method check if both string is same in either true or false
		v=S1.equalsIgnoreCase(S2);
		 System.out.println("both string " +S1+" & "+S2+ " are "+v);
		
		 boolean b1= S1.contains(S2); // method to check the string within a string
		 System.out.println("from the String "+S1+" contains "+S2+" is "+b1);
		  
		 String con= S1.concat(S2); //  method to concatenate the 2 string
		  System.out.println("The concatenation of "+S1+ " and "+S2+" is "+con);
		  
		  char ch= S1.charAt(2); // method to extract the character from string based on index location
		  System.out.println("From  the String "+S1+" the character at 3rd index is "+ch);
		  
		  String S3="Nike";
		  int v2= S3.indexOf("a"); // method to find the index position for a given character
		  System.out.println("the index location of a is "+v2+" from "+S3);
		  
		  String su= S3.substring(1); 
				  System.out.println(su);
				  String Su=S3.substring(1, 3);
				  System.out.println(Su);
	}

}

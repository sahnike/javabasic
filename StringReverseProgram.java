
// Program to demonstrate the reverse of a string
package MT55_batch;

import java.util.Scanner;

public class StringReverseProgram {

	public static void main(String[] args) {
		//String name= "Auto";

		System.out.println("Please enter the input");
		Scanner in= new Scanner(System.in);
		String input= in.next();
		
		String output ="";
		/*
		 * char c1 = name.charAt(0); char c2= name.charAt(1); char c3=name.charAt(2);
		 * char c4=name.charAt(3); System.out.println(c1); System.out.println(c2);
		 * System.out.println(c3); System.out.println(c4);
		 */
		/*
		 * for(int i=3;i>=0;i--) { char c1= name.charAt(i); System.out.print(c1); }
		 */
		System.out.println("Before reversing the String "+ input);
		for (int i=input.length()-1;i>=0;i--) {
			char ch= input.charAt(i);
			output=output+ch;
			
			
		}System.out.println("The reverse string is "+output);

	}

}

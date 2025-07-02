/*
 * Program to demonstrate the String method provided below
 * 
 * */

package MT55_batch;

import java.util.Arrays;

public class String_Methods {

	public static void main(String[] args) {
		String str= "     Automation    ";
		System.out.println("Value of sting str before trim" +str);
		
		System.out.println("Value of sting str after trim" +str.trim());
		
		String str1= "ring";
		System.out.println(str1.replace('r','p'));
		
		String str2= "Automation Testing";
		System.out.println(str2.replace("Automation","Manual")); /*replace string "Automation"
		 														with "Manual"*/
		System.out.println(str2.replaceAll("[a-z]","1")); /* replaces all the 
															small letter into "1"*/
		System.out.println(str2.replaceAll("[A-T]", "2"));/* replaces all the 
															Capital letter into "2"*/
		
		String str3="SpidermanatWall";
		boolean b1=str3.matches("S(.*)");//matches method check with starting
										 // character "S" and rest anything
		System.out.println(b1);
		boolean b2 =str3.matches("(.*)manat(.*)");//matches method check staring with any character
													// and string "manat" at any position and rest anything
		
		System.out.println(b2);
		
		Boolean b3=str3.matches("(.*)l");//matches method check with ending 
											// character "l" and starting can be anything
		System.out.println(b3);

		String str4= "Man on the ground";
		String[] val= str4.split("on");
		System.out.println(Arrays.toString(val));
		
	}

}

/*
 * Program for
 * */

package MT55_batch;


import java.util.Arrays;

public class CountStringElement {

	public static void main(String[] args) {
		int count_Alphabet=0;
		int count_Space=0;
		int count_Digit=0;
		String input="Hello@ Pune_41100***11"; // input provided
	char[] inp=	input.toCharArray();// changing the input string into an array of char
	System.out.println(input.toCharArray()); //  ??
	System.out.println(Arrays.toString(inp));//display the array of char
	for(int i=0;i<inp.length;i++) // iterate the array
	{
		boolean val=Character.isAlphabetic(inp[i]);
		boolean val2=Character.isSpaceChar(inp[i]);
		boolean val3=Character.isDigit(inp[i]);
					
	
		if(val==true)
		{
			count_Alphabet++;
		}
		else if (val2==true)
		{
			count_Space++;
		}
		else if (val3==true)
		{
			count_Digit++;
		}
		
	}
	System.out.println("The count of Alphabet in a string: "+count_Alphabet);
	System.out.println("The count of Space in a string: "+ count_Space);
	System.out.println("The count of Digit in a string: " +count_Digit);
	int count_SpecialChar=(inp.length-(count_Alphabet+count_Space+count_Digit));
	System.out.println("The count of Special in a string: "+count_SpecialChar);
	}
	

}

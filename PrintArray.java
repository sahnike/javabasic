/*Program to demonstarate 
the array printing using Array class method Arrays.toString[datatype] 
*/
package MT55_batch;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		System.out.println("Please enter the total number  of Passenger");
		Scanner obj= new Scanner(System.in);
		int P_count=obj.nextInt();
		int PNR[]= new int[P_count];
		String Passenger_name[]= new String[P_count];
		for (int i=0;i<=(PNR.length-1);i++)
		{
			System.out.println("Please enter the Passenger PNR number");
			PNR[i]=obj.nextInt();
			System.out.println("Please enter the Passenger Name");
			Passenger_name[i]=obj.next();
			//System.out.println(Arrays.toString(PNR[i]));
			//System.out.println(Arrays.toString(Passenger_name[i]));
		}
	System.out.println(Arrays.toString(PNR));
	System.out.println(Arrays.toString(Passenger_name));
		

	}

}

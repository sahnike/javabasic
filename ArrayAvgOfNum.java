/*Program of an Array
for average of student marks*/
package MT55_batch;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAvgOfNum {

	public static void main(String[] args) {
		System.out.println("Please enter the number of subject");
		Scanner obj= new Scanner(System.in);
		int sz= obj.nextInt();
		int marks[]= new int[sz];
		System.out.println("You have entered: "+sz);
		for(int i=0; i<=(marks.length-1);i++)
		{
			System.out.println("Please enter the mark "+ i);
			marks[i]=obj.nextInt();
		}
		System.out.println(Arrays.toString(marks));
		int temp=0;
		for(int j=0;j<=(marks.length-1);j++) {
			temp=temp+marks[j];
		}
		
		int avg=temp/sz;
		System.out.println(avg);
		
		
				
	}

}

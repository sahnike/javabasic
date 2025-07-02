/*
 *Program to find the common elements
 *Between 2 arrays
 * 
 */

package MT55_batch;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElement {

	public static void main(String[] args) {
		System.out.println("enter the array size");
		Scanner sc=new Scanner(System.in);
		int arr_sz=sc.nextInt();
		int[] array1 = new int[arr_sz];
		for (int i=0;i<array1.length;i++)
		{
			array1[i]=sc.nextInt();
		}
		
		int[] array2 = new int[arr_sz];
		for (int j=0;j<array2.length;j++)
		{
			array2[j]=sc.nextInt();
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	
		for(int k=0;k<array1.length;k++) 
		{
			for(int l=0;l<array2.length;l++) {
				if (array1[k]==array2[l])
				{
					System.out.println("the common element are: " +array1[k]);
				}
			}
			
		}
	
	}

	
}

/*
 * Program of an array where 
 * 2 arrays are merged into a single array
 */

package MT55_batch;

import java.util.Arrays;
import java.util.Scanner;

public class Merging2Arrays {

	public static void main(String[] args) {
		System.out.println("Enter the size of an Array: ");
		Scanner sc = new Scanner(System.in);
		int sz= sc.nextInt();
		int array1[] =new int[sz];
		System.out.println("Enter the Array 1: ");
		for (int i=0;i<array1.length;i++)
		{
			array1[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(array1));
		
		int array2[] =new int[sz];
		System.out.println("Enter the Array 2: ");
		for (int j=0;j<array2.length;j++)
		{
			array2[j]=sc.nextInt();
		}
		System.out.println(Arrays.toString(array2));
		
		int array12[]= new int[array1.length+array2.length];
		for(int i=0;i<array1.length;i++)
		{
			array12[i]=array1[i];
		}
		for (int j=0; j<array2.length;j++)
		{
			array12[array1.length+j]= array2[j];
		}
		System.out.println("The merged array: "+Arrays.toString(array12));
	sc.close();	
	}

}

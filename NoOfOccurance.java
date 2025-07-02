/* 
 * Program to demonstrate the occurrence of an 
 * element in a array 
 * */

package MT55_batch;

import java.util.Arrays;

public class NoOfOccurance {

	public static void main(String[] args) {
		int arr1[]= new int[5];
		arr1[0]=20;
		arr1[1]=10;
		arr1[2]=20;
		arr1[3]=40;
		arr1[4]=10;
		int count=1;
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		for(int i=1;i<arr1.length;i++)
		{
			if(arr1[i]==arr1[i-1])
			{
				count++;
			}
			else
			{
				System.out.println("the element at index " +(i-1)+" has occured" +count);
				count=1;
			}
		}
		System.out.println("the element at index " +(arr1.length-1)+" has occured" +count);
	}

}

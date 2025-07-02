//program related to the concept of array
// where user first provide the size of an array
// and then take the value as input and then print the input value in array

package MT55_batch;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the number of student");
		int No_of_student= sc.nextInt();
		System.out.println("The number of student is : "+No_of_student);
		String[] Studentname= new String[No_of_student];
		for(int i=0;i<=No_of_student-1;i++) {
			System.out.println("please enter the student "+ (i+1) +" name:");
			Scanner sc1= new Scanner(System.in);
			Studentname[i]=sc1.next();
			
			
		}
		System.out.println(" the Students name is "+Arrays.toString(Studentname));
		
	}

}

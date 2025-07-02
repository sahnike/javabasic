package MT55_batch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_HandlingArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number");
		try {
		int Array1[]= new int[sc.nextInt()];
		}
		catch(InputMismatchException ref) {
			System.out.println("catch 1 block executed  when user provided string or char");
		}
		catch(NegativeArraySizeException ref1)
		{
			System.out.println("catch 2 block executed  when user provided negative int value");
		}
		finally {
			System.out.println("Finally block executed");
		}
	}
		

}

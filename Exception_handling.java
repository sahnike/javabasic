//Program to demonstrate the try catch block to handle the exception

package MT55_batch;

public class Exception_handling {

	public static void main(String[] args) {
		try { 
		int a=1/0;
		}
		catch(ArithmeticException ref)
		{
		System.out.println("Catch block executed and exception handelled");
		}
		System.out.println("Program ends here");
	}

}

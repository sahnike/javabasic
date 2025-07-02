package MT55_batch;

public class Assignment_5 {

	public static void main(String[] args) {
		// program to demonstrate if else
		
		int hr=29;
		if (hr<=12) 
			System.out.println("Morning");
	
		else if(hr >12 && hr <=15)
			System.out.println("Afternoon");
		else if (hr >15 && hr <=19)
			System.out.println("evening");
		else if (hr > 20 && hr <=24)
		System.out.println("Mid-Night");
		else
			System.out.println("select the correct value");

}
}

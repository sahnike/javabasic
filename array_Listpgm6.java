package MT55_batch;

import java.util.ArrayList;

public class array_Listpgm6 {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("C#");
		al.add("JAVA");
		al.add("Javascript");
		System.out.println("the value of al is "+al);
		ArrayList al2= new ArrayList();
		al2.add("Python");
		al2.add("JAVA");
		al2.add("C#");
		System.out.println("the value of al2 is "+al2);
		al.removeAll(al2);
		System.out.println("The element in al is "+al);
		
		
	}

}

package MT55_batch;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_pgm4 {

	public static void main(String[] args) {
		ArrayList<String> listofString= new ArrayList<String>();
		listofString.add("East");
		listofString.add("West");
		listofString.add("North");
		listofString.add("South");
		System.out.println("the list of string is" +listofString);
		//Collections.fill(listofString, "Middle");
		//System.out.println("the updated value is "+listofString);
		
		ArrayList<String> listofString2= new ArrayList<String>();
		listofString2.add("Delhi");
		listofString2.add("UP");
	Collections.copy(listofString, listofString2);
	System.out.println("the value after copy "+listofString);
	Collections.replaceAll(listofString2, "UP", "AS");
	System.out.println(listofString2	);
	
	}

}

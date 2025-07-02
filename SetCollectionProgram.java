package MT55_batch;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectionProgram {

	public static void main(String[] args) {
		Set<Integer> s1= new HashSet<Integer>();
		s1.add(50);
		s1.add(10);
		s1.add(500);
		s1.add(5);
		s1.add(90);
		s1.add(50);
		System.out.println("Printing the value in set "+s1); // duplicate value removed 
															// when set used. It is use for uniqueness in data
		
		 Iterator<Integer> i= s1.iterator();
		 while(i.hasNext()) {
			 //i.next();
			 System.out.println("Iterating the value "+i.next());
		 }

	}

}

package MT55_batch;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Pgm_Iterator {

	public static void main(String[] args) {
		ArrayList<Integer> ref1= new ArrayList<Integer>();
		ref1.add(50);
		ref1.add(20);
		ref1.add(60);
		ref1.add(1,100);
		System.out.println(" The ArrayList is "+ref1);
		Iterator<Integer> itr=  ref1.iterator();
		while(itr.hasNext()) {
			int a=itr.next();
			System.out.println(a);
		}
	}

}

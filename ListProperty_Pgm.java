package MT55_batch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProperty_Pgm {

	public static void main(String[] args) {
		List<Double> l1= new ArrayList<Double>();
		l1.add(6.35);
		l1.add(6.35);
		l1.add(9.35);
		l1.add(11.35);
		l1.add(null);
		System.out.println(l1);
		List l2= new ArrayList();
		l2.add(12);
		l2.add("Core Java");
		l2.add('a');
		l2.add(12.45);
		System.out.println(l2);
		
		Iterator<Double> it1= l1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}

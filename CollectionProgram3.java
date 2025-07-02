package MT55_batch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionProgram3 {
	public static void main(String[] args) {
	ArrayList<Integer>arrayList	=new ArrayList<Integer>();
	arrayList.add(22);
	arrayList.add(11);
	arrayList.add(33);
	arrayList.add(25);
	arrayList.add(33);
	arrayList.add(33);
	arrayList.add(95);
	arrayList.add(33);

	System.out.println("The ArrayList is: "+arrayList);
	System.out.println("the minimum value from arraylist is "+ Collections.min(arrayList));
	System.out.println("The maximum value from arraylist is " +Collections.max(arrayList));
	System.out.println("The frequency of 33 is " +Collections.frequency(arrayList, 33));
	Collections.sort(arrayList);
	System.out.println("the sorted arraylist is "+arrayList);
	//System.out.println("the sorted arraylist is "  +Collections.sort(arrayList));
	Collections.reverse(arrayList);
	System.out.println("the reverse order is "+arrayList);
	}

}

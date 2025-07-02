package MT55_batch;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List_program4 {

	public static void main(String[] args) {
		ArrayList<Integer> arr_ref1= new ArrayList<Integer>();
		arr_ref1.add(90);
		arr_ref1.add(90);
		arr_ref1.add(100);
		arr_ref1.add(50);
		System.out.println("ArrayList is "+arr_ref1);
		System.out.println("the last index of 90 is "+arr_ref1.lastIndexOf(90));
		ListIterator<Integer> l_itr= arr_ref1.listIterator();
		System.out.println("forword Iterator");
		while(l_itr.hasNext()) 
		{
			System.out.println(l_itr.next());
		}
		System.out.println("Backword Iterator");
		while(l_itr.hasPrevious()) {
			System.out.println(l_itr.previous());
		}
	}

}

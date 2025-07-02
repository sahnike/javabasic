//Program to demonstrate ArrayList
package MT55_batch;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_program {

	public static void main(String[] args) {
		ArrayList<Integer> obj= new ArrayList();
		obj.add(4);
		obj.add(2);
		obj.add(7);
		obj.add(46);
		Collections.sort(obj);
		System.out.println(obj);
		obj.add(0,95);
		ArrayList<Integer> obj2= new ArrayList();
		obj2.add(85);
		obj2.add(95);
		obj2.add(105);
		obj.addAll(obj2);
	//System.out.println(obj2.addAll(0,obj));
		System.out.println(obj);
	boolean bo=	obj2.isEmpty();
	System.out.println(bo);
	ArrayList<Integer> obj3= new ArrayList<Integer>();
	obj3.add(40);
	obj3.add(60);
	obj3.add(80);
	System.out.println(obj3);
	obj3.clear();
	System.out.println("Now obj3 is "+obj3);
	System.out.println("Checking whether Obj3 is empty? "+obj3.isEmpty());
	}

}

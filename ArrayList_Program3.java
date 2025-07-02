package MT55_batch;

import java.util.ArrayList;

public class ArrayList_Program3 {

	public static void main(String[] args) {
		ArrayList<Integer> aref= new ArrayList<Integer>();
		aref.add(10);
		aref.add(20);
		
		ArrayList<Integer> aref2= new ArrayList<Integer>();
		aref2= (ArrayList<Integer>) aref.clone();
		System.out.println(aref2);
		boolean bo=aref2.equals(aref);
		System.out.println(bo);
	}

}

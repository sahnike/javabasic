package MT55_batch;

import java.util.ArrayList;

public class ArrayList2_Program {

	public static void main(String[] args) {
		ArrayList<Integer> ref1=new ArrayList<Integer>();
		ref1.add(20);
		ref1.add(3);
		ref1.add(10);
		ref1.add(5);
		System.out.println("Print the element in ref1 " +ref1);
		// checking where ref1 is having the element 40 
		System.out.println("checking where ref1 is having the element 40 " +ref1.contains(40));
		System.out.println("checking where ref1 is having the element 5 " +ref1.contains(5));
		
		ArrayList<Integer> ref2= new ArrayList<Integer>();
		ref2.add(20);
		ref2.add(10);
		System.out.println("Print the element in ref2 " +ref2);
		
		System.out.println("checking whether element of ref1 contains all the element of ref2: "+ref1.containsAll(ref2));
		
		ArrayList<String> str_ref = new ArrayList<String>();
		str_ref.add("AS");
		str_ref.add("WB");
		str_ref.add("TN");
		System.out.println("the value of str_ref is " +str_ref);
		
		// method to remove the value by object[element]
		str_ref.remove(1);// remove the value at index position 1
		System.out.println("The updated value is "+str_ref);
		str_ref.remove("TN");// remove the value by object
		System.out.println("The updated value is "+str_ref);
		
		ArrayList<String> str_ref1=new ArrayList<String>();
		str_ref1.add("JK");
		str_ref1.add("NL");
		System.out.println("the value of str_ref1 is " +str_ref1);
		str_ref.addAll(str_ref1);
		
		System.out.println("After adding the updated value of str_ref is " +str_ref);
		str_ref1.remove(str_ref);
		System.out.println("After removing the Str_ref the updated value of str_ref1 is " +str_ref1);
		
		
	}

}

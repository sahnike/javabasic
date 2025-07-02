package MT55_batch;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Collection_Map {

	public static void main(String[] args) {
		Map<Integer,String> m1= new HashMap<Integer,String>();
		m1.put(111, "Sony");
		m1.put(222, "Pixel");
		m1.put(333,"iPhone");
		System.out.println("the map m1 is "+m1 );
		System.out.println("Iterating through keys using for each loop & keyset()");
		for (Integer ky :m1.keySet())
		{
			System.out.println("The keys of Map m1 is " +ky);
		}
		System.out.println("Iterating through values using for each loop & values()");
		for(String val: m1.values()) {
			System.out.println("the value of Map m1 is " +val);
		}
		System.out.println("Iterating through pair of set and keys using for each loop & Entryset");
			 for(Entry<Integer, String> e1: m1.entrySet()) {
				 System.out.println(e1);
			 }
				 System.out.println("Iterating through Iterator");
				Set<Entry<Integer,String>> s1= m1.entrySet();
				Iterator i= s1.iterator();
				 while(i.hasNext())
				 {
					System.out.println( i.next());
				 }
			 
	}

}

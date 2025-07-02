package MT55_batch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionProgram {

	public static void main(String[] args) {
		Collection c1 =new ArrayList();
		c1.add(10);
		c1.add(40);
		c1.add(5);
		c1.add(30);
		System.out.println(c1);
		
		Map<Integer,String> m1= new HashMap<Integer,String>();
		m1.put(123, "AAA");
		m1.put(222,"bbb");
		System.out.println("The value of m2 is "+m1);
		
		Map<Integer,String> m2 = new HashMap<Integer, String>();
		m2.put(333, "CC");
		m2.put(444, "dd");
		System.out.println("The value of m2 is "+m2);
		m2.putAll(m1);
		System.out.println("The Updated value of m2 is "+m2);
		m2.putIfAbsent(444, "added value");/* here the key 444 is present 
											so value with key will not be added in m2
											 */										
		System.out.println("The LATEST value of m2 is "+m2);
		
		m2.putIfAbsent(666, "added value");/* here the key 666 is not present 
		so value with key will  be added in m2
		 */										
System.out.println("The LATEST Updated value of m2 is "+m2);

m2.putIfAbsent(777, "CC");/* here the VALUE CC is present .since it is a value
so key and value will be added in m2
 */										
System.out.println("The LATEST value of m2 is "+m2);

boolean b1= m1.equals(m2);
System.out.println("Did m1 and m2 are equal : "+b1);
System.out.println(" Did key 777 avalilabe in m2 " +m2.containsKey(777));
System.out.println(" Did Value CC avalilabe in m2 " +m2.containsValue("CC"));
 m2.remove(666);
 System.out.println("the key 666 with value is removed "+m2);
		
	}

}

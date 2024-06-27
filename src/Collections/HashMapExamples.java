package Collections;

import java.util.HashMap;

public class HashMapExamples {

	public static void main(String[] args) {

		HashMap hm=new HashMap();
		
		//put()
		hm.put(101, "Kiran");//first entry
		hm.put(103, "mahesh");
		hm.put(104, "raghu");
		hm.put(102, "mohan");
		hm.put(106, "ramesh");
		
		System.out.println(hm);
		
		//get
		System.out.println(hm.get(102));
		//values through it's not possible to get the values from the hashmap
		System.out.println(hm.getOrDefault(103, hm));
		
		//remove()
		
//		hm.remove(103);
//		System.out.println(hm);
		
		//clear()
		
//		hm.clear();
//		System.out.println(hm);
       
		//containsVlaue()
		
		System.out.println(hm.containsValue("mohan"));
		
		//size()
		System.out.println(hm.size());
		
		//retrieving operations
		//keyset()==> return the keysets
		System.out.println(hm.keySet());
		
		//values()
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());

		
	}

}

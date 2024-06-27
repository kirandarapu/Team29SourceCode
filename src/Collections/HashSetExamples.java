package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetExamples {

	public static void main(String[] args) {


		HashSet hs=new HashSet();
		
		hs.add("David warner");
		hs.add("virat kohli");
		hs.add(101);
		hs.add(true);
		hs.add(12.12);
		hs.add('D');
		
		hs.add(true);//it doesn't accept duplicate values
		hs.add(null);
		
		//hs.remove(true);
		System.out.println(hs);
		
		//
		System.out.println(hs.isEmpty());//false
		
		System.out.println(hs.contains(null));//true
		
		//sorting is not possible to hashset concept
		
		//union, intersection,differences
		
		HashSet hs1=new HashSet();
		
		hs1.add("David warner");
		hs1.add("Dhoni");
		hs1.add(101);
		hs1.add(false);
		hs1.add(12.12);
		hs1.add('D');
		
		
		//union
		
//		hs.addAll(hs1);
//		
//		System.out.println(hs);
		
		
		//intersection
	
//		hs.retainAll(hs1);
//		System.out.println(hs);
		
		//differences
		
//		hs.removeAll(hs1);
//		
//		System.out.println(hs);
		
//		//subset
//		hs.containsAll(hs1);
//		System.out.println(hs);
		

	}

}

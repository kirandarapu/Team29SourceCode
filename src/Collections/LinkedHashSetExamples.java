package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExamples {

	public static void main(String[] args) {
		
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add("David warner");
		lhs.add("virat kohli");
		lhs.add(101);
		lhs.add(true);
		lhs.add(12.12);
		lhs.add('D');
		
		lhs.add(true);//it doesn't accept duplicate values
		lhs.add(null);
		
		System.out.println(lhs);
		
		LinkedHashSet lhs1=new LinkedHashSet();
		
		lhs1.add("Rahul");
		lhs1.add("Roman");
		lhs1.add(111);
		lhs1.add(true);
		lhs1.add(12.12);
		lhs1.add('D');
		//union
		
//		lhs.addAll(lhs1);
//		System.out.println(lhs);
		
		//intersection
//		lhs.retainAll(lhs1);
//		System.out.println(lhs);
		
		//differences
		
		lhs.removeAll(lhs1);
		System.out.println(lhs);
		
		//remove()
		//contains()
		//isEmpty()
		//addAll()
		//removeAll

	}

}

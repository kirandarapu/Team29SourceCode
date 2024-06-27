package Collections;

import java.util.LinkedList;

public class LinkedListExamples {

	public static void main(String[] args) {


		LinkedList ll=new LinkedList();
		
	
		ll.add("David");
		ll.add("dhoni");
		ll.add(100);
		ll.add(111.111);
		ll.add(false);
		ll.add('k');
		//add first
		
		ll.addFirst("Virat");
		
		//addlast()
		ll.addLast(123);
		
		
		
		System.out.println(ll);
		
		//remove()
		ll.remove(4);
		System.out.println(ll);
		
		//remove first()
		//remove last()
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		

	}

}

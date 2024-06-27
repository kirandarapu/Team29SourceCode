package Collections;

import java.util.PriorityQueue;

public class PriorityQueueExamples {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		
		//insert the values  
		
		//FIFO==>first in first out
		
		//add()
		//offer()
		pq.add("manual");
		pq.offer("Automation");
		pq.add("API");
		pq.add("Database");
		
		System.out.println(pq);
		
		//element and peek() =-=> it is retrieve the header elements
		//element ==> exception through
		//peek() ==>null value
		PriorityQueue pq1=new PriorityQueue();
		
//		System.out.println(pq1.element());
		
		System.out.println(pq1.peek());
		
//		//remove()
//		pq.remove();
//		System.out.println(pq);
//		
//		pq.remove();
//		System.out.println(pq);
//		
//		pq.remove("manual");
//		System.out.println(pq);
		
		
		//remove and poll()
		
		pq1.poll();
		System.out.println(pq1);
		
		pq1.remove();
		System.out.println(pq1);
//		pq.poll();
//		System.out.println(pq);
		
		
	}

}

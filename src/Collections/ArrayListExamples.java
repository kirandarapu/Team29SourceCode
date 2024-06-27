package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {

		////syntax of arraylist
		// //homogenouse values
		//		ArrayList<Integer>obj=new ArrayList<Integer>();
		//		obj.add(101);
		////heterogeneous values
		//		ArrayList obj1=new ArrayList();
		//		
		//		obj1.add("software testing");
		//		obj1.add(108);
		//		
		//	//List obj3=new ArrayList();


		//create arraylist

		ArrayList ar=new ArrayList();

		//add method

		ar.add(111);
		ar.add(true);
		ar.add("Tester");
		ar.add('D');
		ar.add(11.11);
		System.out.println(ar);
		
		//remove()
		
		ar.remove(3);
		System.out.println(ar);
		
		//get 
		
		System.out.println(ar.get(2));
		
		//set() ==> updation purpose
		
		ar.set(2, "automation Tester");
		System.out.println(ar);
		
		//size()
		System.out.println(ar.size());
		
		//isEmpty()
		
		System.out.println(ar.isEmpty());//false
		
		//contains()
		
		System.out.println(ar.contains(11.11));
		
		//sort
		//ascending order
		
		
		ArrayList ar2=new ArrayList();
		ar2.add(111);
		ar2.add(101);
		ar2.add(12);
		ar2.add(115);
		Collections.sort(ar2);
		System.out.println(ar2);
		
		//descending order
		
		Collections.sort(ar2,Collections.reverseOrder());
		System.out.println(ar2);
		
//		shuffle
		Collections.shuffle(ar2);
		System.out.println(ar2);
		
		Collections.shuffle(ar2);
		System.out.println(ar2);
		
		//retriving the all values from the arraylist
		
		//3 approaches (for loop,for each loop,Iterator (interface)
		
		//1st approach(for loop)
		
//		for(int i=0;i<ar2.size();i++) {
//			
//			System.out.println(ar2.get(i));
//		}
		
		//2nd approach (for each loop)
		
//		for(Object obj:ar2) {
//			System.out.println(obj);
//		}
		
		//3rd approach (iterator (interface))
		
		Iterator it=ar2.iterator();
		
		while(it.hasNext()) { //element is available on the arraylist or not
			System.out.println(it.next());
		}





	}

}

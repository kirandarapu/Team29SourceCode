package Collections;

import java.util.Stack;
import java.util.Vector;

public class VectorExamples {

	public static void main(String[] args) {
		
		
		Vector v=new Vector();
		
		Stack s=new Stack();
		
		//add() ==> insert the values into vector
		v.add("David");
		v.add("Kohli");
		v.add("Dhoni");
		v.add(101);
		v.add(false);
		v.add(11.11);
		
		
		//remove()
		v.remove(4);
		System.out.println(v);

	}

}

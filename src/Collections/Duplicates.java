package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		
		 Integer[] a = {1, 2, 3, 1, 2, 4, 5};

	        // Using a HashSet to remove duplicates
	        Set<Integer> set = new HashSet<>(Arrays.asList(a));
	        
	        // Converting back to an array
	        Integer[] uniqueArray = set.toArray(new Integer[0]);

	        System.out.println(Arrays.toString(uniqueArray));
	
	
	}
	}



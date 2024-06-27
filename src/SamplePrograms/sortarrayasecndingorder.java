package SamplePrograms;

import java.util.Arrays;
import java.util.Collections;

public class sortarrayasecndingorder {

	public static void main(String[] args) {
		
		int a[]= {11,9,8,14,26,34};
		
//	  Arrays.parallelSort(a);  //built-in method available in java
//	  
//	  System.out.println(Arrays.toString(a));
	  //2nd approach
	  Arrays.sort(a);
	  System.out.println(Arrays.toString(a));
	  
	  
	  Integer ar[]= {13,24,11,14,12};
	  Arrays.sort(ar,Collections.reverseOrder());
	  
	  System.out.println(Arrays.toString(ar));
	  

	}

}

package SamplePrograms;

import java.util.Arrays;

public class DuplicatesArrays {

	public static void main(String[] args) {
		
		 int[] array = {1, 2, 3, 1, 2, 4, 5};
	        int[] uniqueArray = removeDuplicates(array);
	        System.out.println(Arrays.toString(uniqueArray));
	    }

	    public static int[] removeDuplicates(int[] array) {
	        int n = array.length;
	        if (n == 0 || n == 1) {
	            return array;
	        }
	        
	        // Temporary array to hold unique elements
	        int[] temp = new int[n];
	        int j = 0;
	        
	        // Traverse through the array
	        for (int i = 0; i < n - 1; i++) {
	            if (array[i] != array[i + 1]) {
	                temp[j++] = array[i];
	            }
	        }
	        temp[j++] = array[n - 1];
	        
	        // Copy unique elements back to the original array
	        int[] uniqueArray = new int[j];
	        System.arraycopy(temp, 0, uniqueArray, 0, j);
	        
	        return uniqueArray;

	}

}

package SamplePrograms;



public class RemoveDuplicateValuesInArray {
	public static void main(String[] args) {

		int arr[]= {1,2,3,2,4,5,3};

		int j=1;
		for(int i=0;i<arr.length-1;i++)
		{
          if(arr[i]!=arr[i+1]) {
        	  
        	  arr[j]=arr[i+1];
        	  j++;
          }

		}
		System.out.println("count: "+j);

		
		for(int i=0;i<j;i++) {
			System.out.println(arr[i]);
		}
	}	
}

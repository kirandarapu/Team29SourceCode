package ArraysExamples;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		//declare a array by using 2 approaches
		
		//approach 1:
		
		int a[]=new int[4]; //declaration
		int ar[]= {10,20,30,40};
		//assign the values into array
		//duplicate values ==>
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		//a[4]=50;  //it's not accept increase or decrease the size of an array
		
		System.out.println(a.length);
		//read the individual value from the array
		System.out.println(a[3]);
		
		//read the all values from an array
		
		/* for(int i=0;i<a.length;i++) {//normal for loop
			 
			 System.out.println(a[i]);
		 }*/
		

		for(int x:a) {//for each loop  x=a
			System.out.println(x);
		}
	}

}

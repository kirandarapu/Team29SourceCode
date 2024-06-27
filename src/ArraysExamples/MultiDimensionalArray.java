package ArraysExamples;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		//2 approaches
		//array declaration
		int a[][]=new int[2][3];
		//int ar[][]= {{10,20},{30,40}};
		//assign the values into an array
		
		a[0][0]=10; 
		a[0][1]=20;
		a[0][2]=50;
		a[1][0]=30;
		a[1][1]=40;
		a[1][2]=60;
		
		
		//find the length odf an arrays
		
		
		
		//rows
		System.out.println("rows "+a.length);//2
		
		//columns
		System.out.println("columns "+a[0].length); //3
		//System.out.println(a[1][1]);
		
		//read individual values 
		
		System.out.println(a[0][0]);
		
		//read the all values from an array
		
		for(int i=0;i<a.length;i++) { //outer for loop //it is represents the rows
			
			for(int j=0;j<a[0].length;j++) {//represents the columns
				
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		

	}

}

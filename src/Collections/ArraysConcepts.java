package Collections;

public class ArraysConcepts {
	public static void main(String[] args) {
		
		
		int a[]= {0,0,2,3,3,4,8,9};
		
		int j=1; // i=0 ,j=0
		
		for(int i=0;i<a.length-1;i++)
		{
			
		
			if(a[i]!=a[i+1]) {  //0 !=0
				
				a[j]=a[i+1];  //1 =0+1 ==>1=1
				j++; //1,
			}
		}
		
		System.out.println("numbers: "+j);//6
		
		for(int i=0;i<j;i++) {
			
			System.out.println(a[i]);
		}
		
	}

}

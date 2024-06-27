package ArraysExamples;

public class ObjectArrayExamples {

	public static void main(String[] args) {
		
		//declaration  & values assigning
		//object  ==> store heterogeneous values
		
		Object obj[]= {"Automation",true,11.11,111,'D'};
		
		//read the values from an array
		
		System.out.println(obj[2]);
		
		//read all values from an array
		
		/*for(int i=0;i<obj.length;i++) {
			
			System.out.println(obj[i]);
		}*/
		
		
		for(Object x:obj) {
			
			System.out.println(x);
		}
        
		
		
	}

}

package SamplePackages;

public class UncheckedExceptionExamples {

	public static void main(String[] args) {
		
		
		int a=55;
		int b=0;
		
		String s="Testing";
		int arr[]= {1,2,3,4,5};
		//StringOutofBoundsExceptions
		
		try {
			System.out.println(s.charAt(7));
			
			//System.out.println(arr[7]);
			//System.out.println(s.length());
			//System.out.println(a/b);
		}catch(Exception e)
		{
			e.printStackTrace();//it is give more information about exception,which line of code should get the exceptuion,that information also provide.
		}
	}

}

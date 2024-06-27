package SamplePackages;

import java.io.IOException;

public class CheckedExceptionExamples {

	
		int a=10,b=20,c=0;
		
		void main() throws InterruptedException  {
			//when using throws keyword ,,it is applicable after the method only 
			try {
				System.out.println(a/c);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			Thread.sleep(2000);
		}
	
		
	public static void main(String[] args) throws InterruptedException {
		
		CheckedExceptionExamples c=new CheckedExceptionExamples();
		c.main();
		
	}

}

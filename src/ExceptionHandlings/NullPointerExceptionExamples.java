package ExceptionHandlings;

public class NullPointerExceptionExamples {  //un-chekced exceptions

	public static void main(String[] args) throws  InterruptedException{
		
		
		String s = null; //string is empty
		
		Thread.sleep(1000);
		try {
			
			int len=s.length();
			System.out.println(len);
				 //milli seconds  //java wait statement	
			}catch(Exception e) {
			
			e.printStackTrace();
		}

	}

}

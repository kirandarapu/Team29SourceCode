package ExceptionHandlings;

import java.io.IOException;

public class Sample90 {

	public static void main(String[] args) throws IOException {
		
		try { //implement error code
			
			int a=222;
			
			int result=a/0;
			System.out.println(result);
			
			
		}catch(Exception e) { //catch the exceptions
			
			e.printStackTrace();// more information //while line get the exception
		}finally {
			System.out.println("finally block executed properly...");
		}
		
		//login,registration,forgot password

	}

}

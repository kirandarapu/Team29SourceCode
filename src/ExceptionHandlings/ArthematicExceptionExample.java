package ExceptionHandlings;

public class ArthematicExceptionExample {

	public static void main(String[] args) {

		int a=34;
		try {
			int result=a/0;//error code
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();//it is provide the proper information about the exception
			//and which line of code you will get exception that information also provided
		}


	}

}

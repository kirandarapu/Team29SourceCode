package SamplePrograms;

public class TotalNumberofcharactersinaStringwithoutusinganyloop {

	public static void main(String[] args) {


		String s="java is java and programming java";
		
		char c='a';
		
		System.out.println(s.replace("java", "").length());//39
		int count =s.length()-s.replace("java", "").length();//44  -39=5==a
		          // ==44 -39 ==5
		
//		System.out.println(s.replace("a", "").length());//length //39
		System.out.println("number of 'a' s available in string"+s+ "="+count++);

	}

}

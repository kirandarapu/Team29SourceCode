package SamplePrograms;

public class ReverseaString {

	public static void main(String[] args) {

		String str="Testing";//7 -6
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			//""+gnitset
		}
		System.out.println(rev);


	}

}

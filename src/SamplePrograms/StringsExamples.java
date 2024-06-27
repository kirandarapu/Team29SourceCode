package SamplePrograms;

public class StringsExamples {

	public static void main(String[] args) {
		
		String s="Selenium tool used for automation Testing";
		
		//contains ==> boolean values(true/false)
		System.out.println(s.contains("for"));
		
		String s1="selenium Tool Used for Automation Testing ,selenium is opensource tool,selenium is a framework";
		
		//equalIgnorance case
		System.out.println(s.equals(s1));//false
		System.out.println(s.equalsIgnoreCase(s1));
		
		//replace
		
		System.out.println(s.replace('o', 'y'));
		System.out.println(s);
		
		System.out.println(s1.replace("selenium", "AutoIT"));
		
		
		//
		

	}

}

package SamplePackages;

public class SwitchCaseStatements {
	
	int day=1;
	
	public void sample(){
	switch (day) {  //pre-defined method
	
	case 1:
		System.out.println("Monday");
	    break;
		
	case 2:
		System.out.println("Tuesday");
		break;
		
	case 3: 
		System.out.println("Wednesday");
		break;
		
	case 4:
		System.out.println("Thurseday");
		break;
	
	case 5:
		System.out.println("firday");
		break;
		
	case 6:
		System.out.println("Saturday");
		break;
	
	case 7:
		 System.out.println("sunday");
		 break;
	
	}
	
	}

	public static void main(String[] args) {
		
		SwitchCaseStatements so=new SwitchCaseStatements();
		so.sample();

	}

}

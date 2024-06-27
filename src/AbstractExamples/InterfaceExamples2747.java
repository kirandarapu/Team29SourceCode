package AbstractExamples;

interface sample123{//interface class  //parent
	
	void employeename();
	
	public void employeesalary();
	

	
	
}

interface sample789 extends sample123{//parent
	
	void employeedesign();
	
	public void employeeid();
}

class sample234 implements sample123,sample789{

	@Override
	public void employeename() {
		
		System.out.println("kiran");
	}

	@Override
	public void employeesalary() {
	
		System.out.println(50000);
		
	}

	@Override
	public void employeedesign() {
		
		
	}

	@Override
	public void employeeid() {
		// TODO Auto-generated method stub
		
	}
	
	
}




public class InterfaceExamples2747 {

	public static void main(String[] args) {
		
		sample234 sam=new sample234();
		sam.employeename();
		sam.employeesalary();
		

	}

}

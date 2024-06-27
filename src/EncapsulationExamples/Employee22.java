package EncapsulationExamples;

public class Employee22 {//child class

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		//set the data  //writing the data
		emp.setSalary(10000);
		emp.setName("Kiran");
		emp.setDesignation("Automation Tester");
		
		//get the data  //reading the data
		
		System.out.println(emp.getSalary());
		System.out.println(emp.getName());
		System.out.println(emp.getDesignation());

	}

}

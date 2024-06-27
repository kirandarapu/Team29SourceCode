package EncapsulationExamples;

 class Employee{ //dafalut access modifier
	
	private int salary;
	private String name;
	private String designation;
	public int getSalary() {//retrieve the salary //read only
		return salary;
	}
	public void setSalary(int salary) {//assign the value// write only
		this.salary = salary;
	}
	public String getName() { //retriev the name //read only
		return name;
	}
	public void setName(String name) {  //set the name //write only
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}



public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

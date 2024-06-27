package SamplePackages;

public class SampleProgram001 {
	
	//instance variables (declare variables inside the class and outside the method)
	int a=10;
	static int c=30;//static variable(declare the variable with int he class and by using static keyword)

	void sum() {
		int b=20;//local variables(declare a variable inside the method )
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		//execution
		
		
		SampleProgram001 sam=new SampleProgram001();
		System.out.println(sam.a);//10
	    sam.sum(); //==>a+b//30
	    System.out.println(SampleProgram001.c); //c value
		
	}

}

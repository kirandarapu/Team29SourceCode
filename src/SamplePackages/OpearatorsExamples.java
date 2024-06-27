package SamplePackages;

public class OpearatorsExamples {
	
	
	static int a=11; //instance variable
	int b=22;
	static int c=33;
	
	public void add() {
		
		System.out.println(a+b);
		
	}
	public void sub() {
		System.out.println(c-b);
		
	}
	
	public void mul() {
		
		System.out.println(a*b);
		
	}
	
	public static void div() {
		System.out.println(c/a);
		
	}
	
	public void modulardiv() {
		
		System.out.println(c/b);
	}

	public static void main(String[] args) {
		
		OpearatorsExamples oe=new OpearatorsExamples();
		
		oe.add();
		oe.sub();
		oe.mul();
		oe.div();
		oe.modulardiv();
		OpearatorsExamples .div();
		//static variables ==> object,classname

	}

}

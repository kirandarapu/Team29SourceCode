package SamplePrograms234;

public class VariablesConcepts {

	int b=14; //global or instance
	static int c=15; //static variable //class variables
	
	public static void main(String[] args) {
		
		int a=13; //local variable(method variable)

		System.out.println(a);
		VariablesConcepts obj=new VariablesConcepts();
		
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(VariablesConcepts.c);
		
	}

}

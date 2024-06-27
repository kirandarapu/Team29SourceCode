package SamplePrograms234;

public class ConstructorExamples {
	
	
	void sum(int b,int c) {
		
		System.out.println(b+c);
	}
	
	public ConstructorExamples(int a,int b) {
		
		System.out.println(a+b);
	}
	public ConstructorExamples(){
		
	}
	
	public ConstructorExamples(int m,int n,int o) {
		
		System.out.println(m+n+o);
	}

	public static void main(String[] args) {
	
		ConstructorExamples obj=new ConstructorExamples(11,12);
		ConstructorExamples obj1=new ConstructorExamples(14,15);
		
		ConstructorExamples obj2=new ConstructorExamples(20,30,50);
		obj.sum(20,30);
		obj.sum(40, 70);
	}

}

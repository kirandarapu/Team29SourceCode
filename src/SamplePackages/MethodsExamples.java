package SamplePackages;

public class MethodsExamples {
	
	static int a=11;
	static int b=22;
	
	//static method
	//static method accept only static variables
	//call static method both ways,1.by using class name 2.by using object
	public static void method1() {
		
		System.out.println(a+b);
		
		
	}
	
	//non-static methods
	//non-static methods accept both type of variables(static and non-variables)
	public void method2() {
		System.out.println(b-a);
	}
	
	public void method3(int x,int y) {
		
		x=15;
		y=16;
		System.out.println(x+y);
	}
	
	public int  method4() {
		int m=22;
		int n=14;
		System.out.println(m+n);
		return n;
	}

	public static void main(String[] args) {//pre-defined method

		//MethodsExamples.method1();
		MethodsExamples me=new MethodsExamples();
		me.method1();//33
		me.method2();//11
		me.method3(14, 16);//30
		me.method4();

	}

}

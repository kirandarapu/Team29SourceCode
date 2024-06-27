package AccessModifiers;

public class Sample456 {
	
	static void method1() {//static method
		
		int a=22;
		int b=33;
		System.out.println(a+b);
		
	}
	//how many way call the static methods

	public static void main(String[] args) {
		//by calling the static method by using object through
		 Sample456 sam=new  Sample456();
		 sam.method1();
		 //by calling the static method by using classname
		 Sample456.method1();
	}

}

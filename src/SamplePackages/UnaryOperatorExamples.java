package SamplePackages;

public class UnaryOperatorExamples {

	int a=22;
	int b=15;
	
	public void sum() {
		
		//a++==> post increment  ==> a==10==>10
		//++a==> pre increment  ==>12
		
		//a--==> post decrement ==> 10
		//--a==>pre decrement ===>8
		System.out.println(++a);//23//post increment
		//System.out.println(++a);//23//pre increment
		System.out.println(a++);
		System.out.println(++a);
		
		System.out.println(b--);//.a.post decrement
		System.out.println(--b);//pre decrement
	}
	
	public static void main(String[] args) {
		UnaryOperatorExamples ue=new UnaryOperatorExamples();
		ue.sum();

	}

}

package OOPSConcepts;

class parent{
	
	public void sum(int a,int b) {
		
		a=10;
		b=20;
		System.out.println(a+b);
	}
}

class child extends parent {
	
	public void sum(int a,int b) {
		
		System.out.println(a+b);
	}
}



public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c=new child();
	    c.sum(15, 16);
//		parent p=new parent();
//		p.sum(10,20);
		
	} 

}

package OOPSConcepts;

class MO{
	//methods name should be same ,but parameters is different
	//no of parameters  or type of parameters or order of parameters
	
	public void sum(int a,int b) {
		
		
		System.out.println(a+b);
	}
	
	public void sum(byte a,byte b) {
		
		System.out.println(a+b);
	}
}




public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MO m=new MO();
		m.sum(11,12);
		m.sum(22, 33);
	}

}

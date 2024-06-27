package AccessModifiers;


 class sampleone{//first class
	
	private int a=44; //private variables
	private int b=55;
	
	void sample002() { //private methods
		System.out.println(a+b);
	}
}

public class Modifiers4 {
	
	private int x=22;
	private int y=33;
	
	private void sample() {
		
		System.out.println(x+y);
		
	}
	
	

	public static void main(String[] args) {
		
		sampleone sam=new sampleone();
		sam.sample002();
		
		Modifiers4 m=new Modifiers4();
		m.sample();
	}

}

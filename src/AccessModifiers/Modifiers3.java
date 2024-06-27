package AccessModifiers;

public class Modifiers3 { //protected class not available in java
	
	protected int a=11;//protected variables
	protected int b=13;
	
	protected void method3() { //protected methods
		
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		Modifiers3 m3=new Modifiers3();
		m3.method3();

	}

}

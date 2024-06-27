package SamplePackages;

public class TernaryOperators {
	
	int x=22;
	int y=11;
	
	public void sample134() {
		
		int c=(x<=y)?x:y;
		 //(condition)?expression1:expression2;
		//condition should satisfy get the expression 1 value
		//condition should not satisfy then get the expression 2
		System.out.println(c);
	}

	static  public void main(String[] args) {
		//public==>access modifier
		//static ==> access modifier

		TernaryOperators to=new TernaryOperators();
		to.sample134();
	}

}
